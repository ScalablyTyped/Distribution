package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched in case of error during chat room message modification
		*/
trait ChatRoomMessageNotModified
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message_id")(message_id)
    __obj.updateDynamic("private_message")(private_message)
    __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[ChatRoomMessageNotModified]
  }
}

