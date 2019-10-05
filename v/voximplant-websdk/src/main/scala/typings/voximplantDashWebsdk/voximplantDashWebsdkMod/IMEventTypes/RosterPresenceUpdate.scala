package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.UserStatuses
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when roster item presence update happened
		*/
trait RosterPresenceUpdate extends VoxImplantIMEvent {
  /**
  			*	User id
  			*/
  var id: String
  /**
  			*	Status message
  			*/
  var message: js.UndefOr[String] = js.undefined
  /**
  			*	Current presence status
  			*/
  var presence: UserStatuses
  /**
  			*	Resource name
  			*/
  var resource: js.UndefOr[String] = js.undefined
}

object RosterPresenceUpdate {
  @scala.inline
  def apply(id: String, presence: UserStatuses, message: String = null, resource: String = null): RosterPresenceUpdate = {
    val __obj = js.Dynamic.literal(id = id, presence = presence)
    if (message != null) __obj.updateDynamic("message")(message)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[RosterPresenceUpdate]
  }
}

