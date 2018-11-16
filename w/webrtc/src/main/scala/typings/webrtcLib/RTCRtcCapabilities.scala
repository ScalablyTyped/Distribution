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

