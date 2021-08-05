package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when participant left the chat room
  */
trait ChatRoomParticipantExit
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    * User id
    */
  var participant: String
  
  /**
    * Room id
    */
  var room: String
}
object ChatRoomParticipantExit {
  
  inline def apply(participant: String, room: String): ChatRoomParticipantExit = {
    val __obj = js.Dynamic.literal(participant = participant.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomParticipantExit]
  }
  
  extension [Self <: ChatRoomParticipantExit](x: Self) {
    
    inline def setParticipant(value: String): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
