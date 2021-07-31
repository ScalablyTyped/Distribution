package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when chat room message removed
  */
trait ChatRoomMessageRemoved
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    * User id
    */
  var from: String
  
  /**
    * Modified message id
    */
  var message_id: String
  
  /**
    * Private/public message flag
    */
  var private_message: String
  
  /**
    * Resource name
    */
  var resource: String
  
  /**
    * Room id
    */
  var room: String
  
  /**
    * Message timestamp
    */
  var timestamp: String
}
object ChatRoomMessageRemoved {
  
  @scala.inline
  def apply(
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): ChatRoomMessageRemoved = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomMessageRemoved]
  }
  
  @scala.inline
  implicit class ChatRoomMessageRemovedMutableBuilder[Self <: ChatRoomMessageRemoved] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate_message(value: String): Self = StObject.set(x, "private_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
