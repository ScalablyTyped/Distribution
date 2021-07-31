package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.ChatRoomParticipant
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when info about banned chat room participants received
  */
trait ChatRoomBanList
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    * Participants list
    */
  var participants: js.Array[ChatRoomParticipant]
  
  /**
    * Room id
    */
  var room: String
}
object ChatRoomBanList {
  
  @scala.inline
  def apply(participants: js.Array[ChatRoomParticipant], room: String): ChatRoomBanList = {
    val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomBanList]
  }
  
  @scala.inline
  implicit class ChatRoomBanListMutableBuilder[Self <: ChatRoomBanList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParticipants(value: js.Array[ChatRoomParticipant]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantsVarargs(value: ChatRoomParticipant*): Self = StObject.set(x, "participants", js.Array(value :_*))
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
