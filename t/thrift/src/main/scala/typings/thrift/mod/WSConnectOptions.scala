package typings.thrift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WSConnectOptions extends js.Object {
  
  var headers: js.UndefOr[HttpHeaders] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var protocol: js.UndefOr[TProtocolConstructor] = js.native
  
  var secure: js.UndefOr[Boolean] = js.native
  
  var transport: js.UndefOr[TTransportConstructor] = js.native
  
  var wsOptions: js.UndefOr[WSOptions] = js.native
}
object WSConnectOptions {
  
  @scala.inline
  def apply(): WSConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WSConnectOptions]
  }
  
  @scala.inline
  implicit class WSConnectOptionsOps[Self <: WSConnectOptions] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: HttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setProtocol(value: TProtocolConstructor): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setTransport(value: TTransportConstructor): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
    
    @scala.inline
    def setWsOptions(value: WSOptions): Self = this.set("wsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsOptions: Self = this.set("wsOptions", js.undefined)
  }
}
