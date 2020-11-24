package typings.twilioChat.userdescriptorMod

import typings.twilioChat.usersMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDescriptorServices extends js.Object {
  
  var users: Users = js.native
}
object UserDescriptorServices {
  
  @scala.inline
  def apply(users: Users): UserDescriptorServices = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDescriptorServices]
  }
  
  @scala.inline
  implicit class UserDescriptorServicesOps[Self <: UserDescriptorServices] (val x: Self) extends AnyVal {
    
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
    def setUsers(value: Users): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
