package typings.titanium

import typings.titanium.Titanium.Network.Socket.TCP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Argument object passed to the [connected](Titanium.Network.Socket.TCP.connected) callback when the socket connects.
  */
@js.native
trait ConnectedCallbackArgs extends js.Object {
  
  /**
    * Socket instance that has been connected.
    */
  var socket: js.UndefOr[TCP] = js.native
}
object ConnectedCallbackArgs {
  
  @scala.inline
  def apply(): ConnectedCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectedCallbackArgs]
  }
  
  @scala.inline
  implicit class ConnectedCallbackArgsOps[Self <: ConnectedCallbackArgs] (val x: Self) extends AnyVal {
    
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
    def setSocket(value: TCP): Self = this.set("socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
  }
}
