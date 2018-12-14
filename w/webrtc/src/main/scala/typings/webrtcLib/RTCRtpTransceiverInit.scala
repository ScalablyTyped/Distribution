package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtptransceiverinit

trait RTCRtpTransceiverInit extends js.Object {
  var direction: js.UndefOr[stdLib.RTCRtpTransceiverDirection] = js.undefined
  var sendEncodings: js.UndefOr[js.Array[RTCRtpEncodingParameters]] = js.undefined
   // default = 'sendrecv'
  var streams: js.UndefOr[js.Array[MediaStream]] = js.undefined
}

