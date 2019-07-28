package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpheaderextensioncapability
trait RTCRtpHeaderExtensionCapability extends js.Object {
  var uri: js.UndefOr[String] = js.undefined
}

object RTCRtpHeaderExtensionCapability {
  @scala.inline
  def apply(uri: String = null): RTCRtpHeaderExtensionCapability = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[RTCRtpHeaderExtensionCapability]
  }
}

