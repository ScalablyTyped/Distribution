package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.EventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when there is a new incoming call to current user
		*/
trait IncomingCall
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantEvent {
  /**
  			*	Incoming call instance. See VoxImplant.Call for details
  			*/
  var call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.Call
  /**
  			*	Optional SIP headers received with the message
  			*/
  var headers: js.UndefOr[js.Object] = js.undefined
}

object IncomingCall {
  @scala.inline
  def apply(call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.Call, headers: js.Object = null): IncomingCall = {
    val __obj = js.Dynamic.literal(call = call)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[IncomingCall]
  }
}

