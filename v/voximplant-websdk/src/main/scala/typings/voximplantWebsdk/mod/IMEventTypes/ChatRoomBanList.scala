package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.ChatRoomParticipant
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched when info about banned chat room participants received
  */
@js.native
trait ChatRoomBanList extends VoxImplantIMEvent {
  /**
    * Participants list
    */
  var participants: js.Array[ChatRoomParticipant] = js.native
  /**
    * Room id
    */
  var room: String = js.native
}

object ChatRoomBanList {
  @scala.inline
  def apply(participants: js.Array[ChatRoomParticipant], room: String): ChatRoomBanList = {
    val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomBanList]
  }
  @scala.inline
  implicit class ChatRoomBanListOps[Self <: ChatRoomBanList] (val x: Self) extends AnyVal {
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
    def setParticipantsVarargs(value: ChatRoomParticipant*): Self = this.set("participants", js.Array(value :_*))
    @scala.inline
    def setParticipants(value: js.Array[ChatRoomParticipant]): Self = this.set("participants", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoom(value: String): Self = this.set("room", value.asInstanceOf[js.Any])
  }
  
}

