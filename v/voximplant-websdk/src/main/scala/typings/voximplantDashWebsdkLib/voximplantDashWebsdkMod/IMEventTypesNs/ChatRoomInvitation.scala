package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when invitation to chat room received
		*/
trait ChatRoomInvitation
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantIMEvent {
  /**
  			* The body of the message
  			*/
  var body: java.lang.String
  /**
  			* User id (inviter)
  			*/
  var from: java.lang.String
  /**
  			* Password for the room
  			*/
  var password: java.lang.String
  /**
  			* A reason of the invitation
  			*/
  var reason: java.lang.String
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

object ChatRoomInvitation {
  @scala.inline
  def apply(
    body: java.lang.String,
    from: java.lang.String,
    password: java.lang.String,
    reason: java.lang.String,
    room: java.lang.String
  ): ChatRoomInvitation = {
    val __obj = js.Dynamic.literal(body = body, from = from, password = password, reason = reason, room = room)
  
    __obj.asInstanceOf[ChatRoomInvitation]
  }
}

