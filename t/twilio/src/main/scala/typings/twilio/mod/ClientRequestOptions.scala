package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientRequestOptions extends StObject {
  
  var form: js.UndefOr[js.Any] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var url: String = js.native
}
object ClientRequestOptions {
  
  @scala.inline
  def apply(url: String): ClientRequestOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequestOptions]
  }
  
  @scala.inline
  implicit class ClientRequestOptionsMutableBuilder[Self <: ClientRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForm(value: js.Any): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
