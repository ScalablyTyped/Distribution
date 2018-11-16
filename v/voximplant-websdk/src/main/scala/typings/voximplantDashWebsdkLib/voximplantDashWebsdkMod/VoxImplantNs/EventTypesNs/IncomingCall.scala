package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.EventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when there is a new incoming call to current user
		*/

trait IncomingCall extends js.Object {
  /**
  			*	Incoming call instance. See VoxImplant.Call for details
  			*/
  var call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Call
  /**
  			*	Optional SIP headers received with the message
  			*/
  var headers: js.UndefOr[js.Object] = js.undefined
}

