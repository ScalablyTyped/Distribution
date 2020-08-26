package typings.voximplantWebsdk.mod.CallEventTypes

import typings.voximplantWebsdk.mod.Call
import typings.voximplantWebsdk.mod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched when INFO message is received
  */
@js.native
trait InfoReceived extends VoxImplantCallEvent {
  /**
    *    Content of the message
    */
  var body: String = js.native
  /**
    *    Call that dispatched the event
    */
  var call: Call = js.native
  /**
    *    Optional SIP headers received with the message
    */
  var headers: js.UndefOr[js.Object] = js.native
  /**
    *    MIME type of INFO message
    */
  var mimeType: String = js.native
}

object InfoReceived {
  @scala.inline
  def apply(body: String, call: Call, mimeType: String): InfoReceived = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], call = call.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoReceived]
  }
  @scala.inline
  implicit class InfoReceivedOps[Self <: InfoReceived] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setCall(value: Call): Self = this.set("call", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
  
}

