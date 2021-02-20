package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorMessage extends StObject {
  
  var errorMessage: js.UndefOr[String] = js.native
  
  var shippingOptions: js.UndefOr[js.Array[_]] = js.native
}
object ErrorMessage {
  
  @scala.inline
  def apply(): ErrorMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorMessage]
  }
  
  @scala.inline
  implicit class ErrorMessageMutableBuilder[Self <: ErrorMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setShippingOptions(value: js.Array[_]): Self = StObject.set(x, "shippingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingOptionsUndefined: Self = StObject.set(x, "shippingOptions", js.undefined)
    
    @scala.inline
    def setShippingOptionsVarargs(value: js.Any*): Self = StObject.set(x, "shippingOptions", js.Array(value :_*))
  }
}
