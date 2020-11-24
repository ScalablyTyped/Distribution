package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A party and its corresponding role, including address and contact information if identified. */
@js.native
trait Parties extends js.Object {
  
  /** List of the party's address or addresses. */
  var addresses: js.UndefOr[js.Array[Address]] = js.native
  
  /** List of the names and roles of contacts identified in the input document. */
  var contacts: js.UndefOr[js.Array[Contact]] = js.native
  
  /** A string that identifies the importance of the party. */
  var importance: js.UndefOr[String] = js.native
  
  /** A string identifying the party. */
  var party: js.UndefOr[String] = js.native
  
  /** A string identifying the party's role. */
  var role: js.UndefOr[String] = js.native
}
object Parties {
  
  @scala.inline
  def apply(): Parties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parties]
  }
  
  @scala.inline
  implicit class PartiesOps[Self <: Parties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddressesVarargs(value: Address*): Self = this.set("addresses", js.Array(value :_*))
    
    @scala.inline
    def setAddresses(value: js.Array[Address]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    
    @scala.inline
    def setContactsVarargs(value: Contact*): Self = this.set("contacts", js.Array(value :_*))
    
    @scala.inline
    def setContacts(value: js.Array[Contact]): Self = this.set("contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContacts: Self = this.set("contacts", js.undefined)
    
    @scala.inline
    def setImportance(value: String): Self = this.set("importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportance: Self = this.set("importance", js.undefined)
    
    @scala.inline
    def setParty(value: String): Self = this.set("party", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParty: Self = this.set("party", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
