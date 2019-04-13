package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when info about banned chat room participants received
		*/
trait ChatRoomBanList
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantIMEvent {
  /**
  			* Participants list
  			*/
  var participants: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatRoomParticipant]
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

object ChatRoomBanList {
  @scala.inline
  def apply(
    participants: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatRoomParticipant],
    room: java.lang.String
  ): ChatRoomBanList = {
    val __obj = js.Dynamic.literal(participants = participants, room = room)
  
    __obj.asInstanceOf[ChatRoomBanList]
  }
}

