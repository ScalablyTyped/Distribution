package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when user joins chat room
  */
@js.native
trait ChatRoomInfo extends VoxImplantIMEvent {
  
  /**
    * Room features
    */
  var features: Double = js.native
  
  /**
    * Room info object
    */
  var info: ChatRoomInfo = js.native
  
  /**
    * Room id
    */
  var room: String = js.native
  
  /**
    * Room name
    */
  var room_name: String = js.native
}
object ChatRoomInfo {
  
  @scala.inline
  def apply(features: Double, info: ChatRoomInfo, room: String, room_name: String): ChatRoomInfo = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], room_name = room_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomInfo]
  }
  
  @scala.inline
  implicit class ChatRoomInfoMutableBuilder[Self <: ChatRoomInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: Double): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: ChatRoomInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom_name(value: String): Self = StObject.set(x, "room_name", value.asInstanceOf[js.Any])
  }
}
