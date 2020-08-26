package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Core.VideoTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsVideoTrack extends js.Object {
  /** The video tracks that start at startIndex in the list. */ var items: VideoTrack = js.native
  /** The number of video tracks retrieved. */ var returnValue: Double = js.native
}

object ItemsVideoTrack {
  @scala.inline
  def apply(items: VideoTrack, returnValue: Double): ItemsVideoTrack = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsVideoTrack]
  }
  @scala.inline
  implicit class ItemsVideoTrackOps[Self <: ItemsVideoTrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItems(value: VideoTrack): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Double): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

