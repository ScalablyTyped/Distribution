package typings.symphonyApiClientNode.adminUserClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminUserSystemInfo extends js.Object {
  
  var createdBy: String = js.native
  
  var createdDate: Double = js.native
  
  var deactivatedDate: js.UndefOr[Double] = js.native
  
  var id: Double = js.native
  
  var lastLoginDate: js.UndefOr[Double] = js.native
  
  var lastUpdatedDate: Double = js.native
  
  var status: String = js.native
}
object AdminUserSystemInfo {
  
  @scala.inline
  def apply(createdBy: String, createdDate: Double, id: Double, lastUpdatedDate: Double, status: String): AdminUserSystemInfo = {
    val __obj = js.Dynamic.literal(createdBy = createdBy.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminUserSystemInfo]
  }
  
  @scala.inline
  implicit class AdminUserSystemInfoOps[Self <: AdminUserSystemInfo] (val x: Self) extends AnyVal {
    
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
    def setCreatedBy(value: String): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: Double): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: Double): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeactivatedDate(value: Double): Self = this.set("deactivatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeactivatedDate: Self = this.set("deactivatedDate", js.undefined)
    
    @scala.inline
    def setLastLoginDate(value: Double): Self = this.set("lastLoginDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastLoginDate: Self = this.set("lastLoginDate", js.undefined)
  }
}
