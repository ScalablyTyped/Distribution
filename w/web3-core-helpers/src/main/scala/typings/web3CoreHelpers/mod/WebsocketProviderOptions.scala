package typings.web3CoreHelpers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebsocketProviderOptions extends StObject {
  
  var clientConfig: js.UndefOr[js.Object] = js.undefined
  
  var headers: js.UndefOr[Any] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var origin: js.UndefOr[String] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
  
  var reconnect: js.UndefOr[ReconnectOptions] = js.undefined
  
  var reconnectDelay: js.UndefOr[Double] = js.undefined
  
  var requestOptions: js.UndefOr[Any] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object WebsocketProviderOptions {
  
  inline def apply(): WebsocketProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebsocketProviderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebsocketProviderOptions] (val x: Self) extends AnyVal {
    
    inline def setClientConfig(value: js.Object): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
    
    inline def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setReconnect(value: ReconnectOptions): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
    
    inline def setReconnectDelay(value: Double): Self = StObject.set(x, "reconnectDelay", value.asInstanceOf[js.Any])
    
    inline def setReconnectDelayUndefined: Self = StObject.set(x, "reconnectDelay", js.undefined)
    
    inline def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
    
    inline def setRequestOptions(value: Any): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
