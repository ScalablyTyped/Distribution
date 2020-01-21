package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BandwidthProfileOptions extends js.Object {
  var video: js.UndefOr[VideoBandwidthProfileOptions] = js.undefined
}

object BandwidthProfileOptions {
  @scala.inline
  def apply(video: VideoBandwidthProfileOptions = null): BandwidthProfileOptions = {
    val __obj = js.Dynamic.literal()
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[BandwidthProfileOptions]
  }
}

