package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat room message removed
		*/
trait ChatRoomMessageRemoved extends VoxImplantIMEvent {
  /**
  			* User id
  			*/
  var from: String
  /**
  			* Modified message id
  			*/
  var message_id: String
  /**
  			* Private/public message flag
  			*/
  var private_message: String
  /**
  			* Resource name
  			*/
  var resource: String
  /**
  			* Room id
  			*/
  var room: String
  /**
  			* Message timestamp
  			*/
  var timestamp: String
}

object ChatRoomMessageRemoved {
  @scala.inline
  def apply(
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): ChatRoomMessageRemoved = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomMessageRemoved]
  }
}

