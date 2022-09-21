package typings.webrtc

import typings.std.RTCIceCredentialType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtciceserver
trait RTCIceServer extends StObject {
  
  var credential: js.UndefOr[String] = js.undefined
  
  var credentialType: js.UndefOr[RTCIceCredentialType] = js.undefined
  
  var urls: String | js.Array[String]
  
  var username: js.UndefOr[String] = js.undefined
}
object RTCIceServer {
  
  inline def apply(urls: String | js.Array[String]): RTCIceServer = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceServer]
  }
  
  extension [Self <: RTCIceServer](x: Self) {
    
    inline def setCredential(value: String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialType(value: RTCIceCredentialType): Self = StObject.set(x, "credentialType", value.asInstanceOf[js.Any])
    
    inline def setCredentialTypeUndefined: Self = StObject.set(x, "credentialType", js.undefined)
    
    inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    inline def setUrls(value: String | js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
