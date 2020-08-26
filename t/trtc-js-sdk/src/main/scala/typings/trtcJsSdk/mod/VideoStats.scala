package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoStats extends js.Object {
  /** 视频高度 */
  var framesHeight: Double = js.native
  /** 视频宽度 */
  var framesWidth: Double = js.native
}

object VideoStats {
  @scala.inline
  def apply(framesHeight: Double, framesWidth: Double): VideoStats = {
    val __obj = js.Dynamic.literal(framesHeight = framesHeight.asInstanceOf[js.Any], framesWidth = framesWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStats]
  }
  @scala.inline
  implicit class VideoStatsOps[Self <: VideoStats] (val x: Self) extends AnyVal {
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
    def setFramesHeight(value: Double): Self = this.set("framesHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setFramesWidth(value: Double): Self = this.set("framesWidth", value.asInstanceOf[js.Any])
  }
  
}

