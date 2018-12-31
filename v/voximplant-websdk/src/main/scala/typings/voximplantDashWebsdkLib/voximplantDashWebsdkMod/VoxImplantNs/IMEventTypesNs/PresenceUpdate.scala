package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when self presence updated
		*/
trait PresenceUpdate extends js.Object {
  /**
  			* User id
  			*/
  var id: java.lang.String
  /**
  			*	Status message
  			*/
  var message: java.lang.String
  /**
  			*	Current presence status
  			*/
  var presence: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.UserStatuses
  /**
  			*	Resource name
  			*/
  var resource: js.UndefOr[java.lang.String] = js.undefined
}

