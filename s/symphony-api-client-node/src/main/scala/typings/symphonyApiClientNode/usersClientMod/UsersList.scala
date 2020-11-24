package typings.symphonyApiClientNode.usersClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersList extends js.Object {
  
  var users: js.Array[User] = js.native
}
object UsersList {
  
  @scala.inline
  def apply(users: js.Array[User]): UsersList = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersList]
  }
  
  @scala.inline
  implicit class UsersListOps[Self <: UsersList] (val x: Self) extends AnyVal {
    
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
    def setUsersVarargs(value: User*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[User]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
