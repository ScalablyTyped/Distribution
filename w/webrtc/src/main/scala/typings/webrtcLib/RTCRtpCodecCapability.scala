package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpcodeccapability
trait RTCRtpCodecCapability extends js.Object {
  var mimeType: java.lang.String
}

object RTCRtpCodecCapability {
  @scala.inline
  def apply(mimeType: java.lang.String): RTCRtpCodecCapability = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mimeType")(mimeType)
    __obj.asInstanceOf[RTCRtpCodecCapability]
  }
}

