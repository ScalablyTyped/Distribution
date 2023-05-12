package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.swellJs.typesAccountCamelMod.AddressCamel because var conflicts: account_address_id, active, address1, address2, city, company, country, date_created, date_updated, fingerprint, first_name, id, last_name, name, parent_id, phone, state, zip. Inlined  */ trait Address
  extends StObject
     with AddressSnake
object Address {
  
  inline def apply(address1: String): Address = {
    val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}
