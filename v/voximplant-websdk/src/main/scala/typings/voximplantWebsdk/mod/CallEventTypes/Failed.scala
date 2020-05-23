package typings.voximplantWebsdk.mod.CallEventTypes

import typings.voximplantWebsdk.mod.Call
import typings.voximplantWebsdk.mod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched after if call failed
  */
trait Failed extends VoxImplantCallEvent {
  /**
    *    Call that dispatched the event
    */
  var call: Call
  /**
    *    Status code of the call (i.e. 486)
    */
  var code: Double
  /**
    *    Optional SIP headers received with the message
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  /**
    *    Status message of call failure (i.e. Busy Here)
    */
  var reason: String
}

object Failed {
  @scala.inline
  def apply(call: Call, code: Double, reason: String, headers: js.Object = null): Failed = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failed]
  }
}

