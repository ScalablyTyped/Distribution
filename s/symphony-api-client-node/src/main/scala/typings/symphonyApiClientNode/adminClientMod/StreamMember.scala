package typings.symphonyApiClientNode.adminClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamMember extends js.Object {
  
  var isCreator: Boolean = js.native
  
  var isOwner: js.UndefOr[Boolean] = js.native
  
  var joinDate: Double = js.native
  
  var user: StreamUser = js.native
}
object StreamMember {
  
  @scala.inline
  def apply(isCreator: Boolean, joinDate: Double, user: StreamUser): StreamMember = {
    val __obj = js.Dynamic.literal(isCreator = isCreator.asInstanceOf[js.Any], joinDate = joinDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamMember]
  }
  
  @scala.inline
  implicit class StreamMemberOps[Self <: StreamMember] (val x: Self) extends AnyVal {
    
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
    def setIsCreator(value: Boolean): Self = this.set("isCreator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinDate(value: Double): Self = this.set("joinDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: StreamUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOwner(value: Boolean): Self = this.set("isOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOwner: Self = this.set("isOwner", js.undefined)
  }
}
