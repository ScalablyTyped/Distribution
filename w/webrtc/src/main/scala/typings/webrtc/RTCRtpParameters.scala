package typings.webrtc

import typings.std.RTCDegradationPreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpparameters
@js.native
trait RTCRtpParameters extends StObject {
  
  //encodings: RTCRtpEncodingParameters[];
  //headerExtensions: RTCRtpHeaderExtensionParameters[];
  //rtcp: RTCRtcpParameters;
  //codecs: RTCRtpCodecParameters[];
  var degradationPreference: js.UndefOr[RTCDegradationPreference] = js.native
  
  var transactionId: String = js.native
}
object RTCRtpParameters {
  
  @scala.inline
  def apply(transactionId: String): RTCRtpParameters = {
    val __obj = js.Dynamic.literal(transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpParameters]
  }
  
  @scala.inline
  implicit class RTCRtpParametersMutableBuilder[Self <: RTCRtpParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDegradationPreference(value: RTCDegradationPreference): Self = StObject.set(x, "degradationPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDegradationPreferenceUndefined: Self = StObject.set(x, "degradationPreference", js.undefined)
    
    @scala.inline
    def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
  }
}
