package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Call
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched after call was disconnected
		*/
trait Disconnected extends VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: Call
  /**
  			*	Optional SIP headers received with the message
  			*/
  var headers: js.UndefOr[js.Object] = js.undefined
}

object Disconnected {
  @scala.inline
  def apply(call: Call, headers: js.Object = null): Disconnected = {
    val __obj = js.Dynamic.literal(call = call)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Disconnected]
  }
}

