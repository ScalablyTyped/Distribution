package typings.winrtUwp.Windows.ApplicationModel.Calls

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for querying the phone call entries. */
trait PhoneCallHistoryEntryQueryOptions extends js.Object {
  /** Gets or sets the query filter based on the type of media. */
  var desiredMedia: PhoneCallHistoryEntryQueryDesiredMedia
  /** Get the query filter based on the source ID of the phone call entry. */
  var sourceIds: IVector[String]
}

object PhoneCallHistoryEntryQueryOptions {
  @scala.inline
  def apply(desiredMedia: PhoneCallHistoryEntryQueryDesiredMedia, sourceIds: IVector[String]): PhoneCallHistoryEntryQueryOptions = {
    val __obj = js.Dynamic.literal(desiredMedia = desiredMedia.asInstanceOf[js.Any], sourceIds = sourceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneCallHistoryEntryQueryOptions]
  }
}

