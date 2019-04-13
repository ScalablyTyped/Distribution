package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when participant left the chat room
		*/
trait ChatRoomParticipantExit
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantIMEvent {
  /**
  			* User id
  			*/
  var participant: java.lang.String
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

object ChatRoomParticipantExit {
  @scala.inline
  def apply(participant: java.lang.String, room: java.lang.String): ChatRoomParticipantExit = {
    val __obj = js.Dynamic.literal(participant = participant, room = room)
  
    __obj.asInstanceOf[ChatRoomParticipantExit]
  }
}

