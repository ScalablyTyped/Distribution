package typings.trtcJsSdk.mod

import typings.std.RTCIceCredentialType
import typings.std.RTCOAuthCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent trtc-js-sdk.trtc-js-sdk.Omit<std.RTCIceServer, 'urls'> */
@js.native
trait TurnServerConfig extends StObject {
  
  var credential: js.UndefOr[String | RTCOAuthCredential] = js.native
  
  var credentialType: js.UndefOr[RTCIceCredentialType] = js.native
  
  /** TURN 服务器 url */
  var url: String = js.native
  
  var username: js.UndefOr[String] = js.native
}
object TurnServerConfig {
  
  @scala.inline
  def apply(url: String): TurnServerConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TurnServerConfig]
  }
  
  @scala.inline
  implicit class TurnServerConfigMutableBuilder[Self <: TurnServerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredential(value: String | RTCOAuthCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialType(value: RTCIceCredentialType): Self = StObject.set(x, "credentialType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialTypeUndefined: Self = StObject.set(x, "credentialType", js.undefined)
    
    @scala.inline
    def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
