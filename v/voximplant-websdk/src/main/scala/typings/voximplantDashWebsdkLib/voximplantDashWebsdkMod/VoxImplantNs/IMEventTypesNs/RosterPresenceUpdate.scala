package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when roster item presence update happened
		*/

trait RosterPresenceUpdate extends js.Object {
  /**
  			*	User id
  			*/
  var id: java.lang.String
  /**
  			*	Status message
  			*/
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
  			*	Current presence status
  			*/
  var presence: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.UserStatuses
  /**
  			*	Resource name
  			*/
  var resource: js.UndefOr[java.lang.String] = js.undefined
}

