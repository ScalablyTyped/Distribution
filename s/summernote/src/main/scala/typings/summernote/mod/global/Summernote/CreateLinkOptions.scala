package typings.summernote.mod.global.Summernote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLinkOptions extends StObject {
  
  var newWindow: Boolean
  
  var text: String
  
  var url: String
}
object CreateLinkOptions {
  
  inline def apply(newWindow: Boolean, text: String, url: String): CreateLinkOptions = {
    val __obj = js.Dynamic.literal(newWindow = newWindow.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLinkOptions]
  }
  
  extension [Self <: CreateLinkOptions](x: Self) {
    
    inline def setNewWindow(value: Boolean): Self = StObject.set(x, "newWindow", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
