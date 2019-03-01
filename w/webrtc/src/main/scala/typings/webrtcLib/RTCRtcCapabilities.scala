package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpcapabilities
trait RTCRtcCapabilities extends js.Object {
  var codecs: js.Array[RTCRtpCodecCapability]
  var headerExtensions: js.Array[RTCRtpHeaderExtensionCapability]
}

object RTCRtcCapabilities {
  @scala.inline
  def apply(
    codecs: js.Array[RTCRtpCodecCapability],
    headerExtensions: js.Array[RTCRtpHeaderExtensionCapability]
  ): RTCRtcCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("codecs")(codecs)
    __obj.updateDynamic("headerExtensions")(headerExtensions)
    __obj.asInstanceOf[RTCRtcCapabilities]
  }
}

