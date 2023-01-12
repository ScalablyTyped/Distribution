package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A party and its corresponding role, including address and contact information if identified. */
trait Parties extends StObject {
  
  /** List of the party's address or addresses. */
  var addresses: js.UndefOr[js.Array[Address]] = js.undefined
  
  /** List of the names and roles of contacts identified in the input document. */
  var contacts: js.UndefOr[js.Array[Contact]] = js.undefined
  
  /** A string that identifies the importance of the party. */
  var importance: js.UndefOr[String] = js.undefined
  
  /** A string identifying the party. */
  var party: js.UndefOr[String] = js.undefined
  
  /** A string identifying the party's role. */
  var role: js.UndefOr[String] = js.undefined
}
object Parties {
  
  inline def apply(): Parties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parties] (val x: Self) extends AnyVal {
    
    inline def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setContacts(value: js.Array[Contact]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    inline def setContactsVarargs(value: Contact*): Self = StObject.set(x, "contacts", js.Array(value*))
    
    inline def setImportance(value: String): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
    
    inline def setParty(value: String): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    inline def setPartyUndefined: Self = StObject.set(x, "party", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
