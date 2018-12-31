package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for querying the phone call entries. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryOptions")
@js.native
/** Creates a new PhoneCallHistoryEntryQueryOptions object. */
class PhoneCallHistoryEntryQueryOptions () extends js.Object {
  /** Gets or sets the query filter based on the type of media. */
  var desiredMedia: PhoneCallHistoryEntryQueryDesiredMedia = js.native
  /** Get the query filter based on the source ID of the phone call entry. */
  var sourceIds: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
}

