package typings.symphonyApiClientNode.streamsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomSystemInfo extends js.Object {
  
  var active: Boolean = js.native
  
  var createdByUserId: Double = js.native
  
  var creationDate: Double = js.native
  
  var id: String = js.native
}
object RoomSystemInfo {
  
  @scala.inline
  def apply(active: Boolean, createdByUserId: Double, creationDate: Double, id: String): RoomSystemInfo = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], createdByUserId = createdByUserId.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomSystemInfo]
  }
  
  @scala.inline
  implicit class RoomSystemInfoOps[Self <: RoomSystemInfo] (val x: Self) extends AnyVal {
    
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
    def setCreatedByUserId(value: Double): Self = this.set("createdByUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: Double): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
