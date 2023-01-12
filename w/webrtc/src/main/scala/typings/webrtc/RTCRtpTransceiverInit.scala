package typings.webrtc

import typings.std.RTCRtpTransceiverDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtptransceiverinit
trait RTCRtpTransceiverInit extends StObject {
  
  var direction: js.UndefOr[RTCRtpTransceiverDirection] = js.undefined
  
  var sendEncodings: js.UndefOr[js.Array[RTCRtpEncodingParameters]] = js.undefined
  
  // default = 'sendrecv'
  var streams: js.UndefOr[js.Array[MediaStream]] = js.undefined
}
object RTCRtpTransceiverInit {
  
  inline def apply(): RTCRtpTransceiverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpTransceiverInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCRtpTransceiverInit] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: RTCRtpTransceiverDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setSendEncodings(value: js.Array[RTCRtpEncodingParameters]): Self = StObject.set(x, "sendEncodings", value.asInstanceOf[js.Any])
    
    inline def setSendEncodingsUndefined: Self = StObject.set(x, "sendEncodings", js.undefined)
    
    inline def setSendEncodingsVarargs(value: RTCRtpEncodingParameters*): Self = StObject.set(x, "sendEncodings", js.Array(value*))
    
    inline def setStreams(value: js.Array[MediaStream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
    
    inline def setStreamsVarargs(value: MediaStream*): Self = StObject.set(x, "streams", js.Array(value*))
  }
}
