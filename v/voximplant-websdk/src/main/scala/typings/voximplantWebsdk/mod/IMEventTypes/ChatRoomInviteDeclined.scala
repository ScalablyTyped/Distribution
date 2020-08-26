package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched if an invitation to chat room was declined by the invitee
  */
@js.native
trait ChatRoomInviteDeclined extends VoxImplantIMEvent {
  /**
    * User id (invitee)
    */
  var invitee: String = js.native
  /**
    * A reason of the invitation
    */
  var reason: String = js.native
  /**
    * Room id
    */
  var room: String = js.native
}

object ChatRoomInviteDeclined {
  @scala.inline
  def apply(invitee: String, reason: String, room: String): ChatRoomInviteDeclined = {
    val __obj = js.Dynamic.literal(invitee = invitee.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomInviteDeclined]
  }
  @scala.inline
  implicit class ChatRoomInviteDeclinedOps[Self <: ChatRoomInviteDeclined] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInvitee(value: String): Self = this.set("invitee", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoom(value: String): Self = this.set("room", value.asInstanceOf[js.Any])
  }
  
}

