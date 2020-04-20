package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when invitation to chat room received
		*/
trait ChatRoomInvitation extends VoxImplantIMEvent {
  /**
  			* The body of the message
  			*/
  var body: String
  /**
  			* User id (inviter)
  			*/
  var from: String
  /**
  			* Password for the room
  			*/
  var password: String
  /**
  			* A reason of the invitation
  			*/
  var reason: String
  /**
  			* Room id
  			*/
  var room: String
}

object ChatRoomInvitation {
  @scala.inline
  def apply(body: String, from: String, password: String, reason: String, room: String): ChatRoomInvitation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomInvitation]
  }
}

