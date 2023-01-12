package typings.webrtc

import typings.std.RTCRtpTransceiverDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtptransceiver
trait RTCRtpTransceiver extends StObject {
  
  var direction: RTCRtpTransceiverDirection
  
  val mid: String | Null
  
  val receiver: RTCRtpReceiver
  
  val sender: RTCRtpSender
  
  def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): Unit
  
  def setDirection(direction: RTCRtpTransceiverDirection): Unit
  
  def stop(): Unit
  
  val stopped: Boolean
}
object RTCRtpTransceiver {
  
  inline def apply(
    direction: RTCRtpTransceiverDirection,
    receiver: RTCRtpReceiver,
    sender: RTCRtpSender,
    setCodecPreferences: js.Array[RTCRtpCodecCapability] => Unit,
    setDirection: RTCRtpTransceiverDirection => Unit,
    stop: () => Unit,
    stopped: Boolean
  ): RTCRtpTransceiver = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], setCodecPreferences = js.Any.fromFunction1(setCodecPreferences), setDirection = js.Any.fromFunction1(setDirection), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any], mid = null)
    __obj.asInstanceOf[RTCRtpTransceiver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCRtpTransceiver] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: RTCRtpTransceiverDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setMid(value: String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
    
    inline def setMidNull: Self = StObject.set(x, "mid", null)
    
    inline def setReceiver(value: RTCRtpReceiver): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setSender(value: RTCRtpSender): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSetCodecPreferences(value: js.Array[RTCRtpCodecCapability] => Unit): Self = StObject.set(x, "setCodecPreferences", js.Any.fromFunction1(value))
    
    inline def setSetDirection(value: RTCRtpTransceiverDirection => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
  }
}
