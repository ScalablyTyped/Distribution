package typings.websocket.mod

import typings.node.httpsMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientConfig
  extends StObject
     with IConfig {
  
  /**
    * Options to pass to `https.request` if connecting via TLS.
    * @see https://nodejs.org/api/https.html#https_https_request_options_callback
    */
  var tlsOptions: js.UndefOr[RequestOptions] = js.undefined
  
  /**
    * Which version of the WebSocket protocol to use when making the connection.
    * Currently supported values are 8 and 13. This option will be removed once the
    * protocol is finalized by the IETF It is only available to ease the transition
    * through the intermediate draft protocol versions. The only thing this affects
    * the name of the Origin header.
    * @default 13
    */
  var webSocketVersion: js.UndefOr[Double] = js.undefined
}
object IClientConfig {
  
  inline def apply(): IClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientConfig]
  }
  
  extension [Self <: IClientConfig](x: Self) {
    
    inline def setTlsOptions(value: RequestOptions): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
    
    inline def setTlsOptionsUndefined: Self = StObject.set(x, "tlsOptions", js.undefined)
    
    inline def setWebSocketVersion(value: Double): Self = StObject.set(x, "webSocketVersion", value.asInstanceOf[js.Any])
    
    inline def setWebSocketVersionUndefined: Self = StObject.set(x, "webSocketVersion", js.undefined)
  }
}
