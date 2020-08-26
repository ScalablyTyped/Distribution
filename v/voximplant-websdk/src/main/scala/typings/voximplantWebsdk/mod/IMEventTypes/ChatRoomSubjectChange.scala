package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched if chat room subject was changed
  */
@js.native
trait ChatRoomSubjectChange extends VoxImplantIMEvent {
  /**
    * User id who changed the subject
    */
  var id: String = js.native
  /**
    * Resource name
    */
  var resource: String = js.native
  /**
    * Room id
    */
  var room: String = js.native
  /**
    * New subject
    */
  var subject: String = js.native
}

object ChatRoomSubjectChange {
  @scala.inline
  def apply(id: String, resource: String, room: String, subject: String): ChatRoomSubjectChange = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomSubjectChange]
  }
  @scala.inline
  implicit class ChatRoomSubjectChangeOps[Self <: ChatRoomSubjectChange] (val x: Self) extends AnyVal {
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
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoom(value: String): Self = this.set("room", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
  }
  
}

