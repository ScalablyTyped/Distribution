package typings.voximplantWebsdk.mod.CallEventTypes

import typings.voximplantWebsdk.mod.Call
import typings.voximplantWebsdk.mod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched when text message is received
  */
@js.native
trait MessageReceived extends VoxImplantCallEvent {
  /**
    *    Call that dispatched the event
    */
  var call: Call = js.native
  /**
    *    Content of the message
    */
  var text: String = js.native
}

object MessageReceived {
  @scala.inline
  def apply(call: Call, text: String): MessageReceived = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageReceived]
  }
  @scala.inline
  implicit class MessageReceivedOps[Self <: MessageReceived] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

