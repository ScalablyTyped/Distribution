package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.CallEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched after call was disconnected
		*/
trait Disconnected
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Call
  /**
  			*	Optional SIP headers received with the message
  			*/
  var headers: js.UndefOr[js.Object] = js.undefined
}

object Disconnected {
  @scala.inline
  def apply(call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Call, headers: js.Object = null): Disconnected = {
    val __obj = js.Dynamic.literal(call = call)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Disconnected]
  }
}

