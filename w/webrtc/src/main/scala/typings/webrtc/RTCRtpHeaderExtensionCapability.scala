package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpheaderextensioncapability
trait RTCRtpHeaderExtensionCapability extends StObject {
  
  var uri: js.UndefOr[String] = js.undefined
}
object RTCRtpHeaderExtensionCapability {
  
  @scala.inline
  def apply(): RTCRtpHeaderExtensionCapability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpHeaderExtensionCapability]
  }
  
  @scala.inline
  implicit class RTCRtpHeaderExtensionCapabilityMutableBuilder[Self <: RTCRtpHeaderExtensionCapability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
