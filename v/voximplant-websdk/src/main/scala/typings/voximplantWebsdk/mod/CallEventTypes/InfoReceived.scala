package typings.voximplantWebsdk.mod.CallEventTypes

import typings.voximplantWebsdk.mod.Call
import typings.voximplantWebsdk.mod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched when INFO message is received
  */
trait InfoReceived extends VoxImplantCallEvent {
  /**
    *    Content of the message
    */
  var body: String
  /**
    *    Call that dispatched the event
    */
  var call: Call
  /**
    *    Optional SIP headers received with the message
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  /**
    *    MIME type of INFO message
    */
  var mimeType: String
}

object InfoReceived {
  @scala.inline
  def apply(body: String, call: Call, mimeType: String, headers: js.Object = null): InfoReceived = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], call = call.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoReceived]
  }
}

