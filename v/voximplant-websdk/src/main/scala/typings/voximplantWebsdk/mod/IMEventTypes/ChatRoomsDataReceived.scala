package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.ChatRoom
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched when information about chat rooms where user participates received
  */
@js.native
trait ChatRoomsDataReceived extends VoxImplantIMEvent {
  /**
    * Rooms list
    */
  var rooms: js.Array[ChatRoom] = js.native
}

object ChatRoomsDataReceived {
  @scala.inline
  def apply(rooms: js.Array[ChatRoom]): ChatRoomsDataReceived = {
    val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomsDataReceived]
  }
  @scala.inline
  implicit class ChatRoomsDataReceivedOps[Self <: ChatRoomsDataReceived] (val x: Self) extends AnyVal {
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
    def setRoomsVarargs(value: ChatRoom*): Self = this.set("rooms", js.Array(value :_*))
    @scala.inline
    def setRooms(value: js.Array[ChatRoom]): Self = this.set("rooms", value.asInstanceOf[js.Any])
  }
  
}

