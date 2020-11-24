package typings.symphonyApiClientNode.adminClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamUser extends js.Object {
  
  var company: js.UndefOr[String] = js.native
  
  var companyId: js.UndefOr[Double] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var firstName: js.UndefOr[String] = js.native
  
  var isExternal: Boolean = js.native
  
  var lastName: js.UndefOr[String] = js.native
  
  var userId: Double = js.native
}
object StreamUser {
  
  @scala.inline
  def apply(isExternal: Boolean, userId: Double): StreamUser = {
    val __obj = js.Dynamic.literal(isExternal = isExternal.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamUser]
  }
  
  @scala.inline
  implicit class StreamUserOps[Self <: StreamUser] (val x: Self) extends AnyVal {
    
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
    def setIsExternal(value: Boolean): Self = this.set("isExternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: Double): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    
    @scala.inline
    def setCompanyId(value: Double): Self = this.set("companyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyId: Self = this.set("companyId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
  }
}
