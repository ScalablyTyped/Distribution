package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when instant message was sent to chat room
		*/
trait ChatRoomMessageReceived
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			* Message content
  			*/
  var content: java.lang.String
  /**
  			* User id
  			*/
  var from: java.lang.String
  /**
  			* Modified message id
  			*/
  var message_id: java.lang.String
  /**
  			* Private/public message flag
  			*/
  var private_message: java.lang.String
  /**
  			* Resource name
  			*/
  var resource: java.lang.String
  /**
  			* Room id
  			*/
  var room: java.lang.String
  /**
  			* Message timestamp
  			*/
  var timestamp: java.lang.String
}

object ChatRoomMessageReceived {
  @scala.inline
  def apply(
    content: java.lang.String,
    from: java.lang.String,
    message_id: java.lang.String,
    private_message: java.lang.String,
    resource: java.lang.String,
    room: java.lang.String,
    timestamp: java.lang.String
  ): ChatRoomMessageReceived = {
    val __obj = js.Dynamic.literal(content = content, from = from, message_id = message_id, private_message = private_message, resource = resource, room = room, timestamp = timestamp)
  
    __obj.asInstanceOf[ChatRoomMessageReceived]
  }
}

