package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched when chat room message modified
  */
@js.native
trait ChatRoomMessageModified extends VoxImplantIMEvent {
  /**
    * New message content
    */
  var content: String = js.native
  /**
    * User id
    */
  var from: String = js.native
  /**
    * Modified message id
    */
  var message_id: String = js.native
  /**
    * Private/public message flag
    */
  var private_message: String = js.native
  /**
    * Resource name
    */
  var resource: String = js.native
  /**
    * Room id
    */
  var room: String = js.native
  /**
    * Message timestamp
    */
  var timestamp: String = js.native
}

object ChatRoomMessageModified {
  @scala.inline
  def apply(
    content: String,
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): ChatRoomMessageModified = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomMessageModified]
  }
  @scala.inline
  implicit class ChatRoomMessageModifiedOps[Self <: ChatRoomMessageModified] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage_id(value: String): Self = this.set("message_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivate_message(value: String): Self = this.set("private_message", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoom(value: String): Self = this.set("room", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

