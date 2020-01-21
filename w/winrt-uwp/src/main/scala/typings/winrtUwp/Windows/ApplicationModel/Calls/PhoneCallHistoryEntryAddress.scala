package typings.winrtUwp.Windows.ApplicationModel.Calls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Address book information for a contact used by PhoneCallHistoryEntry objects. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryAddress")
@js.native
/** Creates a new empty PhoneCallHistoryEntryAddress object. */
class PhoneCallHistoryEntryAddress () extends js.Object {
  /**
    * Creates a new PhoneCallHistoryEntryAddress object with an initial address.
    * @param rawAddress The address to initiailize to the RawAddress property.
    * @param rawAddressKind The type of address represented by rawAddress.
    */
  def this(rawAddress: String, rawAddressKind: PhoneCallHistoryEntryRawAddressKind) = this()
  /** Gets or sets the unique identifier for this contact. */
  var contactId: String = js.native
  /** Get or sets the display name for this entry. */
  var displayName: String = js.native
  /** Gets or sets the address information for this contact. */
  var rawAddress: String = js.native
  /** Gets or sets the type of address indicated by RawAddress . */
  var rawAddressKind: PhoneCallHistoryEntryRawAddressKind = js.native
}

