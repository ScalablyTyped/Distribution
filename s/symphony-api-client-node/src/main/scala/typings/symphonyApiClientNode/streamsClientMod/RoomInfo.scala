package typings.symphonyApiClientNode.streamsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomInfo extends js.Object {
  
  var roomAttributes: AllRoomAttributes = js.native
  
  var roomSystemInfo: RoomSystemInfo = js.native
}
object RoomInfo {
  
  @scala.inline
  def apply(roomAttributes: AllRoomAttributes, roomSystemInfo: RoomSystemInfo): RoomInfo = {
    val __obj = js.Dynamic.literal(roomAttributes = roomAttributes.asInstanceOf[js.Any], roomSystemInfo = roomSystemInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomInfo]
  }
  
  @scala.inline
  implicit class RoomInfoOps[Self <: RoomInfo] (val x: Self) extends AnyVal {
    
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
    def setRoomAttributes(value: AllRoomAttributes): Self = this.set("roomAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomSystemInfo(value: RoomSystemInfo): Self = this.set("roomSystemInfo", value.asInstanceOf[js.Any])
  }
}
