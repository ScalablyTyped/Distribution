package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
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
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], participant = participant.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomNewParticipant]
  }
}

