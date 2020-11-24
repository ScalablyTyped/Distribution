package typings.web3CoreHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebsocketProviderOptions extends js.Object {
  
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
  implicit class WebsocketProviderOptionsOps[Self <: WebsocketProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientConfig(value: js.Object): Self = this.set("clientConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientConfig: Self = this.set("clientConfig", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setReconnect(value: ReconnectOptions): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnect: Self = this.set("reconnect", js.undefined)
    
    @scala.inline
    def setReconnectDelay(value: Double): Self = this.set("reconnectDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectDelay: Self = this.set("reconnectDelay", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: js.Any): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
