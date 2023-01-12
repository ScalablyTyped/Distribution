package typings.vite.anon

import typings.vite.mod.HtmlTagDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Html extends StObject {
  
  var html: String
  
  var tags: js.Array[HtmlTagDescriptor]
}
object Html {
  
  inline def apply(html: String, tags: js.Array[HtmlTagDescriptor]): Html = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Html]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[HtmlTagDescriptor]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: HtmlTagDescriptor*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
