package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swellJs.mod.ShippingCamelCase
  - typings.swellJs.mod.ShippingSnakeCase
*/
trait Shipping extends StObject
object Shipping {
  
  inline def ShippingCamelCase(
    address1: String,
    city: String,
    country: String,
    firstName: String,
    lastName: String,
    name: String,
    phone: String,
    state: String,
    zip: String
  ): typings.swellJs.mod.ShippingCamelCase = {
    val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any], accountAddressId = null)
    __obj.asInstanceOf[typings.swellJs.mod.ShippingCamelCase]
  }
  
  inline def ShippingSnakeCase(
    address1: String,
    city: String,
    country: String,
    first_name: String,
    last_name: String,
    name: String,
    phone: String,
    state: String,
    zip: String
  ): typings.swellJs.mod.ShippingSnakeCase = {
    val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any], account_address_id = null)
    __obj.asInstanceOf[typings.swellJs.mod.ShippingSnakeCase]
  }
}
