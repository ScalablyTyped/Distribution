package typings.winrtUwp.Windows.ApplicationModel.Calls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Address book information for a contact used by PhoneCallHistoryEntry objects. */
@js.native
trait PhoneCallHistoryEntryAddress extends js.Object {
  
  /** Gets or sets the unique identifier for this contact. */
  var contactId: String = js.native
  
  /** Get or sets the display name for this entry. */
  var displayName: String = js.native
  
  /** Gets or sets the address information for this contact. */
  var rawAddress: String = js.native
  
  /** Gets or sets the type of address indicated by RawAddress . */
  var rawAddressKind: PhoneCallHistoryEntryRawAddressKind = js.native
}
object PhoneCallHistoryEntryAddress {
  
  @scala.inline
  def apply(
    contactId: String,
    displayName: String,
    rawAddress: String,
    rawAddressKind: PhoneCallHistoryEntryRawAddressKind
  ): PhoneCallHistoryEntryAddress = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], rawAddress = rawAddress.asInstanceOf[js.Any], rawAddressKind = rawAddressKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneCallHistoryEntryAddress]
  }
  
  @scala.inline
  implicit class PhoneCallHistoryEntryAddressOps[Self <: PhoneCallHistoryEntryAddress] (val x: Self) extends AnyVal {
    
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
    def setContactId(value: String): Self = this.set("contactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawAddress(value: String): Self = this.set("rawAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawAddressKind(value: PhoneCallHistoryEntryRawAddressKind): Self = this.set("rawAddressKind", value.asInstanceOf[js.Any])
  }
}
