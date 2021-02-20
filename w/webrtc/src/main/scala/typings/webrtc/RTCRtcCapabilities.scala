package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpcapabilities
@js.native
trait RTCRtcCapabilities extends StObject {
  
  var codecs: js.Array[RTCRtpCodecCapability] = js.native
  
  var headerExtensions: js.Array[RTCRtpHeaderExtensionCapability] = js.native
}
object RTCRtcCapabilities {
  
  @scala.inline
  def apply(
    codecs: js.Array[RTCRtpCodecCapability],
    headerExtensions: js.Array[RTCRtpHeaderExtensionCapability]
  ): RTCRtcCapabilities = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtcCapabilities]
  }
  
  @scala.inline
  implicit class RTCRtcCapabilitiesMutableBuilder[Self <: RTCRtcCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodecs(value: js.Array[RTCRtpCodecCapability]): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecsVarargs(value: RTCRtpCodecCapability*): Self = StObject.set(x, "codecs", js.Array(value :_*))
    
    @scala.inline
    def setHeaderExtensions(value: js.Array[RTCRtpHeaderExtensionCapability]): Self = StObject.set(x, "headerExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderExtensionsVarargs(value: RTCRtpHeaderExtensionCapability*): Self = StObject.set(x, "headerExtensions", js.Array(value :_*))
  }
}
