package hello.servlet.web.frontcontroller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Getter @Setter
public class ModelView {
    private final String viewName;
    private final Map<String, Object> model = new HashMap<>();



}
