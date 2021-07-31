package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when new participant joined the chat room
  */
trait ChatRoomNewParticipant
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    * User display name
    */
  var displayName: String
  
  /**
    * User id
    */
  var participant: String
  
  /**
    * Room id
    */
  var room: String
}
object ChatRoomNewParticipant {
  
  @scala.inline
  def apply(displayName: String, participant: String, room: String): ChatRoomNewParticipant = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], participant = participant.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomNewParticipant]
  }
  
  @scala.inline
  implicit class ChatRoomNewParticipantMutableBuilder[Self <: ChatRoomNewParticipant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipant(value: String): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
