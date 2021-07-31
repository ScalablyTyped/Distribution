package typings.symphonyApiClientNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adminUserClientMod {
  
  @JSImport("symphony-api-client-node/AdminUserClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getUser(id: String): js.Promise[AdminUserInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUser")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AdminUserInfo]]
  
  @scala.inline
  def listUsers(skip: Double, limit: Double): js.Promise[js.Array[AdminUserInfo]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listUsers")(skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[AdminUserInfo]]]
  
  trait AdminUserAttributes extends StObject {
    
    var accountType: js.UndefOr[String] = js.undefined
    
    var assetClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    var companyName: js.UndefOr[String] = js.undefined
    
    var department: js.UndefOr[String] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var division: js.UndefOr[String] = js.undefined
    
    var emailAddress: String
    
    var firstName: js.UndefOr[String] = js.undefined
    
    var industries: js.UndefOr[js.Array[String]] = js.undefined
    
    var jobFunction: js.UndefOr[String] = js.undefined
    
    var lastName: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[String] = js.undefined
    
    var mobilePhoneNumber: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var twoFactorAuthPhone: js.UndefOr[String] = js.undefined
    
    var userName: String
    
    var workPhoneNumber: js.UndefOr[String] = js.undefined
  }
  object AdminUserAttributes {
    
    @scala.inline
    def apply(emailAddress: String, userName: String): AdminUserAttributes = {
      val __obj = js.Dynamic.literal(emailAddress = emailAddress.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdminUserAttributes]
    }
    
    @scala.inline
    implicit class AdminUserAttributesMutableBuilder[Self <: AdminUserAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountType(value: String): Self = StObject.set(x, "accountType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountTypeUndefined: Self = StObject.set(x, "accountType", js.undefined)
      
      @scala.inline
      def setAssetClasses(value: js.Array[String]): Self = StObject.set(x, "assetClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetClassesUndefined: Self = StObject.set(x, "assetClasses", js.undefined)
      
      @scala.inline
      def setAssetClassesVarargs(value: String*): Self = StObject.set(x, "assetClasses", js.Array(value :_*))
      
      @scala.inline
      def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
      
      @scala.inline
      def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setDivision(value: String): Self = StObject.set(x, "division", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivisionUndefined: Self = StObject.set(x, "division", js.undefined)
      
      @scala.inline
      def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      @scala.inline
      def setIndustries(value: js.Array[String]): Self = StObject.set(x, "industries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndustriesUndefined: Self = StObject.set(x, "industries", js.undefined)
      
      @scala.inline
      def setIndustriesVarargs(value: String*): Self = StObject.set(x, "industries", js.Array(value :_*))
      
      @scala.inline
      def setJobFunction(value: String): Self = StObject.set(x, "jobFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJobFunctionUndefined: Self = StObject.set(x, "jobFunction", js.undefined)
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMobilePhoneNumber(value: String): Self = StObject.set(x, "mobilePhoneNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobilePhoneNumberUndefined: Self = StObject.set(x, "mobilePhoneNumber", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTwoFactorAuthPhone(value: String): Self = StObject.set(x, "twoFactorAuthPhone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwoFactorAuthPhoneUndefined: Self = StObject.set(x, "twoFactorAuthPhone", js.undefined)
      
      @scala.inline
      def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkPhoneNumber(value: String): Self = StObject.set(x, "workPhoneNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkPhoneNumberUndefined: Self = StObject.set(x, "workPhoneNumber", js.undefined)
    }
  }
  
  trait AdminUserInfo extends StObject {
    
    var roles: js.Array[String]
    
    var userAttributes: AdminUserAttributes
    
    var userSystemInfo: AdminUserSystemInfo
  }
  object AdminUserInfo {
    
    @scala.inline
    def apply(roles: js.Array[String], userAttributes: AdminUserAttributes, userSystemInfo: AdminUserSystemInfo): AdminUserInfo = {
      val __obj = js.Dynamic.literal(roles = roles.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any], userSystemInfo = userSystemInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdminUserInfo]
    }
    
    @scala.inline
    implicit class AdminUserInfoMutableBuilder[Self <: AdminUserInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
      
      @scala.inline
      def setUserAttributes(value: AdminUserAttributes): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserSystemInfo(value: AdminUserSystemInfo): Self = StObject.set(x, "userSystemInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdminUserSystemInfo extends StObject {
    
    var createdBy: String
    
    var createdDate: Double
    
    var deactivatedDate: js.UndefOr[Double] = js.undefined
    
    var id: Double
    
    var lastLoginDate: js.UndefOr[Double] = js.undefined
    
    var lastUpdatedDate: Double
    
    var status: String
  }
  object AdminUserSystemInfo {
    
    @scala.inline
    def apply(createdBy: String, createdDate: Double, id: Double, lastUpdatedDate: Double, status: String): AdminUserSystemInfo = {
      val __obj = js.Dynamic.literal(createdBy = createdBy.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdminUserSystemInfo]
    }
    
    @scala.inline
    implicit class AdminUserSystemInfoMutableBuilder[Self <: AdminUserSystemInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedDate(value: Double): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeactivatedDate(value: Double): Self = StObject.set(x, "deactivatedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeactivatedDateUndefined: Self = StObject.set(x, "deactivatedDate", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastLoginDate(value: Double): Self = StObject.set(x, "lastLoginDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastLoginDateUndefined: Self = StObject.set(x, "lastLoginDate", js.undefined)
      
      @scala.inline
      def setLastUpdatedDate(value: Double): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
