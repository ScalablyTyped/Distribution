package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	VoxImplant login options
	*/
trait LoginOptions extends js.Object {
  /**
  		*	If set to false Web SDK can be used only for ACD status management
  		*/
  var receiveCalls: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*	If set to true user presence will be changed automatically while a call
  		*/
  var serverPresenceControl: js.UndefOr[scala.Boolean] = js.undefined
}

