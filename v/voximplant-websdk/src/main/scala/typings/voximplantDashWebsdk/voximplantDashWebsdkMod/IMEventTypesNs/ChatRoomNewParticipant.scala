package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypesNs

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when new participant joined the chat room
		*/
trait ChatRoomNewParticipant extends VoxImplantIMEvent {
  /**
  			* User display name
  			*/
  var displayName: String
  /**
  			* User id
  			*/
  var participant: String
  /**
  			* Room id
  			*/
  var room: String
}

object ChatRoomNewParticipant {
  @scala.inline
  def apply(displayName: String, participant: String, room: String): ChatRoomNewParticipant = {
    val __obj = js.Dynamic.literal(displayName = displayName, participant = participant, room = room)
  
    __obj.asInstanceOf[ChatRoomNewParticipant]
  }
}

