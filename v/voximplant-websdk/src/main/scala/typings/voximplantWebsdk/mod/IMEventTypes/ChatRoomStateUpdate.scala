package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.ChatStateType
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when chat session state updated
  */
@js.native
trait ChatRoomStateUpdate extends VoxImplantIMEvent {
  
  /**
    * User id
    */
  var from: String = js.native
  
  /**
    * Resource name
    */
  var resource: String = js.native
  
  /**
    * Room id
    */
  var room: String = js.native
  
  /**
    * Current chat session state
    */
  var state: ChatStateType = js.native
}
object ChatRoomStateUpdate {
  
  @scala.inline
  def apply(from: String, resource: String, room: String, state: ChatStateType): ChatRoomStateUpdate = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomStateUpdate]
  }
  
  @scala.inline
  implicit class ChatRoomStateUpdateMutableBuilder[Self <: ChatRoomStateUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: ChatStateType): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
