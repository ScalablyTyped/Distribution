package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when roster item changed
		*/

trait RosterItemChange extends js.Object {
  /**
  			*	User display name
  			*/
  var displayName: java.lang.String
  /**
  			*	Roster item groups
  			*/
  var groups: js.Array[java.lang.String]
  /**
  			*	User id
  			*/
  var id: java.lang.String
  /**
  			*	Resource name
  			*/
  var resource: js.UndefOr[java.lang.String] = js.undefined
  /**
  			*	Roster item event type. See VoxImplant.RosterItemEvent enum
  			*/
  var `type`: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.RosterItemEvent
}

