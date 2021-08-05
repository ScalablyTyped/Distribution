package typings.symphonyApiClientNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adminUserClientMod {
  
  @JSImport("symphony-api-client-node/AdminUserClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUser(id: String): js.Promise[AdminUserInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUser")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AdminUserInfo]]
  
  inline def listUsers(skip: Double, limit: Double): js.Promise[js.Array[AdminUserInfo]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listUsers")(skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[AdminUserInfo]]]
  
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
    
    inline def apply(emailAddress: String, userName: String): AdminUserAttributes = {
      val __obj = js.Dynamic.literal(emailAddress = emailAddress.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdminUserAttributes]
    }
    
    extension [Self <: AdminUserAttributes](x: Self) {
      
      inline def setAccountType(value: String): Self = StObject.set(x, "accountType", value.asInstanceOf[js.Any])
      
      inline def setAccountTypeUndefined: Self = StObject.set(x, "accountType", js.undefined)
      
      inline def setAssetClasses(value: js.Array[String]): Self = StObject.set(x, "assetClasses", value.asInstanceOf[js.Any])
      
      inline def setAssetClassesUndefined: Self = StObject.set(x, "assetClasses", js.undefined)
      
      inline def setAssetClassesVarargs(value: String*): Self = StObject.set(x, "assetClasses", js.Array(value :_*))
      
      inline def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
      
      inline def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
      
      inline def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
      
      inline def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setDivision(value: String): Self = StObject.set(x, "division", value.asInstanceOf[js.Any])
      
      inline def setDivisionUndefined: Self = StObject.set(x, "division", js.undefined)
      
      inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      inline def setIndustries(value: js.Array[String]): Self = StObject.set(x, "industries", value.asInstanceOf[js.Any])
      
      inline def setIndustriesUndefined: Self = StObject.set(x, "industries", js.undefined)
      
      inline def setIndustriesVarargs(value: String*): Self = StObject.set(x, "industries", js.Array(value :_*))
      
      inline def setJobFunction(value: String): Self = StObject.set(x, "jobFunction", value.asInstanceOf[js.Any])
      
      inline def setJobFunctionUndefined: Self = StObject.set(x, "jobFunction", js.undefined)
      
      inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMobilePhoneNumber(value: String): Self = StObject.set(x, "mobilePhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setMobilePhoneNumberUndefined: Self = StObject.set(x, "mobilePhoneNumber", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTwoFactorAuthPhone(value: String): Self = StObject.set(x, "twoFactorAuthPhone", value.asInstanceOf[js.Any])
      
      inline def setTwoFactorAuthPhoneUndefined: Self = StObject.set(x, "twoFactorAuthPhone", js.undefined)
      
      inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      inline def setWorkPhoneNumber(value: String): Self = StObject.set(x, "workPhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setWorkPhoneNumberUndefined: Self = StObject.set(x, "workPhoneNumber", js.undefined)
    }
  }
  
  trait AdminUserInfo extends StObject {
    
    var roles: js.Array[String]
    
    var userAttributes: AdminUserAttributes
    
    var userSystemInfo: AdminUserSystemInfo
  }
  object AdminUserInfo {
    
    inline def apply(roles: js.Array[String], userAttributes: AdminUserAttributes, userSystemInfo: AdminUserSystemInfo): AdminUserInfo = {
      val __obj = js.Dynamic.literal(roles = roles.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any], userSystemInfo = userSystemInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdminUserInfo]
    }
    
    extension [Self <: AdminUserInfo](x: Self) {
      
      inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
      
      inline def setUserAttributes(value: AdminUserAttributes): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
      
      inline def setUserSystemInfo(value: AdminUserSystemInfo): Self = StObject.set(x, "userSystemInfo", value.asInstanceOf[js.Any])
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
    
    inline def apply(createdBy: String, createdDate: Double, id: Double, lastUpdatedDate: Double, status: String): AdminUserSystemInfo = {
      val __obj = js.Dynamic.literal(createdBy = createdBy.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdminUserSystemInfo]
    }
    
    extension [Self <: AdminUserSystemInfo](x: Self) {
      
      inline def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      inline def setCreatedDate(value: Double): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      inline def setDeactivatedDate(value: Double): Self = StObject.set(x, "deactivatedDate", value.asInstanceOf[js.Any])
      
      inline def setDeactivatedDateUndefined: Self = StObject.set(x, "deactivatedDate", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLastLoginDate(value: Double): Self = StObject.set(x, "lastLoginDate", value.asInstanceOf[js.Any])
      
      inline def setLastLoginDateUndefined: Self = StObject.set(x, "lastLoginDate", js.undefined)
      
      inline def setLastUpdatedDate(value: Double): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
