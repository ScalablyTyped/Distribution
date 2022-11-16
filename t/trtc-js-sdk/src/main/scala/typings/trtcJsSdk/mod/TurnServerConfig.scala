package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent trtc-js-sdk.trtc-js-sdk.Omit<std.RTCIceServer, 'urls'> */
trait TurnServerConfig extends StObject {
  
  var credential: js.UndefOr[String] = js.undefined
  
  /** TURN 服务器 url */
  var url: String
  
  var username: js.UndefOr[String] = js.undefined
}
object TurnServerConfig {
  
  inline def apply(url: String): TurnServerConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TurnServerConfig]
  }
  
  extension [Self <: TurnServerConfig](x: Self) {
    
    inline def setCredential(value: String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
