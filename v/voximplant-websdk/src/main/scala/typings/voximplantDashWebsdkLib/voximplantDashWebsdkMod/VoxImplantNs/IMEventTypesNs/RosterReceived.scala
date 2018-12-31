package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when roster data received
		*/
trait RosterReceived extends js.Object {
  /**
  			*	User id
  			*/
  var id: java.lang.String
  /**
  			*	Array contains VoxImplant.RosterItem elements
  			*/
  var roster: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.RosterItem]
}

