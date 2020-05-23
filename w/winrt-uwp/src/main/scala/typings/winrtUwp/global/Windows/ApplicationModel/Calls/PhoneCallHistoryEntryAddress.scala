package typings.winrtUwp.global.Windows.ApplicationModel.Calls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Address book information for a contact used by PhoneCallHistoryEntry objects. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryAddress")
@js.native
/** Creates a new empty PhoneCallHistoryEntryAddress object. */
class PhoneCallHistoryEntryAddress ()
  extends typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryAddress {
  /**
    * Creates a new PhoneCallHistoryEntryAddress object with an initial address.
    * @param rawAddress The address to initiailize to the RawAddress property.
    * @param rawAddressKind The type of address represented by rawAddress.
    */
  def this(
    rawAddress: String,
    rawAddressKind: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryRawAddressKind
  ) = this()
  /** Gets or sets the unique identifier for this contact. */
  /* CompleteClass */
  override var contactId: String = js.native
  /** Get or sets the display name for this entry. */
  /* CompleteClass */
  override var displayName: String = js.native
  /** Gets or sets the address information for this contact. */
  /* CompleteClass */
  override var rawAddress: String = js.native
  /** Gets or sets the type of address indicated by RawAddress . */
  /* CompleteClass */
  override var rawAddressKind: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryRawAddressKind = js.native
}

