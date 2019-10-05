package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.ChatRoomOperationType
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat room participant was banned/unbanned
		*/
trait ChatRoomOperation extends VoxImplantIMEvent {
  /**
  			* Operation type
  			*/
  var operation: ChatRoomOperationType
  /**
  			* Operation result: true/false - success/failure
  			*/
  var result: Boolean
  /**
  			* Room id
  			*/
  var room: String
}

object ChatRoomOperation {
  @scala.inline
  def apply(operation: ChatRoomOperationType, result: Boolean, room: String): ChatRoomOperation = {
    val __obj = js.Dynamic.literal(operation = operation, result = result, room = room)
  
    __obj.asInstanceOf[ChatRoomOperation]
  }
}

