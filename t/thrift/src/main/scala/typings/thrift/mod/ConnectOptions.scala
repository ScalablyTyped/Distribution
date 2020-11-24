package typings.thrift.mod

import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectOptions extends js.Object {
  
  var connect_timeout: js.UndefOr[Double] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[HttpHeaders] = js.native
  
  var https: js.UndefOr[Boolean] = js.native
  
  var max_attempts: js.UndefOr[Double] = js.native
  
  var nodeOptions: js.UndefOr[RequestOptions | typings.node.httpsMod.RequestOptions] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var protocol: js.UndefOr[TProtocolConstructor] = js.native
  
  var retry_max_delay: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var transport: js.UndefOr[TTransportConstructor] = js.native
}
object ConnectOptions {
  
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  
  @scala.inline
  implicit class ConnectOptionsOps[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    
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
    def setConnect_timeout(value: Double): Self = this.set("connect_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnect_timeout: Self = this.set("connect_timeout", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setHeaders(value: HttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHttps(value: Boolean): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    
    @scala.inline
    def setMax_attempts(value: Double): Self = this.set("max_attempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_attempts: Self = this.set("max_attempts", js.undefined)
    
    @scala.inline
    def setNodeOptions(value: RequestOptions | typings.node.httpsMod.RequestOptions): Self = this.set("nodeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeOptions: Self = this.set("nodeOptions", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setProtocol(value: TProtocolConstructor): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setRetry_max_delay(value: Double): Self = this.set("retry_max_delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry_max_delay: Self = this.set("retry_max_delay", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTransport(value: TTransportConstructor): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
  }
}
