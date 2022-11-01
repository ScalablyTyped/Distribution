package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingSnakeCase
  extends StObject
     with AddressWithContact
     with Billing {
  
  var account_card_id: String | Null
  
  var first_name: String
  
  var last_name: String
}
object BillingSnakeCase {
  
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
  ): BillingSnakeCase = {
    val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any], account_card_id = null)
    __obj.asInstanceOf[BillingSnakeCase]
  }
  
  extension [Self <: BillingSnakeCase](x: Self) {
    
    inline def setAccount_card_id(value: String): Self = StObject.set(x, "account_card_id", value.asInstanceOf[js.Any])
    
    inline def setAccount_card_idNull: Self = StObject.set(x, "account_card_id", null)
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
  }
}
