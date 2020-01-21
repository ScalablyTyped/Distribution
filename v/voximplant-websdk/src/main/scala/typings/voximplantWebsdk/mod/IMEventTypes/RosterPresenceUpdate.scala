package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.UserStatuses
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterPresenceUpdate]
  }
}

