package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingCamelCase
  extends StObject
     with AddressWithContact
     with Shipping {
  
  var accountAddressId: String | Null
  
  var firstName: String
  
  var lastName: String
}
object ShippingCamelCase {
  
  inline def apply(
    address1: String,
    city: String,
    country: String,
    firstName: String,
    lastName: String,
    name: String,
    phone: String,
    state: String,
    zip: String
  ): ShippingCamelCase = {
    val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any], accountAddressId = null)
    __obj.asInstanceOf[ShippingCamelCase]
  }
  
  extension [Self <: ShippingCamelCase](x: Self) {
    
    inline def setAccountAddressId(value: String): Self = StObject.set(x, "accountAddressId", value.asInstanceOf[js.Any])
    
    inline def setAccountAddressIdNull: Self = StObject.set(x, "accountAddressId", null)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
  }
}
