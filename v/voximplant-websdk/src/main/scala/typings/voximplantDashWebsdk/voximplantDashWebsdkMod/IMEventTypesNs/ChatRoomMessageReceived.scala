package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypesNs

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when instant message was sent to chat room
		*/
trait ChatRoomMessageReceived extends VoxImplantIMEvent {
  /**
  			* Message content
  			*/
  var content: String
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

object ChatRoomMessageReceived {
  @scala.inline
  def apply(
    content: String,
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): ChatRoomMessageReceived = {
    val __obj = js.Dynamic.literal(content = content, from = from, message_id = message_id, private_message = private_message, resource = resource, room = room, timestamp = timestamp)
  
    __obj.asInstanceOf[ChatRoomMessageReceived]
  }
}

