package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when roster item changed
		*/
trait RosterItemChange
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantIMEvent {
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
  var `type`: voximplantDashWebsdkLib.voximplantDashWebsdkMod.RosterItemEvent
}

object RosterItemChange {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    groups: js.Array[java.lang.String],
    id: java.lang.String,
    `type`: voximplantDashWebsdkLib.voximplantDashWebsdkMod.RosterItemEvent,
    resource: java.lang.String = null
  ): RosterItemChange = {
    val __obj = js.Dynamic.literal(displayName = displayName, groups = groups, id = id)
    __obj.updateDynamic("type")(`type`)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[RosterItemChange]
  }
}

