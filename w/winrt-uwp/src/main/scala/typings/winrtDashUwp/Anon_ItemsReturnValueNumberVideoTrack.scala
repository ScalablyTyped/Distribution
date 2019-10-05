package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Media.Core.VideoTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueNumberVideoTrack extends js.Object {
  /** The video tracks that start at startIndex in the list. */ var items: VideoTrack
  /** The number of video tracks retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueNumberVideoTrack {
  @scala.inline
  def apply(items: VideoTrack, returnValue: Double): Anon_ItemsReturnValueNumberVideoTrack = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueNumberVideoTrack]
  }
}

