package typings.voximplantWebsdk.mod.EventTypes

import typings.voximplantWebsdk.mod.Call
import typings.voximplantWebsdk.mod.VoxImplantEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched when there is a new incoming call to current user
  */
trait IncomingCall extends VoxImplantEvent {
  /**
    *    Incoming call instance. See VoxImplant.Call for details
    */
  var call: Call
  /**
    *    Optional SIP headers received with the message
    */
  var headers: js.UndefOr[js.Object] = js.undefined
}

object IncomingCall {
  @scala.inline
  def apply(call: Call, headers: js.Object = null): IncomingCall = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingCall]
  }
}

