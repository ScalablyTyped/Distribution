package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressWithContact
  extends StObject
     with Address {
  
  var name: String
  
  var phone: String
}
object AddressWithContact {
  
  inline def apply(
    address1: String,
    city: String,
    country: String,
    name: String,
    phone: String,
    state: String,
    zip: String
  ): AddressWithContact = {
    val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressWithContact]
  }
  
  extension [Self <: AddressWithContact](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
  }
}
