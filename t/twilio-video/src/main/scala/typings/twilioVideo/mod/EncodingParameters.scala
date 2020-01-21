package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingParameters extends js.Object {
  var maxAudioBitrate: js.UndefOr[Double | Null] = js.undefined
  var maxVideoBitrate: js.UndefOr[Double | Null] = js.undefined
}

object EncodingParameters {
  @scala.inline
  def apply(maxAudioBitrate: Int | Double = null, maxVideoBitrate: Int | Double = null): EncodingParameters = {
    val __obj = js.Dynamic.literal()
    if (maxAudioBitrate != null) __obj.updateDynamic("maxAudioBitrate")(maxAudioBitrate.asInstanceOf[js.Any])
    if (maxVideoBitrate != null) __obj.updateDynamic("maxVideoBitrate")(maxVideoBitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingParameters]
  }
}

