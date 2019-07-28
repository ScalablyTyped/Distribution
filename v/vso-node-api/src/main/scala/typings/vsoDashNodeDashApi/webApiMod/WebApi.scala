package typings.vsoDashNodeDashApi.webApiMod

import typings.typedDashRestDashClient.restClientMod.RestClient
import typings.vsoDashNodeDashApi.buildApiMod.IBuildApi
import typings.vsoDashNodeDashApi.coreApiMod.ICoreApi
import typings.vsoDashNodeDashApi.dashboardApiMod.IDashboardApi
import typings.vsoDashNodeDashApi.extensionManagementApiMod.IExtensionManagementApi
import typings.vsoDashNodeDashApi.featureManagementApiMod.IFeatureManagementApi
import typings.vsoDashNodeDashApi.fileContainerApiMod.IFileContainerApi
import typings.vsoDashNodeDashApi.gitApiMod.IGitApi
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.ConnectionData
import typings.vsoDashNodeDashApi.locationsApiMod.ILocationsApi
import typings.vsoDashNodeDashApi.notificationApiMod.INotificationApi
import typings.vsoDashNodeDashApi.policyApiMod.IPolicyApi
import typings.vsoDashNodeDashApi.profileApiMod.IProfileApi
import typings.vsoDashNodeDashApi.projectAnalysisApiMod.IProjectAnalysisApi
import typings.vsoDashNodeDashApi.releaseApiMod.IReleaseApi
import typings.vsoDashNodeDashApi.securityRolesApiMod.ISecurityRolesApi
import typings.vsoDashNodeDashApi.taskAgentApiMod.ITaskAgentApi
import typings.vsoDashNodeDashApi.taskApiMod.ITaskApi
import typings.vsoDashNodeDashApi.testApiMod.ITestApi
import typings.vsoDashNodeDashApi.tfvcApiMod.ITfvcApi
import typings.vsoDashNodeDashApi.vsoClientMod.VsoClient
import typings.vsoDashNodeDashApi.workApiMod.IWorkApi
import typings.vsoDashNodeDashApi.workItemTrackingApiMod.IWorkItemTrackingApi
import typings.vsoDashNodeDashApi.workItemTrackingProcessApiMod.IWorkItemTrackingProcessApi
import typings.vsoDashNodeDashApi.workItemTrackingProcessDefinitionsApiMod.IWorkItemTrackingProcessDefinitionsApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/WebApi", "WebApi")
@js.native
class WebApi protected () extends js.Object {
  def this(defaultUrl: String, authHandler: IRequestHandler) = this()
  def this(defaultUrl: String, authHandler: IRequestHandler, options: IRequestOptions) = this()
  var _resourceAreas: js.Any = js.native
  var authHandler: IRequestHandler = js.native
  var options: IRequestOptions = js.native
  var rest: RestClient = js.native
  var serverUrl: String = js.native
  var vsoClient: VsoClient = js.native
  /* private */ def _getResourceAreaUrl(serverUrl: js.Any, resourceId: js.Any): js.Any = js.native
  /* private */ def _getResourceAreas(): js.Any = js.native
  /* private */ def _readTaskLibSecrets(lookupKey: js.Any): js.Any = js.native
  def connect(): js.Promise[ConnectionData] = js.native
  /**
    * Each factory method can take a serverUrl and a list of handlers
    * if these aren't provided, the default url and auth handler given to the constructor for this class will be used
    */
  def getBuildApi(): js.Promise[IBuildApi] = js.native
  def getBuildApi(serverUrl: String): js.Promise[IBuildApi] = js.native
  def getBuildApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IBuildApi] = js.native
  def getCoreApi(): js.Promise[ICoreApi] = js.native
  def getCoreApi(serverUrl: String): js.Promise[ICoreApi] = js.native
  def getCoreApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ICoreApi] = js.native
  def getDashboardApi(): js.Promise[IDashboardApi] = js.native
  def getDashboardApi(serverUrl: String): js.Promise[IDashboardApi] = js.native
  def getDashboardApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IDashboardApi] = js.native
  def getExtensionManagementApi(): js.Promise[IExtensionManagementApi] = js.native
  def getExtensionManagementApi(serverUrl: String): js.Promise[IExtensionManagementApi] = js.native
  def getExtensionManagementApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IExtensionManagementApi] = js.native
  def getFeatureManagementApi(): js.Promise[IFeatureManagementApi] = js.native
  def getFeatureManagementApi(serverUrl: String): js.Promise[IFeatureManagementApi] = js.native
  def getFeatureManagementApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IFeatureManagementApi] = js.native
  def getFileContainerApi(): js.Promise[IFileContainerApi] = js.native
  def getFileContainerApi(serverUrl: String): js.Promise[IFileContainerApi] = js.native
  def getFileContainerApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IFileContainerApi] = js.native
  def getGitApi(): js.Promise[IGitApi] = js.native
  def getGitApi(serverUrl: String): js.Promise[IGitApi] = js.native
  def getGitApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IGitApi] = js.native
  def getLocationsApi(): js.Promise[ILocationsApi] = js.native
  def getLocationsApi(serverUrl: String): js.Promise[ILocationsApi] = js.native
  def getLocationsApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ILocationsApi] = js.native
  def getNotificationApi(): js.Promise[INotificationApi] = js.native
  def getNotificationApi(serverUrl: String): js.Promise[INotificationApi] = js.native
  def getNotificationApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[INotificationApi] = js.native
  def getPolicyApi(): js.Promise[IPolicyApi] = js.native
  def getPolicyApi(serverUrl: String): js.Promise[IPolicyApi] = js.native
  def getPolicyApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IPolicyApi] = js.native
  def getProfileApi(): js.Promise[IProfileApi] = js.native
  def getProfileApi(serverUrl: String): js.Promise[IProfileApi] = js.native
  def getProfileApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IProfileApi] = js.native
  def getProjectAnalysisApi(): js.Promise[IProjectAnalysisApi] = js.native
  def getProjectAnalysisApi(serverUrl: String): js.Promise[IProjectAnalysisApi] = js.native
  def getProjectAnalysisApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IProjectAnalysisApi] = js.native
  def getReleaseApi(): js.Promise[IReleaseApi] = js.native
  def getReleaseApi(serverUrl: String): js.Promise[IReleaseApi] = js.native
  def getReleaseApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IReleaseApi] = js.native
  def getSecurityRolesApi(): js.Promise[ISecurityRolesApi] = js.native
  def getSecurityRolesApi(serverUrl: String): js.Promise[ISecurityRolesApi] = js.native
  def getSecurityRolesApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ISecurityRolesApi] = js.native
  def getTaskAgentApi(): js.Promise[ITaskAgentApi] = js.native
  def getTaskAgentApi(serverUrl: String): js.Promise[ITaskAgentApi] = js.native
  def getTaskAgentApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ITaskAgentApi] = js.native
  def getTaskApi(): js.Promise[ITaskApi] = js.native
  def getTaskApi(serverUrl: String): js.Promise[ITaskApi] = js.native
  def getTaskApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ITaskApi] = js.native
  def getTestApi(): js.Promise[ITestApi] = js.native
  def getTestApi(serverUrl: String): js.Promise[ITestApi] = js.native
  def getTestApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ITestApi] = js.native
  def getTfvcApi(): js.Promise[ITfvcApi] = js.native
  def getTfvcApi(serverUrl: String): js.Promise[ITfvcApi] = js.native
  def getTfvcApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ITfvcApi] = js.native
  def getWorkApi(): js.Promise[IWorkApi] = js.native
  def getWorkApi(serverUrl: String): js.Promise[IWorkApi] = js.native
  def getWorkApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IWorkApi] = js.native
  def getWorkItemTrackingApi(): js.Promise[IWorkItemTrackingApi] = js.native
  def getWorkItemTrackingApi(serverUrl: String): js.Promise[IWorkItemTrackingApi] = js.native
  def getWorkItemTrackingApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IWorkItemTrackingApi] = js.native
  def getWorkItemTrackingProcessApi(): js.Promise[IWorkItemTrackingProcessApi] = js.native
  def getWorkItemTrackingProcessApi(serverUrl: String): js.Promise[IWorkItemTrackingProcessApi] = js.native
  def getWorkItemTrackingProcessApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IWorkItemTrackingProcessApi] = js.native
  def getWorkItemTrackingProcessDefinitionApi(): js.Promise[IWorkItemTrackingProcessDefinitionsApi] = js.native
  def getWorkItemTrackingProcessDefinitionApi(serverUrl: String): js.Promise[IWorkItemTrackingProcessDefinitionsApi] = js.native
  def getWorkItemTrackingProcessDefinitionApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IWorkItemTrackingProcessDefinitionsApi] = js.native
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
  def createWithBearerToken(defaultUrl: String, token: String): WebApi = js.native
  def createWithBearerToken(defaultUrl: String, token: String, options: IRequestOptions): WebApi = js.native
}

