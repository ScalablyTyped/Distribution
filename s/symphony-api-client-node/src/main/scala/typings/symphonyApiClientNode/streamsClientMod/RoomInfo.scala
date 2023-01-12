package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomInfo extends StObject {
  
  var roomAttributes: AllRoomAttributes
  
  var roomSystemInfo: RoomSystemInfo
}
object RoomInfo {
  
  inline def apply(roomAttributes: AllRoomAttributes, roomSystemInfo: RoomSystemInfo): RoomInfo = {
    val __obj = js.Dynamic.literal(roomAttributes = roomAttributes.asInstanceOf[js.Any], roomSystemInfo = roomSystemInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoomInfo] (val x: Self) extends AnyVal {
    
    inline def setRoomAttributes(value: AllRoomAttributes): Self = StObject.set(x, "roomAttributes", value.asInstanceOf[js.Any])
    
    inline def setRoomSystemInfo(value: RoomSystemInfo): Self = StObject.set(x, "roomSystemInfo", value.asInstanceOf[js.Any])
  }
}
