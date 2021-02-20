package typings.web3CoreHelpers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebsocketProviderOptions extends StObject {
  
  var clientConfig: js.UndefOr[js.Object] = js.native
  
  var headers: js.UndefOr[js.Any] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var origin: js.UndefOr[String] = js.native
  
  var protocol: js.UndefOr[String] = js.native
  
  var reconnect: js.UndefOr[ReconnectOptions] = js.native
  
  var reconnectDelay: js.UndefOr[Double] = js.native
  
  var requestOptions: js.UndefOr[js.Any] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object WebsocketProviderOptions {
  
  @scala.inline
  def apply(): WebsocketProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebsocketProviderOptions]
  }
  
  @scala.inline
  implicit class WebsocketProviderOptionsMutableBuilder[Self <: WebsocketProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientConfig(value: js.Object): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientConfigUndefined: Self = StObject.set(x, "clientConfig", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setReconnect(value: ReconnectOptions): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnectDelay(value: Double): Self = StObject.set(x, "reconnectDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnectDelayUndefined: Self = StObject.set(x, "reconnectDelay", js.undefined)
    
    @scala.inline
    def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: js.Any): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
