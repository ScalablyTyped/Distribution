package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpheaderextensionparameters
trait RTCRtpHeaderExtensionParameters extends StObject {
  
  //uri: string;
  //id: number;
  var encrypted: js.UndefOr[Boolean] = js.undefined
}
object RTCRtpHeaderExtensionParameters {
  
  @scala.inline
  def apply(): RTCRtpHeaderExtensionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpHeaderExtensionParameters]
  }
  
  @scala.inline
  implicit class RTCRtpHeaderExtensionParametersMutableBuilder[Self <: RTCRtpHeaderExtensionParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
  }
}
