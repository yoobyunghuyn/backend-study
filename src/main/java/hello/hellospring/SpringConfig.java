package hello.hellospring;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// import hello.hellospring.repository.JdbcMemberRepository;
import hello.hellospring.repository.MemberRepository;
// import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;

@Configuration
public class SpringConfig {
    private final MemberRepository memberRepository;

    // @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;   
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
}
