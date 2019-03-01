package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when roster item presence update happened
		*/
trait RosterPresenceUpdate
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
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

object RosterPresenceUpdate {
  @scala.inline
  def apply(
    id: java.lang.String,
    presence: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.UserStatuses,
    message: java.lang.String = null,
    resource: java.lang.String = null
  ): RosterPresenceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("presence")(presence)
    if (message != null) __obj.updateDynamic("message")(message)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[RosterPresenceUpdate]
  }
}

