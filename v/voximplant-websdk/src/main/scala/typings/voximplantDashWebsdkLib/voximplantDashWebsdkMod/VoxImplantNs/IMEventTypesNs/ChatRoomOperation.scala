package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat room participant was banned/unbanned
		*/
trait ChatRoomOperation
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			* Operation type
  			*/
  var operation: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatRoomOperationType
  /**
  			* Operation result: true/false - success/failure
  			*/
  var result: scala.Boolean
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

object ChatRoomOperation {
  @scala.inline
  def apply(
    operation: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatRoomOperationType,
    result: scala.Boolean,
    room: java.lang.String
  ): ChatRoomOperation = {
    val __obj = js.Dynamic.literal(operation = operation, result = result, room = room)
  
    __obj.asInstanceOf[ChatRoomOperation]
  }
}

