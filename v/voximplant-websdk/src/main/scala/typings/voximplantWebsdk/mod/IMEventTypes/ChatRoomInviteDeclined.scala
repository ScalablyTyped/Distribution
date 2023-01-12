package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched if an invitation to chat room was declined by the invitee
  */
trait ChatRoomInviteDeclined
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    * User id (invitee)
    */
  var invitee: String
  
  /**
    * A reason of the invitation
    */
  var reason: String
  
  /**
    * Room id
    */
  var room: String
}
object ChatRoomInviteDeclined {
  
  inline def apply(invitee: String, reason: String, room: String): ChatRoomInviteDeclined = {
    val __obj = js.Dynamic.literal(invitee = invitee.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomInviteDeclined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatRoomInviteDeclined] (val x: Self) extends AnyVal {
    
    inline def setInvitee(value: String): Self = StObject.set(x, "invitee", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
