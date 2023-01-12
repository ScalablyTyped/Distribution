package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingCamelCase
  extends StObject
     with AddressWithContact
     with Billing {
  
  var accountCardId: String | Null
  
  var firstName: String
  
  var lastName: String
}
object BillingCamelCase {
  
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
  ): BillingCamelCase = {
    val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any], accountCardId = null)
    __obj.asInstanceOf[BillingCamelCase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingCamelCase] (val x: Self) extends AnyVal {
    
    inline def setAccountCardId(value: String): Self = StObject.set(x, "accountCardId", value.asInstanceOf[js.Any])
    
    inline def setAccountCardIdNull: Self = StObject.set(x, "accountCardId", null)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
  }
}
