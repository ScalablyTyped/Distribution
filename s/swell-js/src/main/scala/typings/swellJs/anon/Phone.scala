package typings.swellJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phone extends StObject {
  
  var email: js.UndefOr[Boolean] = js.undefined
  
  var phone: js.UndefOr[Boolean] = js.undefined
  
  var shipping: js.UndefOr[Boolean] = js.undefined
}
object Phone {
  
  inline def apply(): Phone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Phone] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: Boolean): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setShipping(value: Boolean): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
  }
}
