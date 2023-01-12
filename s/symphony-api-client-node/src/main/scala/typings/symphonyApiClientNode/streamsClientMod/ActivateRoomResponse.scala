package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateRoomResponse extends StObject {
  
  var immutableRoomAttributes: ImmutableRoomAttributes
  
  var roomAttributes: BaseRoomAttributes
  
  var roomSystemInfo: RoomSystemInfo
}
object ActivateRoomResponse {
  
  inline def apply(
    immutableRoomAttributes: ImmutableRoomAttributes,
    roomAttributes: BaseRoomAttributes,
    roomSystemInfo: RoomSystemInfo
  ): ActivateRoomResponse = {
    val __obj = js.Dynamic.literal(immutableRoomAttributes = immutableRoomAttributes.asInstanceOf[js.Any], roomAttributes = roomAttributes.asInstanceOf[js.Any], roomSystemInfo = roomSystemInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateRoomResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivateRoomResponse] (val x: Self) extends AnyVal {
    
    inline def setImmutableRoomAttributes(value: ImmutableRoomAttributes): Self = StObject.set(x, "immutableRoomAttributes", value.asInstanceOf[js.Any])
    
    inline def setRoomAttributes(value: BaseRoomAttributes): Self = StObject.set(x, "roomAttributes", value.asInstanceOf[js.Any])
    
    inline def setRoomSystemInfo(value: RoomSystemInfo): Self = StObject.set(x, "roomSystemInfo", value.asInstanceOf[js.Any])
  }
}
