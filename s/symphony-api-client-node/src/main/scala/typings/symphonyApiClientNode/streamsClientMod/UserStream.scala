package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserStream extends StObject {
  
  var active: Boolean
  
  var crossPod: Boolean
  
  var id: String
  
  var roomAttributes: js.UndefOr[RoomAttributes] = js.undefined
  
  var streamAttributes: js.UndefOr[StreamAttributes] = js.undefined
  
  var streamType: StreamType
}
object UserStream {
  
  inline def apply(active: Boolean, crossPod: Boolean, id: String, streamType: StreamType): UserStream = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], crossPod = crossPod.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserStream] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setCrossPod(value: Boolean): Self = StObject.set(x, "crossPod", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRoomAttributes(value: RoomAttributes): Self = StObject.set(x, "roomAttributes", value.asInstanceOf[js.Any])
    
    inline def setRoomAttributesUndefined: Self = StObject.set(x, "roomAttributes", js.undefined)
    
    inline def setStreamAttributes(value: StreamAttributes): Self = StObject.set(x, "streamAttributes", value.asInstanceOf[js.Any])
    
    inline def setStreamAttributesUndefined: Self = StObject.set(x, "streamAttributes", js.undefined)
    
    inline def setStreamType(value: StreamType): Self = StObject.set(x, "streamType", value.asInstanceOf[js.Any])
  }
}
