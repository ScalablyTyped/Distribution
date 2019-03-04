package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpcodecparameters
trait RTCRtpCodecParameters extends js.Object {
  //clockRate: number;
  var channels: js.UndefOr[scala.Double] = js.undefined
  //payloadType: number;
  var mimeType: java.lang.String
   // default = 1
  var sdpFmtpLine: js.UndefOr[java.lang.String] = js.undefined
}

object RTCRtpCodecParameters {
  @scala.inline
  def apply(
    mimeType: java.lang.String,
    channels: scala.Int | scala.Double = null,
    sdpFmtpLine: java.lang.String = null
  ): RTCRtpCodecParameters = {
    val __obj = js.Dynamic.literal(mimeType = mimeType)
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (sdpFmtpLine != null) __obj.updateDynamic("sdpFmtpLine")(sdpFmtpLine)
    __obj.asInstanceOf[RTCRtpCodecParameters]
  }
}

