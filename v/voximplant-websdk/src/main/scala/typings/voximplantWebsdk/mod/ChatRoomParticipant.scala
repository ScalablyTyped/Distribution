package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Chat room participant
  */
trait ChatRoomParticipant extends StObject {
  
  /**
    * User id
    */
  var id: String
  
  /**
    * User display name
    */
  var name: String
  
  /**
    * True if the user is owner/admin of the room
    */
  var owner: js.UndefOr[Boolean] = js.undefined
}
object ChatRoomParticipant {
  
  @scala.inline
  def apply(id: String, name: String): ChatRoomParticipant = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomParticipant]
  }
  
  @scala.inline
  implicit class ChatRoomParticipantMutableBuilder[Self <: ChatRoomParticipant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: Boolean): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
