package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailName extends StObject {
  
  var address: js.UndefOr[PartialIAddress | Null] = js.undefined
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var phone: js.UndefOr[String | Null] = js.undefined
}
object EmailName {
  
  inline def apply(): EmailName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailName]
  }
  
  extension [Self <: EmailName](x: Self) {
    
    inline def setAddress(value: PartialIAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
  }
}
