package typings.stripeV3.anon

import typings.stripeV3.stripe.OwnerAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var address: OwnerAddress | Null
  
  var email: String | Null
  
  var name: String | Null
  
  var phone: String | Null
  
  var verified_address: String | Null
  
  var verified_email: String | Null
  
  var verified_name: String | Null
  
  var verified_phone: String | Null
}
object Address {
  
  inline def apply(): Address = {
    val __obj = js.Dynamic.literal(address = null, email = null, name = null, phone = null, verified_address = null, verified_email = null, verified_name = null, verified_phone = null)
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress(value: OwnerAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    inline def setVerified_address(value: String): Self = StObject.set(x, "verified_address", value.asInstanceOf[js.Any])
    
    inline def setVerified_addressNull: Self = StObject.set(x, "verified_address", null)
    
    inline def setVerified_email(value: String): Self = StObject.set(x, "verified_email", value.asInstanceOf[js.Any])
    
    inline def setVerified_emailNull: Self = StObject.set(x, "verified_email", null)
    
    inline def setVerified_name(value: String): Self = StObject.set(x, "verified_name", value.asInstanceOf[js.Any])
    
    inline def setVerified_nameNull: Self = StObject.set(x, "verified_name", null)
    
    inline def setVerified_phone(value: String): Self = StObject.set(x, "verified_phone", value.asInstanceOf[js.Any])
    
    inline def setVerified_phoneNull: Self = StObject.set(x, "verified_phone", null)
  }
}
