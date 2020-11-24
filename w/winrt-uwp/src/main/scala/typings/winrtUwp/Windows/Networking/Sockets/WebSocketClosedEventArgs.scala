package typings.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a closed event on a MessageWebSocket , StreamWebSocket , or IWebSocket object. */
@js.native
trait WebSocketClosedEventArgs extends js.Object {
  
  /** Gets information about the reason that a WebSocket object was closed. */
  var code: Double = js.native
  
  /** Gets additional details about the reason that a WebSocket object was closed. */
  var reason: String = js.native
}
object WebSocketClosedEventArgs {
  
  @scala.inline
  def apply(code: Double, reason: String): WebSocketClosedEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketClosedEventArgs]
  }
  
  @scala.inline
  implicit class WebSocketClosedEventArgsOps[Self <: WebSocketClosedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
