package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtptransceiverinit

trait RTCRtpTransceiverInit extends js.Object {
  var direction: js.UndefOr[RTCRtpTransceiverDirection] = js.undefined
  var sendEncodings: js.Array[RTCRtpEncodingParameters]
   // default = 'sendrecv'
  var streams: js.Array[MediaStream]
}

