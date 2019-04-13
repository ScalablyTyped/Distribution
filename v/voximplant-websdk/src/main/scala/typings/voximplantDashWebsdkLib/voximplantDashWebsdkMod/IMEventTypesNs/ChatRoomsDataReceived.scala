package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when information about chat rooms where user participates received
		*/
trait ChatRoomsDataReceived
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantIMEvent {
  /**
  			* Rooms list
  			*/
  var rooms: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatRoom]
}

object ChatRoomsDataReceived {
  @scala.inline
  def apply(rooms: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatRoom]): ChatRoomsDataReceived = {
    val __obj = js.Dynamic.literal(rooms = rooms)
  
    __obj.asInstanceOf[ChatRoomsDataReceived]
  }
}

