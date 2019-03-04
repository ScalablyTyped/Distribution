package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.CallEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched after if call failed
		*/
trait Failed
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Call
  /**
  			*	Status code of the call (i.e. 486)
  			*/
  var code: scala.Double
  /**
  			*	Optional SIP headers received with the message
  			*/
  var headers: js.UndefOr[js.Object] = js.undefined
  /**
  			*	Status message of call failure (i.e. Busy Here)
  			*/
  var reason: java.lang.String
}

object Failed {
  @scala.inline
  def apply(
    call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Call,
    code: scala.Double,
    reason: java.lang.String,
    headers: js.Object = null
  ): Failed = {
    val __obj = js.Dynamic.literal(call = call, code = code, reason = reason)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Failed]
  }
}

