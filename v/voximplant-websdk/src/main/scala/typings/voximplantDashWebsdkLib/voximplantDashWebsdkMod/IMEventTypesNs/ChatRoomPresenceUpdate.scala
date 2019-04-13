package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched if chat room participant presence status was updated
		*/
trait ChatRoomPresenceUpdate
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantIMEvent {
  /**
  			* Optional presence message
  			*/
  var message: java.lang.String
  /**
  			* Participant info
  			*/
  var participant: voximplantDashWebsdkLib.voximplantDashWebsdkMod.ParticipantInfo
  /**
  			* Current presence status
  			*/
  var presence: voximplantDashWebsdkLib.voximplantDashWebsdkMod.UserStatuses
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

object ChatRoomPresenceUpdate {
  @scala.inline
  def apply(
    message: java.lang.String,
    participant: voximplantDashWebsdkLib.voximplantDashWebsdkMod.ParticipantInfo,
    presence: voximplantDashWebsdkLib.voximplantDashWebsdkMod.UserStatuses,
    room: java.lang.String
  ): ChatRoomPresenceUpdate = {
    val __obj = js.Dynamic.literal(message = message, participant = participant, presence = presence, room = room)
  
    __obj.asInstanceOf[ChatRoomPresenceUpdate]
  }
}

