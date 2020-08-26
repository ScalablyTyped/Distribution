package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched when instant message was modified by user
  */
@js.native
trait MessageModified extends VoxImplantIMEvent {
  /**
    *    Message new content
    */
  var content: String = js.native
  /**
    *    User id (of the user who sent the message)
    */
  var id: String = js.native
  /**
    *    Message id
    */
  var message_id: String = js.native
  /**
    *    User id (of the user to whom the message was sent)
    */
  var to: String = js.native
}

object MessageModified {
  @scala.inline
  def apply(content: String, id: String, message_id: String, to: String): MessageModified = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageModified]
  }
  @scala.inline
  implicit class MessageModifiedOps[Self <: MessageModified] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage_id(value: String): Self = this.set("message_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

