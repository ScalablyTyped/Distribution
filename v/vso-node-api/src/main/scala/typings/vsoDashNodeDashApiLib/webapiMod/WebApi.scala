package typings
package vsoDashNodeDashApiLib.webapiMod

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
  var rest: typedDashRestDashClientLib.restclientMod.RestClient = js.native
  var serverUrl: java.lang.String = js.native
  var vsoClient: vsoDashNodeDashApiLib.vsoclientMod.VsoClient = js.native
  /* private */ def _getResourceAreaUrl(serverUrl: js.Any, resourceId: js.Any): js.Any = js.native
  /* private */ def _getResourceAreas(): js.Any = js.native
  /* private */ def _readTaskLibSecrets(lookupKey: js.Any): js.Any = js.native
  def connect(): js.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ConnectionData] = js.native
  /**
       * Each factory method can take a serverUrl and a list of handlers
       * if these aren't provided, the default url and auth handler given to the constructor for this class will be used
       */
  def getBuildApi(): js.Promise[vsoDashNodeDashApiLib.buildapiMod.IBuildApi] = js.native
  /**
       * Each factory method can take a serverUrl and a list of handlers
       * if these aren't provided, the default url and auth handler given to the constructor for this class will be used
       */
  def getBuildApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.buildapiMod.IBuildApi] = js.native
  /**
       * Each factory method can take a serverUrl and a list of handlers
       * if these aren't provided, the default url and auth handler given to the constructor for this class will be used
       */
  def getBuildApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.buildapiMod.IBuildApi] = js.native
  def getCoreApi(): js.Promise[vsoDashNodeDashApiLib.coreapiMod.ICoreApi] = js.native
  def getCoreApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.coreapiMod.ICoreApi] = js.native
  def getCoreApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.coreapiMod.ICoreApi] = js.native
  def getDashboardApi(): js.Promise[vsoDashNodeDashApiLib.dashboardapiMod.IDashboardApi] = js.native
  def getDashboardApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.dashboardapiMod.IDashboardApi] = js.native
  def getDashboardApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.dashboardapiMod.IDashboardApi] = js.native
  def getExtensionManagementApi(): js.Promise[vsoDashNodeDashApiLib.extensionmanagementapiMod.IExtensionManagementApi] = js.native
  def getExtensionManagementApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.extensionmanagementapiMod.IExtensionManagementApi] = js.native
  def getExtensionManagementApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.extensionmanagementapiMod.IExtensionManagementApi] = js.native
  def getFeatureManagementApi(): js.Promise[vsoDashNodeDashApiLib.featuremanagementapiMod.IFeatureManagementApi] = js.native
  def getFeatureManagementApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.featuremanagementapiMod.IFeatureManagementApi] = js.native
  def getFeatureManagementApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.featuremanagementapiMod.IFeatureManagementApi] = js.native
  def getFileContainerApi(): js.Promise[vsoDashNodeDashApiLib.filecontainerapiMod.IFileContainerApi] = js.native
  def getFileContainerApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.filecontainerapiMod.IFileContainerApi] = js.native
  def getFileContainerApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.filecontainerapiMod.IFileContainerApi] = js.native
  def getGitApi(): js.Promise[vsoDashNodeDashApiLib.gitapiMod.IGitApi] = js.native
  def getGitApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.gitapiMod.IGitApi] = js.native
  def getGitApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.gitapiMod.IGitApi] = js.native
  def getLocationsApi(): js.Promise[vsoDashNodeDashApiLib.locationsapiMod.ILocationsApi] = js.native
  def getLocationsApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.locationsapiMod.ILocationsApi] = js.native
  def getLocationsApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.locationsapiMod.ILocationsApi] = js.native
  def getNotificationApi(): js.Promise[vsoDashNodeDashApiLib.notificationapiMod.INotificationApi] = js.native
  def getNotificationApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.notificationapiMod.INotificationApi] = js.native
  def getNotificationApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.notificationapiMod.INotificationApi] = js.native
  def getPolicyApi(): js.Promise[vsoDashNodeDashApiLib.policyapiMod.IPolicyApi] = js.native
  def getPolicyApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.policyapiMod.IPolicyApi] = js.native
  def getPolicyApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.policyapiMod.IPolicyApi] = js.native
  def getProfileApi(): js.Promise[vsoDashNodeDashApiLib.profileapiMod.IProfileApi] = js.native
  def getProfileApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.profileapiMod.IProfileApi] = js.native
  def getProfileApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.profileapiMod.IProfileApi] = js.native
  def getProjectAnalysisApi(): js.Promise[vsoDashNodeDashApiLib.projectanalysisapiMod.IProjectAnalysisApi] = js.native
  def getProjectAnalysisApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.projectanalysisapiMod.IProjectAnalysisApi] = js.native
  def getProjectAnalysisApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.projectanalysisapiMod.IProjectAnalysisApi] = js.native
  def getReleaseApi(): js.Promise[vsoDashNodeDashApiLib.releaseapiMod.IReleaseApi] = js.native
  def getReleaseApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.releaseapiMod.IReleaseApi] = js.native
  def getReleaseApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.releaseapiMod.IReleaseApi] = js.native
  def getSecurityRolesApi(): js.Promise[vsoDashNodeDashApiLib.securityrolesapiMod.ISecurityRolesApi] = js.native
  def getSecurityRolesApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.securityrolesapiMod.ISecurityRolesApi] = js.native
  def getSecurityRolesApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.securityrolesapiMod.ISecurityRolesApi] = js.native
  def getTaskAgentApi(): js.Promise[vsoDashNodeDashApiLib.taskagentapiMod.ITaskAgentApi] = js.native
  def getTaskAgentApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.taskagentapiMod.ITaskAgentApi] = js.native
  def getTaskAgentApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.taskagentapiMod.ITaskAgentApi] = js.native
  def getTaskApi(): js.Promise[vsoDashNodeDashApiLib.taskapiMod.ITaskApi] = js.native
  def getTaskApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.taskapiMod.ITaskApi] = js.native
  def getTaskApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.taskapiMod.ITaskApi] = js.native
  def getTestApi(): js.Promise[vsoDashNodeDashApiLib.testapiMod.ITestApi] = js.native
  def getTestApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.testapiMod.ITestApi] = js.native
  def getTestApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.testapiMod.ITestApi] = js.native
  def getTfvcApi(): js.Promise[vsoDashNodeDashApiLib.tfvcapiMod.ITfvcApi] = js.native
  def getTfvcApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.tfvcapiMod.ITfvcApi] = js.native
  def getTfvcApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.tfvcapiMod.ITfvcApi] = js.native
  def getWorkApi(): js.Promise[vsoDashNodeDashApiLib.workapiMod.IWorkApi] = js.native
  def getWorkApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.workapiMod.IWorkApi] = js.native
  def getWorkApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.workapiMod.IWorkApi] = js.native
  def getWorkItemTrackingApi(): js.Promise[vsoDashNodeDashApiLib.workitemtrackingapiMod.IWorkItemTrackingApi] = js.native
  def getWorkItemTrackingApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.workitemtrackingapiMod.IWorkItemTrackingApi] = js.native
  def getWorkItemTrackingApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.workitemtrackingapiMod.IWorkItemTrackingApi] = js.native
  def getWorkItemTrackingProcessApi(): js.Promise[vsoDashNodeDashApiLib.workitemtrackingprocessapiMod.IWorkItemTrackingProcessApi] = js.native
  def getWorkItemTrackingProcessApi(serverUrl: java.lang.String): js.Promise[vsoDashNodeDashApiLib.workitemtrackingprocessapiMod.IWorkItemTrackingProcessApi] = js.native
  def getWorkItemTrackingProcessApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[vsoDashNodeDashApiLib.workitemtrackingprocessapiMod.IWorkItemTrackingProcessApi] = js.native
  def getWorkItemTrackingProcessDefinitionApi(): js.Promise[
    vsoDashNodeDashApiLib.workitemtrackingprocessdefinitionsapiMod.IWorkItemTrackingProcessDefinitionsApi
  ] = js.native
  def getWorkItemTrackingProcessDefinitionApi(serverUrl: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.workitemtrackingprocessdefinitionsapiMod.IWorkItemTrackingProcessDefinitionsApi
  ] = js.native
  def getWorkItemTrackingProcessDefinitionApi(
    serverUrl: java.lang.String,
    handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]
  ): js.Promise[
    vsoDashNodeDashApiLib.workitemtrackingprocessdefinitionsapiMod.IWorkItemTrackingProcessDefinitionsApi
  ] = js.native
}

@JSImport("vso-node-api/WebApi", "WebApi")
@js.native
object WebApi extends js.Object {
  /**
       *  Convenience factory to create with a bearer token.
       * @param defaultServerUrl default server url to use when creating new apis from factory methods
       * @param defaultAuthHandler default authentication credentials to use when creating new apis from factory methods
       */
  def createWithBearerToken(defaultUrl: java.lang.String, token: java.lang.String): vsoDashNodeDashApiLib.webapiMod.WebApi = js.native
  /**
       *  Convenience factory to create with a bearer token.
       * @param defaultServerUrl default server url to use when creating new apis from factory methods
       * @param defaultAuthHandler default authentication credentials to use when creating new apis from factory methods
       */
  def createWithBearerToken(
    defaultUrl: java.lang.String,
    token: java.lang.String,
    options: vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
  ): vsoDashNodeDashApiLib.webapiMod.WebApi = js.native
}

