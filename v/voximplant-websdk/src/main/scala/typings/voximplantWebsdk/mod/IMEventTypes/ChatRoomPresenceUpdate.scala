package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.ParticipantInfo
import typings.voximplantWebsdk.mod.UserStatuses
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched if chat room participant presence status was updated
  */
@js.native
trait ChatRoomPresenceUpdate extends VoxImplantIMEvent {
  
  /**
    * Optional presence message
    */
  var message: String = js.native
  
  /**
    * Participant info
    */
  var participant: ParticipantInfo = js.native
  
  /**
    * Current presence status
    */
  var presence: UserStatuses = js.native
  
  /**
    * Room id
    */
  var room: String = js.native
}
object ChatRoomPresenceUpdate {
  
  @scala.inline
  def apply(message: String, participant: ParticipantInfo, presence: UserStatuses, room: String): ChatRoomPresenceUpdate = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], participant = participant.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomPresenceUpdate]
  }
  
  @scala.inline
  implicit class ChatRoomPresenceUpdateOps[Self <: ChatRoomPresenceUpdate] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipant(value: ParticipantInfo): Self = this.set("participant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresence(value: UserStatuses): Self = this.set("presence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: String): Self = this.set("room", value.asInstanceOf[js.Any])
  }
}
