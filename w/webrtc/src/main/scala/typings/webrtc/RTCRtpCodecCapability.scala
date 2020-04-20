package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpcodeccapability
trait RTCRtpCodecCapability extends js.Object {
  var mimeType: String
}

object RTCRtpCodecCapability {
  @scala.inline
  def apply(mimeType: String): RTCRtpCodecCapability = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCodecCapability]
  }
}

