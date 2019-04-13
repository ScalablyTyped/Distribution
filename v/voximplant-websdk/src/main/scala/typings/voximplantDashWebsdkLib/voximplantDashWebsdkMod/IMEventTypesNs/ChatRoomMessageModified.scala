package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat room message modified
		*/
trait ChatRoomMessageModified
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantIMEvent {
  /**
  			* New message content
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

object ChatRoomMessageModified {
  @scala.inline
  def apply(
    content: java.lang.String,
    from: java.lang.String,
    message_id: java.lang.String,
    private_message: java.lang.String,
    resource: java.lang.String,
    room: java.lang.String,
    timestamp: java.lang.String
  ): ChatRoomMessageModified = {
    val __obj = js.Dynamic.literal(content = content, from = from, message_id = message_id, private_message = private_message, resource = resource, room = room, timestamp = timestamp)
  
    __obj.asInstanceOf[ChatRoomMessageModified]
  }
}

