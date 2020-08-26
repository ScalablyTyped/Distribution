package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.MessageEventType
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched when sent message status changed
  */
@js.native
trait MessageStatus extends VoxImplantIMEvent {
  /**
    *    User id
    */
  var id: String = js.native
  /**
    *    Message id
    */
  var message_id: String = js.native
  /**
    *    Resource name
    */
  var resource: js.UndefOr[String] = js.native
  /**
    *    Message event type. See VoxImplant.MessageEventType enum
    */
  var `type`: MessageEventType = js.native
}

object MessageStatus {
  @scala.inline
  def apply(id: String, message_id: String, `type`: MessageEventType): MessageStatus = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageStatus]
  }
  @scala.inline
  implicit class MessageStatusOps[Self <: MessageStatus] (val x: Self) extends AnyVal {
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
    def setType(value: MessageEventType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
  
}

