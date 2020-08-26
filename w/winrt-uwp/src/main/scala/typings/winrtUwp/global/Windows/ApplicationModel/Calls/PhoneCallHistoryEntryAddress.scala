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
}

