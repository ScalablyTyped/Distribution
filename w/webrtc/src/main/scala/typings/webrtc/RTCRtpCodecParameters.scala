package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpcodecparameters
trait RTCRtpCodecParameters extends js.Object {
  //clockRate: number;
  var channels: js.UndefOr[Double] = js.undefined
  //payloadType: number;
  var mimeType: String
   // default = 1
  var sdpFmtpLine: js.UndefOr[String] = js.undefined
}

object RTCRtpCodecParameters {
  @scala.inline
  def apply(mimeType: String, channels: Int | Double = null, sdpFmtpLine: String = null): RTCRtpCodecParameters = {
    val __obj = js.Dynamic.literal(mimeType = mimeType)
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (sdpFmtpLine != null) __obj.updateDynamic("sdpFmtpLine")(sdpFmtpLine)
    __obj.asInstanceOf[RTCRtpCodecParameters]
  }
}

