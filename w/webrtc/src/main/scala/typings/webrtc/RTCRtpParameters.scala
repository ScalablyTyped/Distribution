package typings.webrtc

import typings.std.RTCDegradationPreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpparameters
trait RTCRtpParameters extends StObject {
  
  //encodings: RTCRtpEncodingParameters[];
  //headerExtensions: RTCRtpHeaderExtensionParameters[];
  //rtcp: RTCRtcpParameters;
  //codecs: RTCRtpCodecParameters[];
  var degradationPreference: js.UndefOr[RTCDegradationPreference] = js.undefined
  
  var transactionId: String
}
object RTCRtpParameters {
  
  inline def apply(transactionId: String): RTCRtpParameters = {
    val __obj = js.Dynamic.literal(transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpParameters]
  }
  
  extension [Self <: RTCRtpParameters](x: Self) {
    
    inline def setDegradationPreference(value: RTCDegradationPreference): Self = StObject.set(x, "degradationPreference", value.asInstanceOf[js.Any])
    
    inline def setDegradationPreferenceUndefined: Self = StObject.set(x, "degradationPreference", js.undefined)
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
  }
}
