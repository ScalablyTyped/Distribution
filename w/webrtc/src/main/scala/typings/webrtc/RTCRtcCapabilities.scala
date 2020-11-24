package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpcapabilities
@js.native
trait RTCRtcCapabilities extends js.Object {
  
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
  implicit class RTCRtcCapabilitiesOps[Self <: RTCRtcCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCodecsVarargs(value: RTCRtpCodecCapability*): Self = this.set("codecs", js.Array(value :_*))
    
    @scala.inline
    def setCodecs(value: js.Array[RTCRtpCodecCapability]): Self = this.set("codecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderExtensionsVarargs(value: RTCRtpHeaderExtensionCapability*): Self = this.set("headerExtensions", js.Array(value :_*))
    
    @scala.inline
    def setHeaderExtensions(value: js.Array[RTCRtpHeaderExtensionCapability]): Self = this.set("headerExtensions", value.asInstanceOf[js.Any])
  }
}
