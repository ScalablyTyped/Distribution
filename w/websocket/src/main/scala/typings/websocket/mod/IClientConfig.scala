package typings.websocket.mod

import typings.node.httpsMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientConfig extends IConfig {
  
  /**
    * Options to pass to `https.request` if connecting via TLS.
    * @see https://nodejs.org/api/https.html#https_https_request_options_callback
    */
  var tlsOptions: js.UndefOr[RequestOptions] = js.native
  
  /**
    * Which version of the WebSocket protocol to use when making the connection.
    * Currently supported values are 8 and 13. This option will be removed once the
    * protocol is finalized by the IETF It is only available to ease the transition
    * through the intermediate draft protocol versions. The only thing this affects
    * the name of the Origin header.
    * @default 13
    */
  var webSocketVersion: js.UndefOr[Double] = js.native
}
object IClientConfig {
  
  @scala.inline
  def apply(): IClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientConfig]
  }
  
  @scala.inline
  implicit class IClientConfigMutableBuilder[Self <: IClientConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTlsOptions(value: RequestOptions): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsOptionsUndefined: Self = StObject.set(x, "tlsOptions", js.undefined)
    
    @scala.inline
    def setWebSocketVersion(value: Double): Self = StObject.set(x, "webSocketVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebSocketVersionUndefined: Self = StObject.set(x, "webSocketVersion", js.undefined)
  }
}
