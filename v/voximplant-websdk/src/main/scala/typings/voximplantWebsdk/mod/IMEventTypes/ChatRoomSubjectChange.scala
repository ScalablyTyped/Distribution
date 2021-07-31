package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched if chat room subject was changed
  */
trait ChatRoomSubjectChange
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    * User id who changed the subject
    */
  var id: String
  
  /**
    * Resource name
    */
  var resource: String
  
  /**
    * Room id
    */
  var room: String
  
  /**
    * New subject
    */
  var subject: String
}
object ChatRoomSubjectChange {
  
  @scala.inline
  def apply(id: String, resource: String, room: String, subject: String): ChatRoomSubjectChange = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomSubjectChange]
  }
  
  @scala.inline
  implicit class ChatRoomSubjectChangeMutableBuilder[Self <: ChatRoomSubjectChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
