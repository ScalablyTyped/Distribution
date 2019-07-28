package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypesNs

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Call
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched after call was connected
		*/
trait Connected extends VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: Call
  /**
  			*	Optional SIP headers received with the message
  			*/
  var headers: js.UndefOr[js.Object] = js.undefined
}

object Connected {
  @scala.inline
  def apply(call: Call, headers: js.Object = null): Connected = {
    val __obj = js.Dynamic.literal(call = call)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Connected]
  }
}

