package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		* Event dispatched in case of error while chat room operation
		*/
trait ChatRoomError extends VoxImplantIMEvent {
  /**
  			* Error code
  			*/
  var code: String
  /**
  			* Operation name
  			*/
  var operation: String
  /**
  			* Room id
  			*/
  var room: String
  /**
  			* Error description
  			*/
  var text: String
}

object ChatRoomError {
  @scala.inline
  def apply(code: String, operation: String, room: String, text: String): ChatRoomError = {
    val __obj = js.Dynamic.literal(code = code, operation = operation, room = room, text = text)
  
    __obj.asInstanceOf[ChatRoomError]
  }
}

