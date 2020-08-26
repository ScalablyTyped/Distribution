package typings.voximplantWebsdk.mod.CallEventTypes

import typings.voximplantWebsdk.mod.Call
import typings.voximplantWebsdk.mod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched after if call failed
  */
@js.native
trait Failed extends VoxImplantCallEvent {
  /**
    *    Call that dispatched the event
    */
  var call: Call = js.native
  /**
    *    Status code of the call (i.e. 486)
    */
  var code: Double = js.native
  /**
    *    Optional SIP headers received with the message
    */
  var headers: js.UndefOr[js.Object] = js.native
  /**
    *    Status message of call failure (i.e. Busy Here)
    */
  var reason: String = js.native
}

object Failed {
  @scala.inline
  def apply(call: Call, code: Double, reason: String): Failed = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failed]
  }
  @scala.inline
  implicit class FailedOps[Self <: Failed] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
  
}

