package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserStream extends StObject {
  
  var active: Boolean = js.native
  
  var crossPod: Boolean = js.native
  
  var id: String = js.native
  
  var roomAttributes: js.UndefOr[RoomAttributes] = js.native
  
  var streamAttributes: js.UndefOr[StreamAttributes] = js.native
  
  var streamType: StreamType = js.native
}
object UserStream {
  
  @scala.inline
  def apply(active: Boolean, crossPod: Boolean, id: String, streamType: StreamType): UserStream = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], crossPod = crossPod.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserStream]
  }
  
  @scala.inline
  implicit class UserStreamMutableBuilder[Self <: UserStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossPod(value: Boolean): Self = StObject.set(x, "crossPod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomAttributes(value: RoomAttributes): Self = StObject.set(x, "roomAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomAttributesUndefined: Self = StObject.set(x, "roomAttributes", js.undefined)
    
    @scala.inline
    def setStreamAttributes(value: StreamAttributes): Self = StObject.set(x, "streamAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamAttributesUndefined: Self = StObject.set(x, "streamAttributes", js.undefined)
    
    @scala.inline
    def setStreamType(value: StreamType): Self = StObject.set(x, "streamType", value.asInstanceOf[js.Any])
  }
}
