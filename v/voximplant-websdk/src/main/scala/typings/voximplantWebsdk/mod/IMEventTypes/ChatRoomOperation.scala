package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.ChatRoomOperationType
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched when chat room participant was banned/unbanned
  */
@js.native
trait ChatRoomOperation extends VoxImplantIMEvent {
  /**
    * Operation type
    */
  var operation: ChatRoomOperationType = js.native
  /**
    * Operation result: true/false - success/failure
    */
  var result: Boolean = js.native
  /**
    * Room id
    */
  var room: String = js.native
}

object ChatRoomOperation {
  @scala.inline
  def apply(operation: ChatRoomOperationType, result: Boolean, room: String): ChatRoomOperation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomOperation]
  }
  @scala.inline
  implicit class ChatRoomOperationOps[Self <: ChatRoomOperation] (val x: Self) extends AnyVal {
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
    def setOperation(value: ChatRoomOperationType): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: Boolean): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoom(value: String): Self = this.set("room", value.asInstanceOf[js.Any])
  }
  
}

