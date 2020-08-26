package typings.voximplantWebsdk.mod.CallEventTypes

import typings.voximplantWebsdk.mod.Call
import typings.voximplantWebsdk.mod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched after call was disconnected
  */
@js.native
trait Disconnected extends VoxImplantCallEvent {
  /**
    *    Call that dispatched the event
    */
  var call: Call = js.native
  /**
    *    Optional SIP headers received with the message
    */
  var headers: js.UndefOr[js.Object] = js.native
}

object Disconnected {
  @scala.inline
  def apply(call: Call): Disconnected = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disconnected]
  }
  @scala.inline
  implicit class DisconnectedOps[Self <: Disconnected] (val x: Self) extends AnyVal {
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
    def setCall(value: Call): Self = this.set("call", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
  
}

