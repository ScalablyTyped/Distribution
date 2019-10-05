package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
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
    val __obj = js.Dynamic.literal(from = from, message_id = message_id, private_message = private_message, resource = resource, room = room, timestamp = timestamp)
  
    __obj.asInstanceOf[ChatRoomMessageRemoved]
  }
}

