package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Render extends StObject {
  
  var render: scala.Any
  
  var renderAttrs: scala.Any
  
  var renderInline: scala.Any
  
  var renderInlineAsText: scala.Any
  
  var renderToken: scala.Any
  
  var rules: Codeblock
}
object Render {
  
  inline def apply(
    render: scala.Any,
    renderAttrs: scala.Any,
    renderInline: scala.Any,
    renderInlineAsText: scala.Any,
    renderToken: scala.Any,
    rules: Codeblock
  ): Render = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], renderAttrs = renderAttrs.asInstanceOf[js.Any], renderInline = renderInline.asInstanceOf[js.Any], renderInlineAsText = renderInlineAsText.asInstanceOf[js.Any], renderToken = renderToken.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Render]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Render] (val x: Self) extends AnyVal {
    
    inline def setRender(value: scala.Any): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderAttrs(value: scala.Any): Self = StObject.set(x, "renderAttrs", value.asInstanceOf[js.Any])
    
    inline def setRenderInline(value: scala.Any): Self = StObject.set(x, "renderInline", value.asInstanceOf[js.Any])
    
    inline def setRenderInlineAsText(value: scala.Any): Self = StObject.set(x, "renderInlineAsText", value.asInstanceOf[js.Any])
    
    inline def setRenderToken(value: scala.Any): Self = StObject.set(x, "renderToken", value.asInstanceOf[js.Any])
    
    inline def setRules(value: Codeblock): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
  }
}
