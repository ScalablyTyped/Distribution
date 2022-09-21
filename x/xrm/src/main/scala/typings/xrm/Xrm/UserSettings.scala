package typings.xrm.Xrm

import typings.xrm.Xrm.Collection.ItemCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds information about the current user settings.
  */
trait UserSettings extends StObject {
  
  /**
    * Returns the date formatting information for the current user.
    */
  var dateFormattingInfo: DateFormattingInfo
  
  /**
    * Returns the ID of the default dashboard for the current user.
    */
  var defaultDashboardId: String
  
  /**
    * Returns the difference in minutes between the local time and Coordinated Universal Time (UTC).
    */
  def getTimeZoneOffsetMinutes(): Double
  
  /**
    * Indicates whether guided help is enabled for the current user.
    */
  var isGuidedHelpEnabled: Boolean
  
  /**
    * Indicates whether high contrast is enabled for the current user.
    */
  var isHighContrastEnabled: Boolean
  
  /**
    * Indicates whether the language for the current user is a right-to-left (RTL) language.
    */
  var isRTL: Boolean
  
  /**
    * Returns the language ID for the current user.
    */
  var languageId: Double
  
  /**
    * Returns a collection of lookup objects containing the GUID and display name of each of the security role or teams that the user is associated with.
    */
  var roles: ItemCollection[LookupValue]
  
  /**
    * Returns an array of strings that represent the GUID values of each of the security role privilege that the user is associated with or any teams that the user is associated with.
    */
  var securityRolePrivileges: js.Array[String]
  
  /**
    * Returns an array of strings that represent the GUID values of each of the security role that the user is associated with or any teams that the user is associated with.
    * @deprecated Deprecated in v9.1; use {@link Xrm.UserSettings.roles globalContext.userSettings.roles} instead to display names of security roles or teams along with the ID.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  var securityRoles: js.Array[String]
  
  /**
    * Returns a lookup object containing the ID, display name, and entity type of the transaction currency for the current user.
    */
  var transactionCurrency: LookupValue
  
  /**
    * Returns the transaction currency ID for the current user.
    * @deprecated Deprecated in v9.1; use {@link Xrm.UserSettings.transactionCurrency globalContext.userSettings.transactionCurrency} instead to display name along with the ID.
    */
  var transactionCurrencyId: String
  
  /**
    * Returns the GUID of the SystemUser.Id value for the current user.
    */
  var userId: String
  
  /**
    * Returns the name of the current user.
    */
  var userName: String
}
object UserSettings {
  
  inline def apply(
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
  
  extension [Self <: UserSettings](x: Self) {
    
    inline def setDateFormattingInfo(value: DateFormattingInfo): Self = StObject.set(x, "dateFormattingInfo", value.asInstanceOf[js.Any])
    
    inline def setDefaultDashboardId(value: String): Self = StObject.set(x, "defaultDashboardId", value.asInstanceOf[js.Any])
    
    inline def setGetTimeZoneOffsetMinutes(value: () => Double): Self = StObject.set(x, "getTimeZoneOffsetMinutes", js.Any.fromFunction0(value))
    
    inline def setIsGuidedHelpEnabled(value: Boolean): Self = StObject.set(x, "isGuidedHelpEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsHighContrastEnabled(value: Boolean): Self = StObject.set(x, "isHighContrastEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    inline def setLanguageId(value: Double): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: ItemCollection[LookupValue]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setSecurityRolePrivileges(value: js.Array[String]): Self = StObject.set(x, "securityRolePrivileges", value.asInstanceOf[js.Any])
    
    inline def setSecurityRolePrivilegesVarargs(value: String*): Self = StObject.set(x, "securityRolePrivileges", js.Array(value*))
    
    inline def setSecurityRoles(value: js.Array[String]): Self = StObject.set(x, "securityRoles", value.asInstanceOf[js.Any])
    
    inline def setSecurityRolesVarargs(value: String*): Self = StObject.set(x, "securityRoles", js.Array(value*))
    
    inline def setTransactionCurrency(value: LookupValue): Self = StObject.set(x, "transactionCurrency", value.asInstanceOf[js.Any])
    
    inline def setTransactionCurrencyId(value: String): Self = StObject.set(x, "transactionCurrencyId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
