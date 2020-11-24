package typings.symphonyApiClientNode.usersClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends js.Object {
  
  var accountType: js.UndefOr[String] = js.native
  
  var avatars: js.UndefOr[js.Array[Avatar]] = js.native
  
  var company: js.UndefOr[String] = js.native
  
  var department: js.UndefOr[String] = js.native
  
  var displayName: String = js.native
  
  var emailAddress: String = js.native
  
  var firstName: String = js.native
  
  var id: String = js.native
  
  var lastName: String = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object User {
  
  @scala.inline
  def apply(displayName: String, emailAddress: String, firstName: String, id: String, lastName: String): User = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountType(value: String): Self = this.set("accountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountType: Self = this.set("accountType", js.undefined)
    
    @scala.inline
    def setAvatarsVarargs(value: Avatar*): Self = this.set("avatars", js.Array(value :_*))
    
    @scala.inline
    def setAvatars(value: js.Array[Avatar]): Self = this.set("avatars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatars: Self = this.set("avatars", js.undefined)
    
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    
    @scala.inline
    def setDepartment(value: String): Self = this.set("department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepartment: Self = this.set("department", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
