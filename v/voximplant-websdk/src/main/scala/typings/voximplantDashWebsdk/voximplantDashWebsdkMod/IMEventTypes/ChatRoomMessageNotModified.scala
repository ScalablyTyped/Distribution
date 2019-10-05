package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched in case of error during chat room message modification
		*/
trait ChatRoomMessageNotModified extends VoxImplantIMEvent {
  /**
  			* Error code
  			*/
  var code: Double
  /**
  			* Message id
  			*/
  var message_id: String
  /**
  			* Private/public message flag
  			*/
  var private_message: String
  /**
  			* Room id
  			*/
  var room: String
}

object ChatRoomMessageNotModified {
  @scala.inline
  def apply(code: Double, message_id: String, private_message: String, room: String): ChatRoomMessageNotModified = {
    val __obj = js.Dynamic.literal(code = code, message_id = message_id, private_message = private_message, room = room)
  
    __obj.asInstanceOf[ChatRoomMessageNotModified]
  }
}

