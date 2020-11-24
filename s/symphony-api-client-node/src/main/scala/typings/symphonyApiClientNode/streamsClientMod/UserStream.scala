package typings.symphonyApiClientNode.streamsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserStream extends js.Object {
  
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
  implicit class UserStreamOps[Self <: UserStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossPod(value: Boolean): Self = this.set("crossPod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamType(value: StreamType): Self = this.set("streamType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomAttributes(value: RoomAttributes): Self = this.set("roomAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomAttributes: Self = this.set("roomAttributes", js.undefined)
    
    @scala.inline
    def setStreamAttributes(value: StreamAttributes): Self = this.set("streamAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamAttributes: Self = this.set("streamAttributes", js.undefined)
  }
}
