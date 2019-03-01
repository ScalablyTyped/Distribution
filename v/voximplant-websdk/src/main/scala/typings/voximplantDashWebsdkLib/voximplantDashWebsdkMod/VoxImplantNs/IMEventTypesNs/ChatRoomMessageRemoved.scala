package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat room message removed
		*/
trait ChatRoomMessageRemoved
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
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

object ChatRoomMessageRemoved {
  @scala.inline
  def apply(
    from: java.lang.String,
    message_id: java.lang.String,
    private_message: java.lang.String,
    resource: java.lang.String,
    room: java.lang.String,
    timestamp: java.lang.String
  ): ChatRoomMessageRemoved = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("message_id")(message_id)
    __obj.updateDynamic("private_message")(private_message)
    __obj.updateDynamic("resource")(resource)
    __obj.updateDynamic("room")(room)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[ChatRoomMessageRemoved]
  }
}

