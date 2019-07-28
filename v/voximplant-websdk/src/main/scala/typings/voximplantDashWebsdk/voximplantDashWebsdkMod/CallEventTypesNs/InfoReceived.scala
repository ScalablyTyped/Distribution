package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypesNs

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Call
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when INFO message is received
		*/
trait InfoReceived extends VoxImplantCallEvent {
  /**
  			*	Content of the message
  			*/
  var body: String
  /**
  			*	Call that dispatched the event
  			*/
  var call: Call
  /**
  			*	Optional SIP headers received with the message
  			*/
  var headers: js.UndefOr[js.Object] = js.undefined
  /**
  			*	MIME type of INFO message
  			*/
  var mimeType: String
}

object InfoReceived {
  @scala.inline
  def apply(body: String, call: Call, mimeType: String, headers: js.Object = null): InfoReceived = {
    val __obj = js.Dynamic.literal(body = body, call = call, mimeType = mimeType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[InfoReceived]
  }
}

