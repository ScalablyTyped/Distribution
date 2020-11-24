package typings.ws.mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.ws.anon.Origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerOptions extends js.Object {
  
  var backlog: js.UndefOr[Double] = js.native
  
  var clientTracking: js.UndefOr[Boolean] = js.native
  
  var handleProtocols: js.UndefOr[js.Any] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var maxPayload: js.UndefOr[Double] = js.native
  
  var noServer: js.UndefOr[Boolean] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var perMessageDeflate: js.UndefOr[Boolean | PerMessageDeflateOptions] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var server: js.UndefOr[typings.node.httpMod.Server | typings.node.httpsMod.Server] = js.native
  
  var verifyClient: js.UndefOr[VerifyClientCallbackAsync | VerifyClientCallbackSync] = js.native
}
object ServerOptions {
  
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    
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
    def setBacklog(value: Double): Self = this.set("backlog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBacklog: Self = this.set("backlog", js.undefined)
    
    @scala.inline
    def setClientTracking(value: Boolean): Self = this.set("clientTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientTracking: Self = this.set("clientTracking", js.undefined)
    
    @scala.inline
    def setHandleProtocols(value: js.Any): Self = this.set("handleProtocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleProtocols: Self = this.set("handleProtocols", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setMaxPayload(value: Double): Self = this.set("maxPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPayload: Self = this.set("maxPayload", js.undefined)
    
    @scala.inline
    def setNoServer(value: Boolean): Self = this.set("noServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoServer: Self = this.set("noServer", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPerMessageDeflate(value: Boolean | PerMessageDeflateOptions): Self = this.set("perMessageDeflate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerMessageDeflate: Self = this.set("perMessageDeflate", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setServer(value: typings.node.httpMod.Server | typings.node.httpsMod.Server): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    
    @scala.inline
    def setVerifyClientFunction2(
      value: (/* info */ Origin, /* callback */ js.Function4[
          /* res */ Boolean, 
          /* code */ js.UndefOr[Double], 
          /* message */ js.UndefOr[String], 
          /* headers */ js.UndefOr[OutgoingHttpHeaders], 
          Unit
        ]) => Unit
    ): Self = this.set("verifyClient", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVerifyClientFunction1(value: /* info */ Origin => Boolean): Self = this.set("verifyClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerifyClient(value: VerifyClientCallbackAsync | VerifyClientCallbackSync): Self = this.set("verifyClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifyClient: Self = this.set("verifyClient", js.undefined)
  }
}
