package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event dispatched if chat room was created successfully
  */
@js.native
trait ChatRoomCreated extends VoxImplantIMEvent {
  
  /**
    * Room id
    */
  var room: String = js.native
}
object ChatRoomCreated {
  
  @scala.inline
  def apply(room: String): ChatRoomCreated = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomCreated]
  }
  
  @scala.inline
  implicit class ChatRoomCreatedMutableBuilder[Self <: ChatRoomCreated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
