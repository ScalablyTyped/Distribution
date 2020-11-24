package typings.xrm.Xrm

import typings.xrm.Xrm.Collection.ItemCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds information about the current user settings.
  */
@js.native
trait UserSettings extends js.Object {
  
  /**
    * Returns the date formatting information for the current user.
    */
  var dateFormattingInfo: DateFormattingInfo = js.native
  
  /**
    * Returns the ID of the default dashboard for the current user.
    */
  var defaultDashboardId: String = js.native
  
  /**
    * Returns the difference in minutes between the local time and Coordinated Universal Time (UTC).
    */
  def getTimeZoneOffsetMinutes(): Double = js.native
  
  /**
    * Indicates whether guided help is enabled for the current user.
    */
  var isGuidedHelpEnabled: Boolean = js.native
  
  /**
    * Indicates whether high contrast is enabled for the current user.
    */
  var isHighContrastEnabled: Boolean = js.native
  
  /**
    * Indicates whether the language for the current user is a right-to-left (RTL) language.
    */
  var isRTL: Boolean = js.native
  
  /**
    * Returns the language ID for the current user.
    */
  var languageId: Double = js.native
  
  /**
    * Returns a collection of lookup objects containing the GUID and display name of each of the security role or teams that the user is associated with.
    */
  var roles: ItemCollection[LookupValue] = js.native
  
  /**
    * Returns an array of strings that represent the GUID values of each of the security role privilege that the user is associated with or any teams that the user is associated with.
    */
  var securityRolePrivileges: js.Array[String] = js.native
  
  /**
    * Returns an array of strings that represent the GUID values of each of the security role that the user is associated with or any teams that the user is associated with.
    * @deprecated Deprecated in v9.1; use {@link Xrm.UserSettings.roles globalContext.userSettings.roles} instead to display names of security roles or teams along with the ID.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  var securityRoles: js.Array[String] = js.native
  
  /**
    * Returns a lookup object containing the ID, display name, and entity type of the transaction currency for the current user.
    */
  var transactionCurrency: LookupValue = js.native
  
  /**
    * Returns the transaction currency ID for the current user.
    * @deprecated Deprecated in v9.1; use {@link Xrm.UserSettings.transactionCurrency globalContext.userSettings.transactionCurrency} instead to display name along with the ID.
    */
  var transactionCurrencyId: String = js.native
  
  /**
    * Returns the GUID of the SystemUser.Id value for the current user.
    */
  var userId: String = js.native
  
  /**
    * Returns the name of the current user.
    */
  var userName: String = js.native
}
object UserSettings {
  
  @scala.inline
  def apply(
    dateFormattingInfo: DateFormattingInfo,
    defaultDashboardId: String,
    getTimeZoneOffsetMinutes: () => Double,
    isGuidedHelpEnabled: Boolean,
    isHighContrastEnabled: Boolean,
    isRTL: Boolean,
    languageId: Double,
    roles: ItemCollection[LookupValue],
    securityRolePrivileges: js.Array[String],
    securityRoles: js.Array[String],
    transactionCurrency: LookupValue,
    transactionCurrencyId: String,
    userId: String,
    userName: String
  ): UserSettings = {
    val __obj = js.Dynamic.literal(dateFormattingInfo = dateFormattingInfo.asInstanceOf[js.Any], defaultDashboardId = defaultDashboardId.asInstanceOf[js.Any], getTimeZoneOffsetMinutes = js.Any.fromFunction0(getTimeZoneOffsetMinutes), isGuidedHelpEnabled = isGuidedHelpEnabled.asInstanceOf[js.Any], isHighContrastEnabled = isHighContrastEnabled.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], languageId = languageId.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], securityRolePrivileges = securityRolePrivileges.asInstanceOf[js.Any], securityRoles = securityRoles.asInstanceOf[js.Any], transactionCurrency = transactionCurrency.asInstanceOf[js.Any], transactionCurrencyId = transactionCurrencyId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSettings]
  }
  
  @scala.inline
  implicit class UserSettingsOps[Self <: UserSettings] (val x: Self) extends AnyVal {
    
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
    def setDateFormattingInfo(value: DateFormattingInfo): Self = this.set("dateFormattingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDashboardId(value: String): Self = this.set("defaultDashboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTimeZoneOffsetMinutes(value: () => Double): Self = this.set("getTimeZoneOffsetMinutes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsGuidedHelpEnabled(value: Boolean): Self = this.set("isGuidedHelpEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHighContrastEnabled(value: Boolean): Self = this.set("isHighContrastEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageId(value: Double): Self = this.set("languageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoles(value: ItemCollection[LookupValue]): Self = this.set("roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityRolePrivilegesVarargs(value: String*): Self = this.set("securityRolePrivileges", js.Array(value :_*))
    
    @scala.inline
    def setSecurityRolePrivileges(value: js.Array[String]): Self = this.set("securityRolePrivileges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityRolesVarargs(value: String*): Self = this.set("securityRoles", js.Array(value :_*))
    
    @scala.inline
    def setSecurityRoles(value: js.Array[String]): Self = this.set("securityRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionCurrency(value: LookupValue): Self = this.set("transactionCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionCurrencyId(value: String): Self = this.set("transactionCurrencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
  }
}
