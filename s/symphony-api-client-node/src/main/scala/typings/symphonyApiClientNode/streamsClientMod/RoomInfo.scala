package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomInfo extends StObject {
  
  var roomAttributes: AllRoomAttributes
  
  var roomSystemInfo: RoomSystemInfo
}
object RoomInfo {
  
  @scala.inline
  def apply(roomAttributes: AllRoomAttributes, roomSystemInfo: RoomSystemInfo): RoomInfo = {
    val __obj = js.Dynamic.literal(roomAttributes = roomAttributes.asInstanceOf[js.Any], roomSystemInfo = roomSystemInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomInfo]
  }
  
  @scala.inline
  implicit class RoomInfoMutableBuilder[Self <: RoomInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoomAttributes(value: AllRoomAttributes): Self = StObject.set(x, "roomAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomSystemInfo(value: RoomSystemInfo): Self = StObject.set(x, "roomSystemInfo", value.asInstanceOf[js.Any])
  }
}
