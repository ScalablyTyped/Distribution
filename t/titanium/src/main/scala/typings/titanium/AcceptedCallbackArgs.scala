package typings.titanium

import typings.titanium.Titanium.Network.Socket.TCP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Argument object passed to the [accepted](Titanium.Network.Socket.TCP.accepted)
  * callback when a listener accepts a connection.
  */
@js.native
trait AcceptedCallbackArgs extends js.Object {
  
  /**
    * Socket which represents the inbound connection.
    */
  var inbound: js.UndefOr[TCP] = js.native
  
  /**
    * Socket which received the connection.
    */
  var socket: js.UndefOr[TCP] = js.native
}
object AcceptedCallbackArgs {
  
  @scala.inline
  def apply(): AcceptedCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptedCallbackArgs]
  }
  
  @scala.inline
  implicit class AcceptedCallbackArgsOps[Self <: AcceptedCallbackArgs] (val x: Self) extends AnyVal {
    
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
    def setInbound(value: TCP): Self = this.set("inbound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInbound: Self = this.set("inbound", js.undefined)
    
    @scala.inline
    def setSocket(value: TCP): Self = this.set("socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
  }
}
