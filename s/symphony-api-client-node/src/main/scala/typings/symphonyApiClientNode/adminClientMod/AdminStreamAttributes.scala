package typings.symphonyApiClientNode.adminClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminStreamAttributes extends js.Object {
  
  var createdByUserId: Double = js.native
  
  var createdDate: Double = js.native
  
  var lastMessageDate: Double = js.native
  
  var lastModifiedDate: Double = js.native
  
  var members: js.UndefOr[js.Array[Double]] = js.native
  
  var membersCount: Double = js.native
  
  var originCompany: String = js.native
  
  var originCompanyId: Double = js.native
  
  var roomDescription: js.UndefOr[String] = js.native
  
  var roomName: js.UndefOr[String] = js.native
}
object AdminStreamAttributes {
  
  @scala.inline
  def apply(
    createdByUserId: Double,
    createdDate: Double,
    lastMessageDate: Double,
    lastModifiedDate: Double,
    membersCount: Double,
    originCompany: String,
    originCompanyId: Double
  ): AdminStreamAttributes = {
    val __obj = js.Dynamic.literal(createdByUserId = createdByUserId.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], lastMessageDate = lastMessageDate.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], membersCount = membersCount.asInstanceOf[js.Any], originCompany = originCompany.asInstanceOf[js.Any], originCompanyId = originCompanyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminStreamAttributes]
  }
  
  @scala.inline
  implicit class AdminStreamAttributesOps[Self <: AdminStreamAttributes] (val x: Self) extends AnyVal {
    
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
    def setCreatedByUserId(value: Double): Self = this.set("createdByUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: Double): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastMessageDate(value: Double): Self = this.set("lastMessageDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDate(value: Double): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersCount(value: Double): Self = this.set("membersCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginCompany(value: String): Self = this.set("originCompany", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginCompanyId(value: Double): Self = this.set("originCompanyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: Double*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[Double]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    
    @scala.inline
    def setRoomDescription(value: String): Self = this.set("roomDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomDescription: Self = this.set("roomDescription", js.undefined)
    
    @scala.inline
    def setRoomName(value: String): Self = this.set("roomName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomName: Self = this.set("roomName", js.undefined)
  }
}
