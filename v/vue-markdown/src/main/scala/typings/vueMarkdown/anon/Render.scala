package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Render extends StObject {
  
  var render: js.Any
  
  var renderAttrs: js.Any
  
  var renderInline: js.Any
  
  var renderInlineAsText: js.Any
  
  var renderToken: js.Any
  
  var rules: Codeblock
}
object Render {
  
  inline def apply(
    render: js.Any,
    renderAttrs: js.Any,
    renderInline: js.Any,
    renderInlineAsText: js.Any,
    renderToken: js.Any,
    rules: Codeblock
  ): Render = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], renderAttrs = renderAttrs.asInstanceOf[js.Any], renderInline = renderInline.asInstanceOf[js.Any], renderInlineAsText = renderInlineAsText.asInstanceOf[js.Any], renderToken = renderToken.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Render]
  }
  
  extension [Self <: Render](x: Self) {
    
    inline def setRender(value: js.Any): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderAttrs(value: js.Any): Self = StObject.set(x, "renderAttrs", value.asInstanceOf[js.Any])
    
    inline def setRenderInline(value: js.Any): Self = StObject.set(x, "renderInline", value.asInstanceOf[js.Any])
    
    inline def setRenderInlineAsText(value: js.Any): Self = StObject.set(x, "renderInlineAsText", value.asInstanceOf[js.Any])
    
    inline def setRenderToken(value: js.Any): Self = StObject.set(x, "renderToken", value.asInstanceOf[js.Any])
    
    inline def setRules(value: Codeblock): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
  }
}
