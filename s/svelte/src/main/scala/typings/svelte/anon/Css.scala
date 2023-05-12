package typings.svelte.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Css extends StObject {
  
  var css: Code
  
  var head: String
  
  var html: Any
}
object Css {
  
  inline def apply(css: Code, head: String, html: Any): Css = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
    
    inline def setCss(value: Code): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: Any): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
