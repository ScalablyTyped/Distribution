package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when self presence updated
		*/
trait PresenceUpdate
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
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

object PresenceUpdate {
  @scala.inline
  def apply(
    id: java.lang.String,
    message: java.lang.String,
    presence: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.UserStatuses,
    resource: java.lang.String = null
  ): PresenceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("presence")(presence)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[PresenceUpdate]
  }
}

