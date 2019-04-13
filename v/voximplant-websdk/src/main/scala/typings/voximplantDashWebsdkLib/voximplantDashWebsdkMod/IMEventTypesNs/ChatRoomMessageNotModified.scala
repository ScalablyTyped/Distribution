package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched in case of error during chat room message modification
		*/
trait ChatRoomMessageNotModified
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantIMEvent {
  /**
  			* Error code
  			*/
  var code: scala.Double
  /**
  			* Message id
  			*/
  var message_id: java.lang.String
  /**
  			* Private/public message flag
  			*/
  var private_message: java.lang.String
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

object ChatRoomMessageNotModified {
  @scala.inline
  def apply(
    code: scala.Double,
    message_id: java.lang.String,
    private_message: java.lang.String,
    room: java.lang.String
  ): ChatRoomMessageNotModified = {
    val __obj = js.Dynamic.literal(code = code, message_id = message_id, private_message = private_message, room = room)
  
    __obj.asInstanceOf[ChatRoomMessageNotModified]
  }
}

