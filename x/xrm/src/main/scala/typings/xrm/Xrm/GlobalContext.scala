package typings.xrm.Xrm

import org.scalablytyped.runtime.StringDictionary
import typings.xrm.Xrm.Async.PromiseLike
import typings.xrm.xrmStrings.MaxChildIncidentNumber
import typings.xrm.xrmStrings.MaxIncidentMergeNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the xRM application context.
  * GetGlobalContext()
  */
trait GlobalContext extends StObject {
  
  /**
    * The client's context instance.
    */
  var client: ClientContext
  
  /**
    * Returns information about the advanced configuration settings for the organization.
    * @param setting Name of the configuration setting.
    * @see {@link XrmEnum.AdvancedConfigSettingOption}
    */
  def getAdvancedConfigSetting(setting: MaxChildIncidentNumber | MaxIncidentMergeNumber): Double
  
  /**
    * Gets client's base URL for Dynamics CRM
    * @returns The client's base URL
    * @example
    * * For Dynamics CRM On-Premises:               http(s)://server/org
    * * For Dynamics CRM Online:                    https://org.crm.dynamics.com
    * * For Dynamics CRM for Outlook (Offline):     http://localhost:2525
    */
  def getClientUrl(): String
  
  /**
    * Returns the name of the current business app in Customer Engagement.
    */
  def getCurrentAppName(): PromiseLike[String]
  
  /**
    * Returns the properties of the current business app in Customer Engagement.
    */
  def getCurrentAppProperties(): PromiseLike[AppProperties]
  
  /**
    * Gets the current value of a settings row.
    * @param settingName Name of the setting youd like to receive the value from.
    * @returns The current value of the setting.
    */
  def getCurrentAppSetting(settingName: String): String | Double | Boolean
  
  /**
    * Returns the URL of the current business app in Customer Engagement.
    * @example
    * * Online        https:// **org**.crm.dynamics.com/main.aspx?appid=**GUID**
    * * OnPrem        https:// **server**\/ **org**\/main.aspx?appid=**GUID**
    * @returns A string containing the url of the current business app.
    */
  def getCurrentAppUrl(): String
  
  /**
    * Gets current styling theme.
    * @remarks This function does not work with Dynamics CRM for tablets or in the unified interface.
    * @returns The name of the current theme, as either "default", "Office12Blue", or "Office14Silver"
    */
  def getCurrentTheme(): Theme
  
  /**
    * Gets whether automatic save is enabled.
    * @deprecated Deprecated in v9. Use {@link Xrm.OrganizationSettings.isAutoSaveEnabled globalContext.organizationSettings.isAutoSaveEnabled} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @returns true if automatic saving is enabled, otherwise false.
    */
  def getIsAutoSaveEnabled(): Boolean
  
  /**
    * Gets organization's LCID (language code).
    * @deprecated Deprecated in v9. Use {@link Xrm.OrganizationSettings.languageId globalContext.organizationSettings.languageId} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @returns The organization language code.
    * @see {@link http://msdn.microsoft.com/en-us/library/ms912047(WinEmbedded.10).aspx External Link: Microsoft Locale ID Values}
    */
  def getOrgLcid(): Double
  
  /**
    * Gets organization's unique name.
    * @remarks This value can be found on the Developer Resources page within Dynamics CRM.
    * @deprecated Deprecated in v9. Use {@link Xrm.OrganizationSettings.uniqueName} globalContext.organizationSettings.uniqueName instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @returns The organization's unique name.
    */
  def getOrgUniqueName(): String
  
  /**
    * Gets query string parameters.
    * @returns The query string parameters, in a dictionary object representing name and value pairs.
    * @deprecated Deprecated in v9 (Still applicable in Web Client).
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  def getQueryStringParameters(): StringDictionary[Any]
  
  /**
    * Returns the difference between the local time and Coordinated Universal Time (UTC).
    * @returns The time zone offset, in minutes.
    */
  def getTimeZoneOffsetMinutes(): Double
  
  /**
    * Gets user's unique identifier.
    * @deprecated Deprecated in v9.  Use {@link Xrm.UserSettings.userId globalContext.userSettings.userId} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @returns The user's identifier in Guid format.
    * @example Example: "{B05EC7CE-5D51-DF11-97E0-00155DB232D0}"
    */
  def getUserId(): String
  
  /**
    * Gets user's LCID (language code).
    * @deprecated Deprecated in v9. Use {@link Xrm.UserSettings.languageId globalContext.userSetings.languageId} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @returns The user's language code.
    * @see {@link http://msdn.microsoft.com/en-us/library/ms912047(WinEmbedded.10).aspx External Link: Microsoft Locale ID Values}
    */
  def getUserLcid(): Double
  
  /**
    * Gets the name of the current user.
    * @deprecated Deprecated in v9. Use {@link Xrm.UserSettings.userName globalContext.userSettings.userName} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @returns The user's name.
    */
  def getUserName(): String
  
  /**
    * Gets all user security roles.
    * @deprecated Deprecated in v9.  Use {@link Xrm.UserSettings.roles globalContext.userSettings.roles} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @returns An array of user role identifiers, in Guid format.
    * @example Example: ["cf4cc7ce-5d51-df11-97e0-00155db232d0"]
    */
  def getUserRoles(): js.Array[String]
  
  /**
    * Returns the version number of the Dynamics 365 server.
    * @returns The version number
    */
  def getVersion(): String
  
  /**
    * Returns a boolean value indicating if the Customer Engagement instance is hosted on- premises or online.
    */
  def isOnPremise(): Boolean
  
  /**
    * Returns information about the current organization settings.
    */
  var organizationSettings: OrganizationSettings
  
  /**
    * Prefixes the current organization's unique name to a string; typically a URL path.
    * @param sPath Local pathname of the resource.
    * @returns A path string with the organization name. Format: "/"+ OrgName + sPath
    */
  def prependOrgName(sPath: String): String
  
  /**
    * Returns information about the current user settings.
    */
  var userSettings: UserSettings
}
object GlobalContext {
  
  inline def apply(
    client: ClientContext,
    getAdvancedConfigSetting: MaxChildIncidentNumber | MaxIncidentMergeNumber => Double,
    getClientUrl: () => String,
    getCurrentAppName: () => PromiseLike[String],
    getCurrentAppProperties: () => PromiseLike[AppProperties],
    getCurrentAppSetting: String => String | Double | Boolean,
    getCurrentAppUrl: () => String,
    getCurrentTheme: () => Theme,
    getIsAutoSaveEnabled: () => Boolean,
    getOrgLcid: () => Double,
    getOrgUniqueName: () => String,
    getQueryStringParameters: () => StringDictionary[Any],
    getTimeZoneOffsetMinutes: () => Double,
    getUserId: () => String,
    getUserLcid: () => Double,
    getUserName: () => String,
    getUserRoles: () => js.Array[String],
    getVersion: () => String,
    isOnPremise: () => Boolean,
    organizationSettings: OrganizationSettings,
    prependOrgName: String => String,
    userSettings: UserSettings
  ): GlobalContext = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], getAdvancedConfigSetting = js.Any.fromFunction1(getAdvancedConfigSetting), getClientUrl = js.Any.fromFunction0(getClientUrl), getCurrentAppName = js.Any.fromFunction0(getCurrentAppName), getCurrentAppProperties = js.Any.fromFunction0(getCurrentAppProperties), getCurrentAppSetting = js.Any.fromFunction1(getCurrentAppSetting), getCurrentAppUrl = js.Any.fromFunction0(getCurrentAppUrl), getCurrentTheme = js.Any.fromFunction0(getCurrentTheme), getIsAutoSaveEnabled = js.Any.fromFunction0(getIsAutoSaveEnabled), getOrgLcid = js.Any.fromFunction0(getOrgLcid), getOrgUniqueName = js.Any.fromFunction0(getOrgUniqueName), getQueryStringParameters = js.Any.fromFunction0(getQueryStringParameters), getTimeZoneOffsetMinutes = js.Any.fromFunction0(getTimeZoneOffsetMinutes), getUserId = js.Any.fromFunction0(getUserId), getUserLcid = js.Any.fromFunction0(getUserLcid), getUserName = js.Any.fromFunction0(getUserName), getUserRoles = js.Any.fromFunction0(getUserRoles), getVersion = js.Any.fromFunction0(getVersion), isOnPremise = js.Any.fromFunction0(isOnPremise), organizationSettings = organizationSettings.asInstanceOf[js.Any], prependOrgName = js.Any.fromFunction1(prependOrgName), userSettings = userSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalContext] (val x: Self) extends AnyVal {
    
    inline def setClient(value: ClientContext): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setGetAdvancedConfigSetting(value: MaxChildIncidentNumber | MaxIncidentMergeNumber => Double): Self = StObject.set(x, "getAdvancedConfigSetting", js.Any.fromFunction1(value))
    
    inline def setGetClientUrl(value: () => String): Self = StObject.set(x, "getClientUrl", js.Any.fromFunction0(value))
    
    inline def setGetCurrentAppName(value: () => PromiseLike[String]): Self = StObject.set(x, "getCurrentAppName", js.Any.fromFunction0(value))
    
    inline def setGetCurrentAppProperties(value: () => PromiseLike[AppProperties]): Self = StObject.set(x, "getCurrentAppProperties", js.Any.fromFunction0(value))
    
    inline def setGetCurrentAppSetting(value: String => String | Double | Boolean): Self = StObject.set(x, "getCurrentAppSetting", js.Any.fromFunction1(value))
    
    inline def setGetCurrentAppUrl(value: () => String): Self = StObject.set(x, "getCurrentAppUrl", js.Any.fromFunction0(value))
    
    inline def setGetCurrentTheme(value: () => Theme): Self = StObject.set(x, "getCurrentTheme", js.Any.fromFunction0(value))
    
    inline def setGetIsAutoSaveEnabled(value: () => Boolean): Self = StObject.set(x, "getIsAutoSaveEnabled", js.Any.fromFunction0(value))
    
    inline def setGetOrgLcid(value: () => Double): Self = StObject.set(x, "getOrgLcid", js.Any.fromFunction0(value))
    
    inline def setGetOrgUniqueName(value: () => String): Self = StObject.set(x, "getOrgUniqueName", js.Any.fromFunction0(value))
    
    inline def setGetQueryStringParameters(value: () => StringDictionary[Any]): Self = StObject.set(x, "getQueryStringParameters", js.Any.fromFunction0(value))
    
    inline def setGetTimeZoneOffsetMinutes(value: () => Double): Self = StObject.set(x, "getTimeZoneOffsetMinutes", js.Any.fromFunction0(value))
    
    inline def setGetUserId(value: () => String): Self = StObject.set(x, "getUserId", js.Any.fromFunction0(value))
    
    inline def setGetUserLcid(value: () => Double): Self = StObject.set(x, "getUserLcid", js.Any.fromFunction0(value))
    
    inline def setGetUserName(value: () => String): Self = StObject.set(x, "getUserName", js.Any.fromFunction0(value))
    
    inline def setGetUserRoles(value: () => js.Array[String]): Self = StObject.set(x, "getUserRoles", js.Any.fromFunction0(value))
    
    inline def setGetVersion(value: () => String): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
    
    inline def setIsOnPremise(value: () => Boolean): Self = StObject.set(x, "isOnPremise", js.Any.fromFunction0(value))
    
    inline def setOrganizationSettings(value: OrganizationSettings): Self = StObject.set(x, "organizationSettings", value.asInstanceOf[js.Any])
    
    inline def setPrependOrgName(value: String => String): Self = StObject.set(x, "prependOrgName", js.Any.fromFunction1(value))
    
    inline def setUserSettings(value: UserSettings): Self = StObject.set(x, "userSettings", value.asInstanceOf[js.Any])
  }
}
