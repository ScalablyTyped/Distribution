package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when roster item presence update happened
		*/
trait RosterPresenceUpdate
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantIMEvent {
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
  var presence: voximplantDashWebsdkLib.voximplantDashWebsdkMod.UserStatuses
  /**
  			*	Resource name
  			*/
  var resource: js.UndefOr[java.lang.String] = js.undefined
}

object RosterPresenceUpdate {
  @scala.inline
  def apply(
    id: java.lang.String,
    presence: voximplantDashWebsdkLib.voximplantDashWebsdkMod.UserStatuses,
    message: java.lang.String = null,
    resource: java.lang.String = null
  ): RosterPresenceUpdate = {
    val __obj = js.Dynamic.literal(id = id, presence = presence)
    if (message != null) __obj.updateDynamic("message")(message)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[RosterPresenceUpdate]
  }
}

