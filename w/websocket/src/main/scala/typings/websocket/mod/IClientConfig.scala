package typings.websocket.mod

import typings.node.httpsMod.RequestOptions
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
  implicit class IClientConfigOps[Self <: IClientConfig] (val x: Self) extends AnyVal {
    
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
    def setTlsOptions(value: RequestOptions): Self = this.set("tlsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsOptions: Self = this.set("tlsOptions", js.undefined)
    
    @scala.inline
    def setWebSocketVersion(value: Double): Self = this.set("webSocketVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebSocketVersion: Self = this.set("webSocketVersion", js.undefined)
  }
}
