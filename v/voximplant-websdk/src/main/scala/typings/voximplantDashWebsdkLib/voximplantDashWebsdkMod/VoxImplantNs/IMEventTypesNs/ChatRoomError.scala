package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		* Event dispatched in case of error while chat room operation
		*/
trait ChatRoomError
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			* Error code
  			*/
  var code: java.lang.String
  /**
  			* Operation name
  			*/
  var operation: java.lang.String
  /**
  			* Room id
  			*/
  var room: java.lang.String
  /**
  			* Error description
  			*/
  var text: java.lang.String
}

object ChatRoomError {
  @scala.inline
  def apply(
    code: java.lang.String,
    operation: java.lang.String,
    room: java.lang.String,
    text: java.lang.String
  ): ChatRoomError = {
    val __obj = js.Dynamic.literal(code = code, operation = operation, room = room, text = text)
  
    __obj.asInstanceOf[ChatRoomError]
  }
}

