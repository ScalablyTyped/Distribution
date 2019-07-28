package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypesNs

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched if an invitation to chat room was declined by the invitee
		*/
trait ChatRoomInviteDeclined extends VoxImplantIMEvent {
  /**
  			* User id (invitee)
  			*/
  var invitee: String
  /**
  			* A reason of the invitation
  			*/
  var reason: String
  /**
  			* Room id
  			*/
  var room: String
}

object ChatRoomInviteDeclined {
  @scala.inline
  def apply(invitee: String, reason: String, room: String): ChatRoomInviteDeclined = {
    val __obj = js.Dynamic.literal(invitee = invitee, reason = reason, room = room)
  
    __obj.asInstanceOf[ChatRoomInviteDeclined]
  }
}

