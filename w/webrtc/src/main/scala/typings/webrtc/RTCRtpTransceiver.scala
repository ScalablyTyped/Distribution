package typings.webrtc

import typings.std.RTCRtpTransceiverDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtptransceiver
trait RTCRtpTransceiver extends js.Object {
  var direction: RTCRtpTransceiverDirection
  val mid: String | Null
  val receiver: RTCRtpReceiver
  val sender: RTCRtpSender
  val stopped: Boolean
  def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): Unit
  def setDirection(direction: RTCRtpTransceiverDirection): Unit
  def stop(): Unit
}

object RTCRtpTransceiver {
  @scala.inline
  def apply(
    direction: RTCRtpTransceiverDirection,
    receiver: RTCRtpReceiver,
    sender: RTCRtpSender,
    setCodecPreferences: js.Array[RTCRtpCodecCapability] => Unit,
    setDirection: RTCRtpTransceiverDirection => Unit,
    stop: () => Unit,
    stopped: Boolean,
    mid: String = null
  ): RTCRtpTransceiver = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], setCodecPreferences = js.Any.fromFunction1(setCodecPreferences), setDirection = js.Any.fromFunction1(setDirection), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any], mid = mid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpTransceiver]
  }
}

