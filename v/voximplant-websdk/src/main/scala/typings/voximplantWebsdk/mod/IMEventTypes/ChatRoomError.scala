package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event dispatched in case of error while chat room operation
  */
@js.native
trait ChatRoomError extends VoxImplantIMEvent {
  /**
    * Error code
    */
  var code: String = js.native
  /**
    * Operation name
    */
  var operation: String = js.native
  /**
    * Room id
    */
  var room: String = js.native
  /**
    * Error description
    */
  var text: String = js.native
}

object ChatRoomError {
  @scala.inline
  def apply(code: String, operation: String, room: String, text: String): ChatRoomError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomError]
  }
  @scala.inline
  implicit class ChatRoomErrorOps[Self <: ChatRoomError] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoom(value: String): Self = this.set("room", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

