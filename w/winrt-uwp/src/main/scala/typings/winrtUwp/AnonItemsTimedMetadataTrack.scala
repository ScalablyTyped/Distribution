package typings.winrtUwp

import typings.winrtUwp.Windows.Media.Core.TimedMetadataTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsTimedMetadataTrack extends js.Object {
  /** The timed metadata tracks that start at startIndex in the list. */ var items: TimedMetadataTrack
  /** The number of timed metadata tracks retrieved. */ var returnValue: Double
}

object AnonItemsTimedMetadataTrack {
  @scala.inline
  def apply(items: TimedMetadataTrack, returnValue: Double): AnonItemsTimedMetadataTrack = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsTimedMetadataTrack]
  }
}

