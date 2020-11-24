package typings.webpackBlocksDevServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransportMode extends js.Object {
  
  var client: js.UndefOr[String | PathFunction] = js.native
  
  var server: js.UndefOr[String | PathFunction] = js.native
}
object TransportMode {
  
  @scala.inline
  def apply(): TransportMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransportMode]
  }
  
  @scala.inline
  implicit class TransportModeOps[Self <: TransportMode] (val x: Self) extends AnyVal {
    
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
    def setClientFunction0(value: () => String): Self = this.set("client", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClient(value: String | PathFunction): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setServerFunction0(value: () => String): Self = this.set("server", js.Any.fromFunction0(value))
    
    @scala.inline
    def setServer(value: String | PathFunction): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
}
