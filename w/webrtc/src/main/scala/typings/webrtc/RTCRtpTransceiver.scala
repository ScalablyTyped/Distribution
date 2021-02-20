package typings.webrtc

import typings.std.RTCRtpTransceiverDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtptransceiver
@js.native
trait RTCRtpTransceiver extends StObject {
  
  var direction: RTCRtpTransceiverDirection = js.native
  
  val mid: String | Null = js.native
  
  val receiver: RTCRtpReceiver = js.native
  
  val sender: RTCRtpSender = js.native
  
  def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): Unit = js.native
  
  def setDirection(direction: RTCRtpTransceiverDirection): Unit = js.native
  
  def stop(): Unit = js.native
  
  val stopped: Boolean = js.native
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
    stopped: Boolean
  ): RTCRtpTransceiver = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], setCodecPreferences = js.Any.fromFunction1(setCodecPreferences), setDirection = js.Any.fromFunction1(setDirection), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpTransceiver]
  }
  
  @scala.inline
  implicit class RTCRtpTransceiverMutableBuilder[Self <: RTCRtpTransceiver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: RTCRtpTransceiverDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMid(value: String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidNull: Self = StObject.set(x, "mid", null)
    
    @scala.inline
    def setReceiver(value: RTCRtpReceiver): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: RTCRtpSender): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCodecPreferences(value: js.Array[RTCRtpCodecCapability] => Unit): Self = StObject.set(x, "setCodecPreferences", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDirection(value: RTCRtpTransceiverDirection => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
  }
}
