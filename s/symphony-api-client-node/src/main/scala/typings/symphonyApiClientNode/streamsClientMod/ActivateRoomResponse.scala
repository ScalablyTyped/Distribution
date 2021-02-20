package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivateRoomResponse extends StObject {
  
  var immutableRoomAttributes: ImmutableRoomAttributes = js.native
  
  var roomAttributes: BaseRoomAttributes = js.native
  
  var roomSystemInfo: RoomSystemInfo = js.native
}
object ActivateRoomResponse {
  
  @scala.inline
  def apply(
    immutableRoomAttributes: ImmutableRoomAttributes,
    roomAttributes: BaseRoomAttributes,
    roomSystemInfo: RoomSystemInfo
  ): ActivateRoomResponse = {
    val __obj = js.Dynamic.literal(immutableRoomAttributes = immutableRoomAttributes.asInstanceOf[js.Any], roomAttributes = roomAttributes.asInstanceOf[js.Any], roomSystemInfo = roomSystemInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateRoomResponse]
  }
  
  @scala.inline
  implicit class ActivateRoomResponseMutableBuilder[Self <: ActivateRoomResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImmutableRoomAttributes(value: ImmutableRoomAttributes): Self = StObject.set(x, "immutableRoomAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomAttributes(value: BaseRoomAttributes): Self = StObject.set(x, "roomAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomSystemInfo(value: RoomSystemInfo): Self = StObject.set(x, "roomSystemInfo", value.asInstanceOf[js.Any])
  }
}
