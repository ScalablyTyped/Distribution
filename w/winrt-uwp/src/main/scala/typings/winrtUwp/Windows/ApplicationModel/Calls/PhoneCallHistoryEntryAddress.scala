package typings.winrtUwp.Windows.ApplicationModel.Calls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Address book information for a contact used by PhoneCallHistoryEntry objects. */
trait PhoneCallHistoryEntryAddress extends StObject {
  
  /** Gets or sets the unique identifier for this contact. */
  var contactId: String
  
  /** Get or sets the display name for this entry. */
  var displayName: String
  
  /** Gets or sets the address information for this contact. */
  var rawAddress: String
  
  /** Gets or sets the type of address indicated by RawAddress . */
  var rawAddressKind: PhoneCallHistoryEntryRawAddressKind
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
  implicit class PhoneCallHistoryEntryAddressMutableBuilder[Self <: PhoneCallHistoryEntryAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactId(value: String): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawAddress(value: String): Self = StObject.set(x, "rawAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawAddressKind(value: PhoneCallHistoryEntryRawAddressKind): Self = StObject.set(x, "rawAddressKind", value.asInstanceOf[js.Any])
  }
}
