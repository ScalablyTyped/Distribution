package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when info about chat room participants received
		*/
trait ChatRoomParticipants
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

object ChatRoomParticipants {
  @scala.inline
  def apply(
    participants: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatRoomParticipant],
    room: java.lang.String
  ): ChatRoomParticipants = {
    val __obj = js.Dynamic.literal(participants = participants, room = room)
  
    __obj.asInstanceOf[ChatRoomParticipants]
  }
}

