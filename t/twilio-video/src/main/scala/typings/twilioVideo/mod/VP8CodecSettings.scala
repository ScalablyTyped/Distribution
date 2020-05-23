package typings.twilioVideo.mod

import typings.twilioVideo.twilioVideoStrings.VP8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VP8CodecSettings extends VideoCodecSettings {
  @JSName("codec")
  var codec_VP8CodecSettings: VP8
  var simulcast: js.UndefOr[Boolean] = js.undefined
}

object VP8CodecSettings {
  @scala.inline
  def apply(codec: VP8, simulcast: js.UndefOr[Boolean] = js.undefined): VP8CodecSettings = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any])
    if (!js.isUndefined(simulcast)) __obj.updateDynamic("simulcast")(simulcast.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VP8CodecSettings]
  }
}

