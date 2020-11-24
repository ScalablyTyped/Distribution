package typings.symphonyApiClientNode.adminUserClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminUserInfo extends js.Object {
  
  var roles: js.Array[String] = js.native
  
  var userAttributes: AdminUserAttributes = js.native
  
  var userSystemInfo: AdminUserSystemInfo = js.native
}
object AdminUserInfo {
  
  @scala.inline
  def apply(roles: js.Array[String], userAttributes: AdminUserAttributes, userSystemInfo: AdminUserSystemInfo): AdminUserInfo = {
    val __obj = js.Dynamic.literal(roles = roles.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any], userSystemInfo = userSystemInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminUserInfo]
  }
  
  @scala.inline
  implicit class AdminUserInfoOps[Self <: AdminUserInfo] (val x: Self) extends AnyVal {
    
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
    def setRolesVarargs(value: String*): Self = this.set("roles", js.Array(value :_*))
    
    @scala.inline
    def setRoles(value: js.Array[String]): Self = this.set("roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributes(value: AdminUserAttributes): Self = this.set("userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSystemInfo(value: AdminUserSystemInfo): Self = this.set("userSystemInfo", value.asInstanceOf[js.Any])
  }
}
