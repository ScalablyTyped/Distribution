package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpcodeccapability
@js.native
trait RTCRtpCodecCapability extends StObject {
  
  var mimeType: String = js.native
}
object RTCRtpCodecCapability {
  
  @scala.inline
  def apply(mimeType: String): RTCRtpCodecCapability = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCodecCapability]
  }
  
  @scala.inline
  implicit class RTCRtpCodecCapabilityMutableBuilder[Self <: RTCRtpCodecCapability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
  }
}
