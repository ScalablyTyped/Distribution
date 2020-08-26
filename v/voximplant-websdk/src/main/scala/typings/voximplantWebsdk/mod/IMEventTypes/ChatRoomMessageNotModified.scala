package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched in case of error during chat room message modification
  */
@js.native
trait ChatRoomMessageNotModified extends VoxImplantIMEvent {
  /**
    * Error code
    */
  var code: Double = js.native
  /**
    * Message id
    */
  var message_id: String = js.native
  /**
    * Private/public message flag
    */
  var private_message: String = js.native
  /**
    * Room id
    */
  var room: String = js.native
}

object ChatRoomMessageNotModified {
  @scala.inline
  def apply(code: Double, message_id: String, private_message: String, room: String): ChatRoomMessageNotModified = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomMessageNotModified]
  }
  @scala.inline
  implicit class ChatRoomMessageNotModifiedOps[Self <: ChatRoomMessageNotModified] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage_id(value: String): Self = this.set("message_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivate_message(value: String): Self = this.set("private_message", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoom(value: String): Self = this.set("room", value.asInstanceOf[js.Any])
  }
  
}

