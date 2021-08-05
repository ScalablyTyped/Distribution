package typings.stripe.anon

import typings.stripe.mod.IAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phone extends StObject {
  
  var address: js.UndefOr[IAddress | Null] = js.undefined
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var phone: js.UndefOr[String | Null] = js.undefined
  
  var verified_address: js.UndefOr[IAddress | Null] = js.undefined
  
  var verified_email: js.UndefOr[String | Null] = js.undefined
  
  var verified_name: js.UndefOr[String | Null] = js.undefined
  
  var verified_phone: js.UndefOr[String | Null] = js.undefined
}
object Phone {
  
  inline def apply(): Phone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phone]
  }
  
  extension [Self <: Phone](x: Self) {
    
    inline def setAddress(value: IAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
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
    
    inline def setVerified_address(value: IAddress): Self = StObject.set(x, "verified_address", value.asInstanceOf[js.Any])
    
    inline def setVerified_addressNull: Self = StObject.set(x, "verified_address", null)
    
    inline def setVerified_addressUndefined: Self = StObject.set(x, "verified_address", js.undefined)
    
    inline def setVerified_email(value: String): Self = StObject.set(x, "verified_email", value.asInstanceOf[js.Any])
    
    inline def setVerified_emailNull: Self = StObject.set(x, "verified_email", null)
    
    inline def setVerified_emailUndefined: Self = StObject.set(x, "verified_email", js.undefined)
    
    inline def setVerified_name(value: String): Self = StObject.set(x, "verified_name", value.asInstanceOf[js.Any])
    
    inline def setVerified_nameNull: Self = StObject.set(x, "verified_name", null)
    
    inline def setVerified_nameUndefined: Self = StObject.set(x, "verified_name", js.undefined)
    
    inline def setVerified_phone(value: String): Self = StObject.set(x, "verified_phone", value.asInstanceOf[js.Any])
    
    inline def setVerified_phoneNull: Self = StObject.set(x, "verified_phone", null)
    
    inline def setVerified_phoneUndefined: Self = StObject.set(x, "verified_phone", js.undefined)
  }
}
