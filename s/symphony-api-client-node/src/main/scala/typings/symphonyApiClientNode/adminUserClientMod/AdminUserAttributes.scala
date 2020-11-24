package typings.symphonyApiClientNode.adminUserClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminUserAttributes extends js.Object {
  
  var accountType: js.UndefOr[String] = js.native
  
  var assetClasses: js.UndefOr[js.Array[String]] = js.native
  
  var companyName: js.UndefOr[String] = js.native
  
  var department: js.UndefOr[String] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var division: js.UndefOr[String] = js.native
  
  var emailAddress: String = js.native
  
  var firstName: js.UndefOr[String] = js.native
  
  var industries: js.UndefOr[js.Array[String]] = js.native
  
  var jobFunction: js.UndefOr[String] = js.native
  
  var lastName: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var mobilePhoneNumber: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var twoFactorAuthPhone: js.UndefOr[String] = js.native
  
  var userName: String = js.native
  
  var workPhoneNumber: js.UndefOr[String] = js.native
}
object AdminUserAttributes {
  
  @scala.inline
  def apply(emailAddress: String, userName: String): AdminUserAttributes = {
    val __obj = js.Dynamic.literal(emailAddress = emailAddress.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminUserAttributes]
  }
  
  @scala.inline
  implicit class AdminUserAttributesOps[Self <: AdminUserAttributes] (val x: Self) extends AnyVal {
    
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
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountType(value: String): Self = this.set("accountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountType: Self = this.set("accountType", js.undefined)
    
    @scala.inline
    def setAssetClassesVarargs(value: String*): Self = this.set("assetClasses", js.Array(value :_*))
    
    @scala.inline
    def setAssetClasses(value: js.Array[String]): Self = this.set("assetClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetClasses: Self = this.set("assetClasses", js.undefined)
    
    @scala.inline
    def setCompanyName(value: String): Self = this.set("companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyName: Self = this.set("companyName", js.undefined)
    
    @scala.inline
    def setDepartment(value: String): Self = this.set("department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepartment: Self = this.set("department", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDivision(value: String): Self = this.set("division", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivision: Self = this.set("division", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    
    @scala.inline
    def setIndustriesVarargs(value: String*): Self = this.set("industries", js.Array(value :_*))
    
    @scala.inline
    def setIndustries(value: js.Array[String]): Self = this.set("industries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndustries: Self = this.set("industries", js.undefined)
    
    @scala.inline
    def setJobFunction(value: String): Self = this.set("jobFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobFunction: Self = this.set("jobFunction", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMobilePhoneNumber(value: String): Self = this.set("mobilePhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobilePhoneNumber: Self = this.set("mobilePhoneNumber", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTwoFactorAuthPhone(value: String): Self = this.set("twoFactorAuthPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwoFactorAuthPhone: Self = this.set("twoFactorAuthPhone", js.undefined)
    
    @scala.inline
    def setWorkPhoneNumber(value: String): Self = this.set("workPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkPhoneNumber: Self = this.set("workPhoneNumber", js.undefined)
  }
}
