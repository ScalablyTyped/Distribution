package typings.winrtUwp

import typings.winrtUwp.Windows.Media.Core.VideoTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValueNumberVideoTrack extends js.Object {
  /** The video tracks that start at startIndex in the list. */ var items: VideoTrack
  /** The number of video tracks retrieved. */ var returnValue: Double
}

object AnonItemsReturnValueNumberVideoTrack {
  @scala.inline
  def apply(items: VideoTrack, returnValue: Double): AnonItemsReturnValueNumberVideoTrack = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsReturnValueNumberVideoTrack]
  }
}

