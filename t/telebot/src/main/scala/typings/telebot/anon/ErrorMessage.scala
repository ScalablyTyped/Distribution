package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorMessage extends StObject {
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var shippingOptions: js.UndefOr[js.Array[Any]] = js.undefined
}
object ErrorMessage {
  
  inline def apply(): ErrorMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorMessage] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setShippingOptions(value: js.Array[Any]): Self = StObject.set(x, "shippingOptions", value.asInstanceOf[js.Any])
    
    inline def setShippingOptionsUndefined: Self = StObject.set(x, "shippingOptions", js.undefined)
    
    inline def setShippingOptionsVarargs(value: Any*): Self = StObject.set(x, "shippingOptions", js.Array(value*))
  }
}
