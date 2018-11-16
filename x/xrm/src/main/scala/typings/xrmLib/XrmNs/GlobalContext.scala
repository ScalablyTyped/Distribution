package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Interface for the xRM application context.
     * GetGlobalContext()
     */
@js.native
trait GlobalContext extends js.Object {
  /**
           * The client's context instance.
           */
  var client: ClientContext = js.native
  /**
           * Returns information about the current organization settings.
           */
  var organizationSettings: OrganizationSettings = js.native
  /**
           * Returns information about the current user settings.
           */
  var userSettings: UserSettings = js.native
  /**
           * Returns information about the advanced configuration settings for the organization.
           * @param setting Name of the configuration setting.
           * @see {@link XrmEnum.AdvancedConfigSettingOption}
           */
  @JSName("getAdvancedConfigSetting")
  def getAdvancedConfigSetting_MaxChildIncidentNumber(setting: xrmLib.xrmLibStrings.MaxChildIncidentNumber): scala.Double = js.native
  /**
           * Returns information about the advanced configuration settings for the organization.
           * @param setting Name of the configuration setting.
           * @see {@link XrmEnum.AdvancedConfigSettingOption}
           */
  @JSName("getAdvancedConfigSetting")
  def getAdvancedConfigSetting_MaxIncidentMergeNumber(setting: xrmLib.xrmLibStrings.MaxIncidentMergeNumber): scala.Double = js.native
  /**
           * Gets client's base URL for Dynamics CRM
           * @returns The client's base URL
           * @example
           * * For Dynamics CRM On-Premises:               http(s)://server/org
           * * For Dynamics CRM Online:                    https://org.crm.dynamics.com
           * * For Dynamics CRM for Outlook (Offline):     http://localhost:2525
           */
  def getClientUrl(): java.lang.String = js.native
  /**
           * Returns the name of the current business app in Customer Engagement.
           */
  def getCurrentAppName(): xrmLib.XrmNs.AsyncNs.PromiseLike[java.lang.String] = js.native
  /**
           * Returns the properties of the current business app in Customer Engagement.
           */
  def getCurrentAppProperties(): xrmLib.XrmNs.AsyncNs.PromiseLike[AppProperties] = js.native
  /**
           * Returns the URL of the current business app in Customer Engagement.
           * @example
           * * Online        https:// **org**.crm.dynamics.com/main.aspx?appid=**GUID**
           * * OnPrem        https:// **server**\/ **org**\/main.aspx?appid=**GUID**
           * @returns A string containing the url of the current business app.
           */
  def getCurrentAppUrl(): java.lang.String = js.native
  /**
           * Gets current styling theme.
           * @remarks This function does not work with Dynamics CRM for tablets or in the unified interface.
           * @returns The name of the current theme, as either "default", "Office12Blue", or "Office14Silver"
           */
  def getCurrentTheme(): Theme = js.native
  /**
           * Gets whether automatic save is enabled.
           * @deprecated Deprecated in v9. Use {@link Xrm.OrganizationSettings.isAutoSaveEnabled globalContext.organizationSettings.isAutoSaveEnabled} instead.
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
           * @returns true if automatic saving is enabled, otherwise false.
           */
  def getIsAutoSaveEnabled(): scala.Boolean = js.native
  /**
           * Gets organization's LCID (language code).
           * @deprecated Deprecated in v9. Use {@link Xrm.OrganizationSettings.languageId globalContext.organizationSettings.languageId} instead.
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
           * @returns The organization language code.
           * @see {@link http://msdn.microsoft.com/en-us/library/ms912047(WinEmbedded.10).aspx External Link: Microsoft Locale ID Values}
           */
  def getOrgLcid(): scala.Double = js.native
  /**
           * Gets organization's unique name.
           * @remarks This value can be found on the Developer Resources page within Dynamics CRM.
           * @deprecated Deprecated in v9. Use {@link Xrm.OrganizationSettings.uniqueName} globalContext.organizationSettings.uniqueName instead.
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
           * @returns The organization's unique name.
           */
  def getOrgUniqueName(): java.lang.String = js.native
  /**
           * Gets query string parameters.
           * @returns The query string parameters, in a dictionary object representing name and value pairs.
           * @deprecated Deprecated in v9 (Still applicable in Web Client).
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
           */
  def getQueryStringParameters(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
           * Returns the difference between the local time and Coordinated Universal Time (UTC).
           * @returns The time zone offset, in minutes.
           */
  def getTimeZoneOffsetMinutes(): scala.Double = js.native
  /**
           * Gets user's unique identifier.
           * @deprecated Deprecated in v9.  Use {@link Xrm.UserSettings.userId globalContext.userSettings.userId} instead.
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
           * @returns The user's identifier in Guid format.
           * @example Example: "{B05EC7CE-5D51-DF11-97E0-00155DB232D0}"
           */
  def getUserId(): java.lang.String = js.native
  /**
           * Gets user's LCID (language code).
           * @deprecated Deprecated in v9. Use {@link Xrm.UserSettings.languageId globalContext.userSetings.languageId} instead.
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
           * @returns The user's language code.
           * @see {@link http://msdn.microsoft.com/en-us/library/ms912047(WinEmbedded.10).aspx External Link: Microsoft Locale ID Values}
           */
  def getUserLcid(): scala.Double = js.native
  /**
           * Gets the name of the current user.
           * @deprecated Deprecated in v9. Use {@link Xrm.UserSettings.userName globalContext.userSettings.userName} instead.
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
           * @returns The user's name.
           */
  def getUserName(): java.lang.String = js.native
  /**
           * Gets all user security roles.
           * @deprecated Deprecated in v9.  Use {@link Xrm.UserSettings.securityRoles globalContext.userSettings.securityRoles} instead.
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
           * @returns An array of user role identifiers, in Guid format.
           * @example Example: ["cf4cc7ce-5d51-df11-97e0-00155db232d0"]
           */
  def getUserRoles(): js.Array[java.lang.String] = js.native
  /**
           * Returns the version number of the Dynamics 365 server.
           * @returns The version number
           */
  def getVersion(): java.lang.String = js.native
  /**
           * Returns a boolean value indicating if the Customer Engagement instance is hosted on- premises or online.
           */
  def isOnPremise(): scala.Boolean = js.native
  /**
           * Prefixes the current organization's unique name to a string; typically a URL path.
           * @param sPath Local pathname of the resource.
           * @returns A path string with the organization name. Format: "/"+ OrgName + sPath
           */
  def prependOrgName(sPath: java.lang.String): java.lang.String = js.native
}

