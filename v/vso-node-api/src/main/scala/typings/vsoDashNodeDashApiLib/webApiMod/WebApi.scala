package typings
package vsoDashNodeDashApiLib.webApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/WebApi", "WebApi")
@js.native
class WebApi protected () extends js.Object {
  def this(defaultUrl: java.lang.String, authHandler: vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler) = this()
  def this(defaultUrl: java.lang.String, authHandler: vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler, options: vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestOptions) = this()
  var _resourceAreas: js.Any = js.native
  var authHandler: vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler = js.native
  var options: vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestOptions = js.native
  var rest: typedDashRestDashClientLib.restClientMod.RestClient = js.native
  var serverUrl: java.lang.String = js.native
  var vsoClient: vsoDashNodeDashApiLib.vsoClientMod.VsoClient = js.native
  /* private */ def _getResourceAreaUrl(serverUrl: js.Any, resourceId: js.Any): js.Any = js.native
  /* private */ def _getResourceAreas(): js.Any = js.native
  /* private */ def _readTaskLibSecrets(lookupKey: js.Any): js.Any = js.native
  def connect(): js.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ConnectionData] = js.native
  /**
    * Each factory method can take a serverUrl and a list of handlers
    * if these aren't provided, the default url and auth handler given to the constructor for this class will be used
    */
  def getBuildApi(): js.Promise[vsoDashNodeDashApiLib.buildApiMod.IBuildApi] = js.native
  def getBuildApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.buildApiMod.IBuildApi] = js.native
  def getBuildApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.buildApiMod.IBuildApi] = js.native
  def getCoreApi(): js.Promise[vsoDashNodeDashApiLib.coreApiMod.ICoreApi] = js.native
  def getCoreApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.coreApiMod.ICoreApi] = js.native
  def getCoreApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.coreApiMod.ICoreApi] = js.native
  def getDashboardApi(): js.Promise[vsoDashNodeDashApiLib.dashboardApiMod.IDashboardApi] = js.native
  def getDashboardApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.dashboardApiMod.IDashboardApi] = js.native
  def getDashboardApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.dashboardApiMod.IDashboardApi] = js.native
  def getExtensionManagementApi(): js.Promise[vsoDashNodeDashApiLib.extensionManagementApiMod.IExtensionManagementApi] = js.native
  def getExtensionManagementApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.extensionManagementApiMod.IExtensionManagementApi] = js.native
  def getExtensionManagementApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.extensionManagementApiMod.IExtensionManagementApi] = js.native
  def getFeatureManagementApi(): js.Promise[vsoDashNodeDashApiLib.featureManagementApiMod.IFeatureManagementApi] = js.native
  def getFeatureManagementApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.featureManagementApiMod.IFeatureManagementApi] = js.native
  def getFeatureManagementApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.featureManagementApiMod.IFeatureManagementApi] = js.native
  def getFileContainerApi(): js.Promise[vsoDashNodeDashApiLib.fileContainerApiMod.IFileContainerApi] = js.native
  def getFileContainerApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.fileContainerApiMod.IFileContainerApi] = js.native
  def getFileContainerApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.fileContainerApiMod.IFileContainerApi] = js.native
  def getGitApi(): js.Promise[vsoDashNodeDashApiLib.gitApiMod.IGitApi] = js.native
  def getGitApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.gitApiMod.IGitApi] = js.native
  def getGitApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.gitApiMod.IGitApi] = js.native
  def getLocationsApi(): js.Promise[vsoDashNodeDashApiLib.locationsApiMod.ILocationsApi] = js.native
  def getLocationsApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.locationsApiMod.ILocationsApi] = js.native
  def getLocationsApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.locationsApiMod.ILocationsApi] = js.native
  def getNotificationApi(): js.Promise[vsoDashNodeDashApiLib.notificationApiMod.INotificationApi] = js.native
  def getNotificationApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.notificationApiMod.INotificationApi] = js.native
  def getNotificationApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.notificationApiMod.INotificationApi] = js.native
  def getPolicyApi(): js.Promise[vsoDashNodeDashApiLib.policyApiMod.IPolicyApi] = js.native
  def getPolicyApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.policyApiMod.IPolicyApi] = js.native
  def getPolicyApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.policyApiMod.IPolicyApi] = js.native
  def getProfileApi(): js.Promise[vsoDashNodeDashApiLib.profileApiMod.IProfileApi] = js.native
  def getProfileApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.profileApiMod.IProfileApi] = js.native
  def getProfileApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.profileApiMod.IProfileApi] = js.native
  def getProjectAnalysisApi(): js.Promise[vsoDashNodeDashApiLib.projectAnalysisApiMod.IProjectAnalysisApi] = js.native
  def getProjectAnalysisApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.projectAnalysisApiMod.IProjectAnalysisApi] = js.native
  def getProjectAnalysisApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.projectAnalysisApiMod.IProjectAnalysisApi] = js.native
  def getReleaseApi(): js.Promise[vsoDashNodeDashApiLib.releaseApiMod.IReleaseApi] = js.native
  def getReleaseApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.releaseApiMod.IReleaseApi] = js.native
  def getReleaseApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.releaseApiMod.IReleaseApi] = js.native
  def getSecurityRolesApi(): js.Promise[vsoDashNodeDashApiLib.securityRolesApiMod.ISecurityRolesApi] = js.native
  def getSecurityRolesApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.securityRolesApiMod.ISecurityRolesApi] = js.native
  def getSecurityRolesApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.securityRolesApiMod.ISecurityRolesApi] = js.native
  def getTaskAgentApi(): js.Promise[vsoDashNodeDashApiLib.taskAgentApiMod.ITaskAgentApi] = js.native
  def getTaskAgentApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.taskAgentApiMod.ITaskAgentApi] = js.native
  def getTaskAgentApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.taskAgentApiMod.ITaskAgentApi] = js.native
  def getTaskApi(): js.Promise[vsoDashNodeDashApiLib.taskApiMod.ITaskApi] = js.native
  def getTaskApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.taskApiMod.ITaskApi] = js.native
  def getTaskApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.taskApiMod.ITaskApi] = js.native
  def getTestApi(): js.Promise[vsoDashNodeDashApiLib.testApiMod.ITestApi] = js.native
  def getTestApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.testApiMod.ITestApi] = js.native
  def getTestApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.testApiMod.ITestApi] = js.native
  def getTfvcApi(): js.Promise[vsoDashNodeDashApiLib.tfvcApiMod.ITfvcApi] = js.native
  def getTfvcApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.tfvcApiMod.ITfvcApi] = js.native
  def getTfvcApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.tfvcApiMod.ITfvcApi] = js.native
  def getWorkApi(): js.Promise[vsoDashNodeDashApiLib.workApiMod.IWorkApi] = js.native
  def getWorkApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.workApiMod.IWorkApi] = js.native
  def getWorkApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.workApiMod.IWorkApi] = js.native
  def getWorkItemTrackingApi(): js.Promise[vsoDashNodeDashApiLib.workItemTrackingApiMod.IWorkItemTrackingApi] = js.native
  def getWorkItemTrackingApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.workItemTrackingApiMod.IWorkItemTrackingApi] = js.native
  def getWorkItemTrackingApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.workItemTrackingApiMod.IWorkItemTrackingApi] = js.native
  def getWorkItemTrackingProcessApi(): js.Promise[vsoDashNodeDashApiLib.workItemTrackingProcessApiMod.IWorkItemTrackingProcessApi] = js.native
  def getWorkItemTrackingProcessApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.workItemTrackingProcessApiMod.IWorkItemTrackingProcessApi] = js.native
  def getWorkItemTrackingProcessApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.workItemTrackingProcessApiMod.IWorkItemTrackingProcessApi] = js.native
  def getWorkItemTrackingProcessDefinitionApi(): js.Promise[
    vsoDashNodeDashApiLib.workItemTrackingProcessDefinitionsApiMod.IWorkItemTrackingProcessDefinitionsApi
  ] = js.native
  def getWorkItemTrackingProcessDefinitionApi(serverUrl: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.workItemTrackingProcessDefinitionsApiMod.IWorkItemTrackingProcessDefinitionsApi
  ] = js.native
  def getWorkItemTrackingProcessDefinitionApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[
    vsoDashNodeDashApiLib.workItemTrackingProcessDefinitionsApiMod.IWorkItemTrackingProcessDefinitionsApi
  ] = js.native
}

/* static members */
@JSImport("vso-node-api/WebApi", "WebApi")
@js.native
object WebApi extends js.Object {
  /**
    *  Convenience factory to create with a bearer token.
    * @param defaultServerUrl default server url to use when creating new apis from factory methods
    * @param defaultAuthHandler default authentication credentials to use when creating new apis from factory methods
    */
  def createWithBearerToken(defaultUrl: java.lang.String, token: java.lang.String): vsoDashNodeDashApiLib.webApiMod.WebApi = js.native
  def createWithBearerToken(
    defaultUrl: java.lang.String,
    token: java.lang.String,
    options: vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
  ): vsoDashNodeDashApiLib.webApiMod.WebApi = js.native
}

