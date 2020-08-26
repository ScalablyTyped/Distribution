package typings.voximplantWebsdk.mod.CallEventTypes

import typings.voximplantWebsdk.mod.Call
import typings.voximplantWebsdk.mod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched when call transfer failed
  */
@js.native
trait TransferFailed extends VoxImplantCallEvent {
  /**
    *    Call that dispatched the event
    */
  var call: Call = js.native
}

object TransferFailed {
  @scala.inline
  def apply(call: Call): TransferFailed = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferFailed]
  }
  @scala.inline
  implicit class TransferFailedOps[Self <: TransferFailed] (val x: Self) extends AnyVal {
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
  }
  
}

