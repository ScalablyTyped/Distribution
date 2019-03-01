package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when information about chat rooms where user participates received
		*/
trait ChatRoomsDataReceived
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			* Rooms list
  			*/
  var rooms: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatRoom]
}

object ChatRoomsDataReceived {
  @scala.inline
  def apply(rooms: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatRoom]): ChatRoomsDataReceived = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rooms")(rooms)
    __obj.asInstanceOf[ChatRoomsDataReceived]
  }
}

