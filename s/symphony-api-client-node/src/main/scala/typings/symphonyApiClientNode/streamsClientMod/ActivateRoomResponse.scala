package typings.symphonyApiClientNode.streamsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivateRoomResponse extends js.Object {
  
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
  implicit class ActivateRoomResponseOps[Self <: ActivateRoomResponse] (val x: Self) extends AnyVal {
    
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
    def setImmutableRoomAttributes(value: ImmutableRoomAttributes): Self = this.set("immutableRoomAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomAttributes(value: BaseRoomAttributes): Self = this.set("roomAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomSystemInfo(value: RoomSystemInfo): Self = this.set("roomSystemInfo", value.asInstanceOf[js.Any])
  }
}
