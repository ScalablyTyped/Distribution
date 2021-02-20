package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpcodecparameters
@js.native
trait RTCRtpCodecParameters extends StObject {
  
  //clockRate: number;
  var channels: js.UndefOr[Double] = js.native
  
  //payloadType: number;
  var mimeType: String = js.native
  
  // default = 1
  var sdpFmtpLine: js.UndefOr[String] = js.native
}
object RTCRtpCodecParameters {
  
  @scala.inline
  def apply(mimeType: String): RTCRtpCodecParameters = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCodecParameters]
  }
  
  @scala.inline
  implicit class RTCRtpCodecParametersMutableBuilder[Self <: RTCRtpCodecParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpFmtpLine(value: String): Self = StObject.set(x, "sdpFmtpLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpFmtpLineUndefined: Self = StObject.set(x, "sdpFmtpLine", js.undefined)
  }
}
