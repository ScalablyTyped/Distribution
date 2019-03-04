package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.EventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when there is a new incoming call to current user
		*/
trait IncomingCall
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantEvent {
  /**
  			*	Incoming call instance. See VoxImplant.Call for details
  			*/
  var call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Call
  /**
  			*	Optional SIP headers received with the message
  			*/
  var headers: js.UndefOr[js.Object] = js.undefined
}

object IncomingCall {
  @scala.inline
  def apply(call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Call, headers: js.Object = null): IncomingCall = {
    val __obj = js.Dynamic.literal(call = call)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[IncomingCall]
  }
}

