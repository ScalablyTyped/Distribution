package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when info about banned chat room participants received
		*/
trait ChatRoomBanList
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			* Participants list
  			*/
  var participants: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatRoomParticipant]
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

object ChatRoomBanList {
  @scala.inline
  def apply(
    participants: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatRoomParticipant],
    room: java.lang.String
  ): ChatRoomBanList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("participants")(participants)
    __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[ChatRoomBanList]
  }
}

