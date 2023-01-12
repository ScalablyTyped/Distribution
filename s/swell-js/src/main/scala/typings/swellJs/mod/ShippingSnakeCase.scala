package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingSnakeCase
  extends StObject
     with AddressWithContact
     with Shipping {
  
  var account_address_id: String | Null
  
  var first_name: String
  
  var last_name: String
}
object ShippingSnakeCase {
  
  inline def apply(
    address1: String,
    city: String,
    country: String,
    first_name: String,
    last_name: String,
    name: String,
    phone: String,
    state: String,
    zip: String
  ): ShippingSnakeCase = {
    val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any], account_address_id = null)
    __obj.asInstanceOf[ShippingSnakeCase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShippingSnakeCase] (val x: Self) extends AnyVal {
    
    inline def setAccount_address_id(value: String): Self = StObject.set(x, "account_address_id", value.asInstanceOf[js.Any])
    
    inline def setAccount_address_idNull: Self = StObject.set(x, "account_address_id", null)
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
  }
}
