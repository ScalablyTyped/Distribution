package typings.tizentvWebideCommonTizentv

import typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.partner_
import typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.public_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tizentv/webide-common-tizentv", "ProfileManager")
  @js.native
  open class ProfileManager protected () extends StObject {
    def this(resourcePath: String) = this()
    
    def getProfileItems(profileName: String): ProfileItem | Null = js.native
    
    def getProfileKeys(profileName: String): js.Array[String] | Null = js.native
    
    def isProfileExist(profileName: String): Boolean = js.native
    
    def listProfile(): js.Array[String] | Null = js.native
    
    def modifyProfile(profileName: String, itemType: ItemType, certpath: String, password: String): Boolean = js.native
    
    def registerProfile(profileName: String, authorProfile: AuthorProfile, distributorProfile: DistributorProfile): js.Promise[Unit] = js.native
    
    def removeProfile(profileName: String): Boolean = js.native
    
    def setActivateProfile(profileName: String): Boolean = js.native
  }
  
  @JSImport("@tizentv/webide-common-tizentv", "SamsungCertManager")
  @js.native
  open class SamsungCertManager protected () extends StObject {
    def this(resourcePath: String) = this()
    
    def createAuthorCert(profileName: String, authorInfo: SamsungAuthorInfo, accessInfo: AccessInfo): js.Promise[String] = js.native
    
    def createDistributorCert(profileName: String, distrbutorInfo: DistributorInfo, accessInfo: AccessInfo): js.Promise[String] = js.native
    
    def fetchAuthorCRT(accessInfo: AccessInfo): js.Promise[Unit] = js.native
    
    def fetchDistributorCRT(isCrt: Boolean): js.Promise[Unit] = js.native
    
    def generateAuthorCSR(authorInfo: SamsungAuthorInfo): Unit = js.native
    
    def generateAuthorPCKS12(password: String): Unit = js.native
    
    def generateDistributorCSR(duidList: js.Array[String], accessInfo: AccessInfo): Unit = js.native
    
    def generateDistributorPCKS12(password: String, privilegeLevel: SamsungPrivilegeLevel): Unit = js.native
    
    def init(): js.Promise[Unit] = js.native
    
    def loadCaCert(certFile: String): String = js.native
  }
  
  @JSImport("@tizentv/webide-common-tizentv", "TVWebApp")
  @js.native
  open class TVWebApp protected () extends StObject {
    def this(name: String, location: String, id: String) = this()
    
    def buildWidget(profilePath: String): js.Promise[Unit] = js.native
    def buildWidget(profilePath: String, excludeFiles: String): js.Promise[Unit] = js.native
    
    def getAppScreenWidth(): String = js.native
    
    def init(): Unit = js.native
    
    def launchOnEmulator(): js.Promise[Unit] = js.native
    def launchOnEmulator(chromeExecPath: String): js.Promise[Unit] = js.native
    def launchOnEmulator(chromeExecPath: String, isDebug: Boolean): js.Promise[Unit] = js.native
    def launchOnEmulator(chromeExecPath: Unit, isDebug: Boolean): js.Promise[Unit] = js.native
    
    def launchOnSimulator(simulatorLocation: String): js.Promise[Unit] = js.native
    
    def launchOnTV(tvIP: String): js.Promise[Unit] = js.native
    def launchOnTV(tvIP: String, chromeExecPath: String): js.Promise[Unit] = js.native
    def launchOnTV(tvIP: String, chromeExecPath: String, isDebug: Boolean): js.Promise[Unit] = js.native
    def launchOnTV(tvIP: String, chromeExecPath: Unit, isDebug: Boolean): js.Promise[Unit] = js.native
  }
  /* static members */
  object TVWebApp {
    
    @JSImport("@tizentv/webide-common-tizentv", "TVWebApp")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getProjectId(projectPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectId")(projectPath.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def openProject(projectPath: String): TVWebApp = ^.asInstanceOf[js.Dynamic].applyDynamic("openProject")(projectPath.asInstanceOf[js.Any]).asInstanceOf[TVWebApp]
  }
  
  @JSImport("@tizentv/webide-common-tizentv", "TizenCertManager")
  @js.native
  open class TizenCertManager protected () extends StObject {
    def this(resourcePath: String) = this()
    
    def createCert(authorInfo: AuthorInfo): Unit = js.native
    
    def getTizenDeveloperCA(): String = js.native
    
    def getTizenDistributorProfile(privilegeLevel: PrivilegeLevel): DistributorProfile = js.native
    
    def init(): js.Promise[Unit] = js.native
    
    def loadCaCert(): String = js.native
  }
  
  trait AccessInfo extends StObject {
    
    var accessToken: String
    
    var userEmail: String
    
    var userId: String
  }
  object AccessInfo {
    
    inline def apply(accessToken: String, userEmail: String, userId: String): AccessInfo = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], userEmail = userEmail.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessInfo]
    }
    
    extension [Self <: AccessInfo](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthorInfo extends StObject {
    
    var authorName: String
    
    var authorPassword: String
    
    var cityInfo: String
    
    var countryInfo: String
    
    var departmentInfo: String
    
    var emailInfo: String
    
    var keyFileName: String
    
    var organizationInfo: String
    
    var stateInfo: String
  }
  object AuthorInfo {
    
    inline def apply(
      authorName: String,
      authorPassword: String,
      cityInfo: String,
      countryInfo: String,
      departmentInfo: String,
      emailInfo: String,
      keyFileName: String,
      organizationInfo: String,
      stateInfo: String
    ): AuthorInfo = {
      val __obj = js.Dynamic.literal(authorName = authorName.asInstanceOf[js.Any], authorPassword = authorPassword.asInstanceOf[js.Any], cityInfo = cityInfo.asInstanceOf[js.Any], countryInfo = countryInfo.asInstanceOf[js.Any], departmentInfo = departmentInfo.asInstanceOf[js.Any], emailInfo = emailInfo.asInstanceOf[js.Any], keyFileName = keyFileName.asInstanceOf[js.Any], organizationInfo = organizationInfo.asInstanceOf[js.Any], stateInfo = stateInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorInfo]
    }
    
    extension [Self <: AuthorInfo](x: Self) {
      
      inline def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
      
      inline def setAuthorPassword(value: String): Self = StObject.set(x, "authorPassword", value.asInstanceOf[js.Any])
      
      inline def setCityInfo(value: String): Self = StObject.set(x, "cityInfo", value.asInstanceOf[js.Any])
      
      inline def setCountryInfo(value: String): Self = StObject.set(x, "countryInfo", value.asInstanceOf[js.Any])
      
      inline def setDepartmentInfo(value: String): Self = StObject.set(x, "departmentInfo", value.asInstanceOf[js.Any])
      
      inline def setEmailInfo(value: String): Self = StObject.set(x, "emailInfo", value.asInstanceOf[js.Any])
      
      inline def setKeyFileName(value: String): Self = StObject.set(x, "keyFileName", value.asInstanceOf[js.Any])
      
      inline def setOrganizationInfo(value: String): Self = StObject.set(x, "organizationInfo", value.asInstanceOf[js.Any])
      
      inline def setStateInfo(value: String): Self = StObject.set(x, "stateInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthorProfile extends StObject {
    
    var authorCA: String
    
    var authorCertPath: String
    
    var authorPassword: String
  }
  object AuthorProfile {
    
    inline def apply(authorCA: String, authorCertPath: String, authorPassword: String): AuthorProfile = {
      val __obj = js.Dynamic.literal(authorCA = authorCA.asInstanceOf[js.Any], authorCertPath = authorCertPath.asInstanceOf[js.Any], authorPassword = authorPassword.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorProfile]
    }
    
    extension [Self <: AuthorProfile](x: Self) {
      
      inline def setAuthorCA(value: String): Self = StObject.set(x, "authorCA", value.asInstanceOf[js.Any])
      
      inline def setAuthorCertPath(value: String): Self = StObject.set(x, "authorCertPath", value.asInstanceOf[js.Any])
      
      inline def setAuthorPassword(value: String): Self = StObject.set(x, "authorPassword", value.asInstanceOf[js.Any])
    }
  }
  
  trait DistributorInfo extends StObject {
    
    var distributorPassword: String
    
    var duidList: js.Array[String]
    
    var privilegeLevel: SamsungPrivilegeLevel
  }
  object DistributorInfo {
    
    inline def apply(distributorPassword: String, duidList: js.Array[String], privilegeLevel: SamsungPrivilegeLevel): DistributorInfo = {
      val __obj = js.Dynamic.literal(distributorPassword = distributorPassword.asInstanceOf[js.Any], duidList = duidList.asInstanceOf[js.Any], privilegeLevel = privilegeLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistributorInfo]
    }
    
    extension [Self <: DistributorInfo](x: Self) {
      
      inline def setDistributorPassword(value: String): Self = StObject.set(x, "distributorPassword", value.asInstanceOf[js.Any])
      
      inline def setDuidList(value: js.Array[String]): Self = StObject.set(x, "duidList", value.asInstanceOf[js.Any])
      
      inline def setDuidListVarargs(value: String*): Self = StObject.set(x, "duidList", js.Array(value*))
      
      inline def setPrivilegeLevel(value: SamsungPrivilegeLevel): Self = StObject.set(x, "privilegeLevel", value.asInstanceOf[js.Any])
    }
  }
  
  trait DistributorProfile extends StObject {
    
    var distributorCA: String
    
    var distributorCertPath: String
    
    var distributorPassword: String
  }
  object DistributorProfile {
    
    inline def apply(distributorCA: String, distributorCertPath: String, distributorPassword: String): DistributorProfile = {
      val __obj = js.Dynamic.literal(distributorCA = distributorCA.asInstanceOf[js.Any], distributorCertPath = distributorCertPath.asInstanceOf[js.Any], distributorPassword = distributorPassword.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistributorProfile]
    }
    
    extension [Self <: DistributorProfile](x: Self) {
      
      inline def setDistributorCA(value: String): Self = StObject.set(x, "distributorCA", value.asInstanceOf[js.Any])
      
      inline def setDistributorCertPath(value: String): Self = StObject.set(x, "distributorCertPath", value.asInstanceOf[js.Any])
      
      inline def setDistributorPassword(value: String): Self = StObject.set(x, "distributorPassword", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.author
    - typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.distributor1
    - typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.distributor2
  */
  trait ItemType extends StObject
  object ItemType {
    
    inline def author: typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.author = "author".asInstanceOf[typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.author]
    
    inline def distributor1: typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.distributor1 = "distributor1".asInstanceOf[typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.distributor1]
    
    inline def distributor2: typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.distributor2 = "distributor2".asInstanceOf[typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.distributor2]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.partner_
    - typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.public_
  */
  trait PrivilegeLevel extends StObject
  object PrivilegeLevel {
    
    inline def partner: partner_ = "partner".asInstanceOf[partner_]
    
    inline def public: public_ = "public".asInstanceOf[public_]
  }
  
  trait ProfileItem extends StObject {
    
    var authorKey: String
    
    var authorPwd: String
    
    var distributorKey1: String
    
    var distributorKey2: String
    
    var distributorPwd1: String
    
    var distributorPwd2: String
  }
  object ProfileItem {
    
    inline def apply(
      authorKey: String,
      authorPwd: String,
      distributorKey1: String,
      distributorKey2: String,
      distributorPwd1: String,
      distributorPwd2: String
    ): ProfileItem = {
      val __obj = js.Dynamic.literal(authorKey = authorKey.asInstanceOf[js.Any], authorPwd = authorPwd.asInstanceOf[js.Any], distributorKey1 = distributorKey1.asInstanceOf[js.Any], distributorKey2 = distributorKey2.asInstanceOf[js.Any], distributorPwd1 = distributorPwd1.asInstanceOf[js.Any], distributorPwd2 = distributorPwd2.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfileItem]
    }
    
    extension [Self <: ProfileItem](x: Self) {
      
      inline def setAuthorKey(value: String): Self = StObject.set(x, "authorKey", value.asInstanceOf[js.Any])
      
      inline def setAuthorPwd(value: String): Self = StObject.set(x, "authorPwd", value.asInstanceOf[js.Any])
      
      inline def setDistributorKey1(value: String): Self = StObject.set(x, "distributorKey1", value.asInstanceOf[js.Any])
      
      inline def setDistributorKey2(value: String): Self = StObject.set(x, "distributorKey2", value.asInstanceOf[js.Any])
      
      inline def setDistributorPwd1(value: String): Self = StObject.set(x, "distributorPwd1", value.asInstanceOf[js.Any])
      
      inline def setDistributorPwd2(value: String): Self = StObject.set(x, "distributorPwd2", value.asInstanceOf[js.Any])
    }
  }
  
  trait SamsungAuthorInfo extends StObject {
    
    var city: String
    
    var country: String
    
    var department: String
    
    var name: String
    
    var organization: String
    
    var password: String
    
    var state: String
  }
  object SamsungAuthorInfo {
    
    inline def apply(
      city: String,
      country: String,
      department: String,
      name: String,
      organization: String,
      password: String,
      state: String
    ): SamsungAuthorInfo = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], department = department.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamsungAuthorInfo]
    }
    
    extension [Self <: SamsungAuthorInfo](x: Self) {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.Partner
    - typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.Public
  */
  trait SamsungPrivilegeLevel extends StObject
  object SamsungPrivilegeLevel {
    
    inline def Partner: typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.Partner = "Partner".asInstanceOf[typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.Partner]
    
    inline def Public: typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.Public = "Public".asInstanceOf[typings.tizentvWebideCommonTizentv.tizentvWebideCommonTizentvStrings.Public]
  }
}
