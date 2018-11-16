package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtptransceiver

trait RTCRtpTransceiver extends js.Object {
  val direction: RTCRtpTransceiverDirection
  val mid: java.lang.String | scala.Null
  val receiver: RTCRtpReceiver
  val sender: RTCRtpSender
  val stopped: scala.Boolean
  def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): scala.Unit
  def setDirection(direction: RTCRtpTransceiverDirection): scala.Unit
  def stop(): scala.Unit
}

