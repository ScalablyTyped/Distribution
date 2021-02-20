package typings.summernote.mod.global.Summernote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLinkOptions extends StObject {
  
  var newWindow: Boolean = js.native
  
  var text: String = js.native
  
  var url: String = js.native
}
object CreateLinkOptions {
  
  @scala.inline
  def apply(newWindow: Boolean, text: String, url: String): CreateLinkOptions = {
    val __obj = js.Dynamic.literal(newWindow = newWindow.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLinkOptions]
  }
  
  @scala.inline
  implicit class CreateLinkOptionsMutableBuilder[Self <: CreateLinkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewWindow(value: Boolean): Self = StObject.set(x, "newWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
