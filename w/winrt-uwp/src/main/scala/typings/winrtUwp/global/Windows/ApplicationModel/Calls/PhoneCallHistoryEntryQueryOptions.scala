package typings.winrtUwp.global.Windows.ApplicationModel.Calls

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for querying the phone call entries. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryOptions")
@js.native
/** Creates a new PhoneCallHistoryEntryQueryOptions object. */
class PhoneCallHistoryEntryQueryOptions ()
  extends typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryOptions {
  /** Gets or sets the query filter based on the type of media. */
  /* CompleteClass */
  override var desiredMedia: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia = js.native
  /** Get the query filter based on the source ID of the phone call entry. */
  /* CompleteClass */
  override var sourceIds: IVector[String] = js.native
}

