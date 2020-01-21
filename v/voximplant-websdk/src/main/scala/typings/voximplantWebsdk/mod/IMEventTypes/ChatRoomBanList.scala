package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.ChatRoomParticipant
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when info about banned chat room participants received
		*/
trait ChatRoomBanList extends VoxImplantIMEvent {
  /**
  			* Participants list
  			*/
  var participants: js.Array[ChatRoomParticipant]
  /**
  			* Room id
  			*/
  var room: String
}

object ChatRoomBanList {
  @scala.inline
  def apply(participants: js.Array[ChatRoomParticipant], room: String): ChatRoomBanList = {
    val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChatRoomBanList]
  }
}

