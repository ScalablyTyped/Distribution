package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched when instant message was removed by user
  */
@js.native
trait MessageRemoved extends VoxImplantIMEvent {
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

object MessageRemoved {
  @scala.inline
  def apply(id: String, message_id: String, to: String): MessageRemoved = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRemoved]
  }
  @scala.inline
  implicit class MessageRemovedOps[Self <: MessageRemoved] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage_id(value: String): Self = this.set("message_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

