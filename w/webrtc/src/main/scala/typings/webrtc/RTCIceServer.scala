package typings.webrtc

import typings.std.RTCIceCredentialType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtciceserver
trait RTCIceServer extends StObject {
  
  //urls: string | string[];
  var credentialType: js.UndefOr[RTCIceCredentialType] = js.undefined
}
object RTCIceServer {
  
  inline def apply(): RTCIceServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceServer]
  }
  
  extension [Self <: RTCIceServer](x: Self) {
    
    inline def setCredentialType(value: RTCIceCredentialType): Self = StObject.set(x, "credentialType", value.asInstanceOf[js.Any])
    
    inline def setCredentialTypeUndefined: Self = StObject.set(x, "credentialType", js.undefined)
  }
}
