package typings.titanium

import typings.titanium.Titanium.Network.Socket.TCP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object passed to the error callback when the socket enters the [ERROR](Titanium.Network.Socket.ERROR) state.
  */
@js.native
trait ErrorCallbackArgs extends FailureResponse {
  /**
    * Socket that experienced the error.
    */
  var socket: js.UndefOr[TCP] = js.native
}

object ErrorCallbackArgs {
  @scala.inline
  def apply(): ErrorCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorCallbackArgs]
  }
  @scala.inline
  implicit class ErrorCallbackArgsOps[Self <: ErrorCallbackArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSocket(value: TCP): Self = this.set("socket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
  }
  
}

