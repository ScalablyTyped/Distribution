package typings.vsoNodeApi

import typings.typedRestClient.restClientMod.RestClient
import typings.vsoNodeApi.buildApiMod.IBuildApi
import typings.vsoNodeApi.coreApiMod.ICoreApi
import typings.vsoNodeApi.dashboardApiMod.IDashboardApi
import typings.vsoNodeApi.extensionManagementApiMod.IExtensionManagementApi
import typings.vsoNodeApi.featureManagementApiMod.IFeatureManagementApi
import typings.vsoNodeApi.fileContainerApiMod.IFileContainerApi
import typings.vsoNodeApi.gitApiMod.IGitApi
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.interfacesLocationsInterfacesMod.ConnectionData
import typings.vsoNodeApi.locationsApiMod.ILocationsApi
import typings.vsoNodeApi.notificationApiMod.INotificationApi
import typings.vsoNodeApi.policyApiMod.IPolicyApi
import typings.vsoNodeApi.profileApiMod.IProfileApi
import typings.vsoNodeApi.projectAnalysisApiMod.IProjectAnalysisApi
import typings.vsoNodeApi.releaseApiMod.IReleaseApi
import typings.vsoNodeApi.securityRolesApiMod.ISecurityRolesApi
import typings.vsoNodeApi.taskAgentApiMod.ITaskAgentApi
import typings.vsoNodeApi.taskApiMod.ITaskApi
import typings.vsoNodeApi.testApiMod.ITestApi
import typings.vsoNodeApi.tfvcApiMod.ITfvcApi
import typings.vsoNodeApi.vsoClientMod.VsoClient
import typings.vsoNodeApi.workApiMod.IWorkApi
import typings.vsoNodeApi.workItemTrackingApiMod.IWorkItemTrackingApi
import typings.vsoNodeApi.workItemTrackingProcessApiMod.IWorkItemTrackingProcessApi
import typings.vsoNodeApi.workItemTrackingProcessDefinitionsApiMod.IWorkItemTrackingProcessDefinitionsApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webApiMod {
  
  @JSImport("vso-node-api/WebApi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vso-node-api/WebApi", "WebApi")
  @js.native
  open class WebApi protected () extends StObject {
    def this(defaultUrl: String, authHandler: IRequestHandler) = this()
    def this(defaultUrl: String, authHandler: IRequestHandler, options: IRequestOptions) = this()
    
    /* private */ def _getResourceAreaUrl(serverUrl: Any, resourceId: Any): Any = js.native
    
    /* private */ def _getResourceAreas(): Any = js.native
    
    /* private */ def _readTaskLibSecrets(lookupKey: Any): Any = js.native
    
    /* private */ var _resourceAreas: Any = js.native
    
    var authHandler: IRequestHandler = js.native
    
    def connect(): js.Promise[ConnectionData] = js.native
    
    /**
      * Each factory method can take a serverUrl and a list of handlers
      * if these aren't provided, the default url and auth handler given to the constructor for this class will be used
      */
    def getBuildApi(): js.Promise[IBuildApi] = js.native
    def getBuildApi(serverUrl: String): js.Promise[IBuildApi] = js.native
    def getBuildApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IBuildApi] = js.native
    def getBuildApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[IBuildApi] = js.native
    
    def getCoreApi(): js.Promise[ICoreApi] = js.native
    def getCoreApi(serverUrl: String): js.Promise[ICoreApi] = js.native
    def getCoreApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ICoreApi] = js.native
    def getCoreApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[ICoreApi] = js.native
    
    def getDashboardApi(): js.Promise[IDashboardApi] = js.native
    def getDashboardApi(serverUrl: String): js.Promise[IDashboardApi] = js.native
    def getDashboardApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IDashboardApi] = js.native
    def getDashboardApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[IDashboardApi] = js.native
    
    def getExtensionManagementApi(): js.Promise[IExtensionManagementApi] = js.native
    def getExtensionManagementApi(serverUrl: String): js.Promise[IExtensionManagementApi] = js.native
    def getExtensionManagementApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IExtensionManagementApi] = js.native
    def getExtensionManagementApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[IExtensionManagementApi] = js.native
    
    def getFeatureManagementApi(): js.Promise[IFeatureManagementApi] = js.native
    def getFeatureManagementApi(serverUrl: String): js.Promise[IFeatureManagementApi] = js.native
    def getFeatureManagementApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IFeatureManagementApi] = js.native
    def getFeatureManagementApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[IFeatureManagementApi] = js.native
    
    def getFileContainerApi(): js.Promise[IFileContainerApi] = js.native
    def getFileContainerApi(serverUrl: String): js.Promise[IFileContainerApi] = js.native
    def getFileContainerApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IFileContainerApi] = js.native
    def getFileContainerApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[IFileContainerApi] = js.native
    
    def getGitApi(): js.Promise[IGitApi] = js.native
    def getGitApi(serverUrl: String): js.Promise[IGitApi] = js.native
    def getGitApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IGitApi] = js.native
    def getGitApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[IGitApi] = js.native
    
    def getLocationsApi(): js.Promise[ILocationsApi] = js.native
    def getLocationsApi(serverUrl: String): js.Promise[ILocationsApi] = js.native
    def getLocationsApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ILocationsApi] = js.native
    def getLocationsApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[ILocationsApi] = js.native
    
    def getNotificationApi(): js.Promise[INotificationApi] = js.native
    def getNotificationApi(serverUrl: String): js.Promise[INotificationApi] = js.native
    def getNotificationApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[INotificationApi] = js.native
    def getNotificationApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[INotificationApi] = js.native
    
    def getPolicyApi(): js.Promise[IPolicyApi] = js.native
    def getPolicyApi(serverUrl: String): js.Promise[IPolicyApi] = js.native
    def getPolicyApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IPolicyApi] = js.native
    def getPolicyApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[IPolicyApi] = js.native
    
    def getProfileApi(): js.Promise[IProfileApi] = js.native
    def getProfileApi(serverUrl: String): js.Promise[IProfileApi] = js.native
    def getProfileApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IProfileApi] = js.native
    def getProfileApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[IProfileApi] = js.native
    
    def getProjectAnalysisApi(): js.Promise[IProjectAnalysisApi] = js.native
    def getProjectAnalysisApi(serverUrl: String): js.Promise[IProjectAnalysisApi] = js.native
    def getProjectAnalysisApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IProjectAnalysisApi] = js.native
    def getProjectAnalysisApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[IProjectAnalysisApi] = js.native
    
    def getReleaseApi(): js.Promise[IReleaseApi] = js.native
    def getReleaseApi(serverUrl: String): js.Promise[IReleaseApi] = js.native
    def getReleaseApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IReleaseApi] = js.native
    def getReleaseApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[IReleaseApi] = js.native
    
    def getSecurityRolesApi(): js.Promise[ISecurityRolesApi] = js.native
    def getSecurityRolesApi(serverUrl: String): js.Promise[ISecurityRolesApi] = js.native
    def getSecurityRolesApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ISecurityRolesApi] = js.native
    def getSecurityRolesApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[ISecurityRolesApi] = js.native
    
    def getTaskAgentApi(): js.Promise[ITaskAgentApi] = js.native
    def getTaskAgentApi(serverUrl: String): js.Promise[ITaskAgentApi] = js.native
    def getTaskAgentApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ITaskAgentApi] = js.native
    def getTaskAgentApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[ITaskAgentApi] = js.native
    
    def getTaskApi(): js.Promise[ITaskApi] = js.native
    def getTaskApi(serverUrl: String): js.Promise[ITaskApi] = js.native
    def getTaskApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ITaskApi] = js.native
    def getTaskApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[ITaskApi] = js.native
    
    def getTestApi(): js.Promise[ITestApi] = js.native
    def getTestApi(serverUrl: String): js.Promise[ITestApi] = js.native
    def getTestApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ITestApi] = js.native
    def getTestApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[ITestApi] = js.native
    
    def getTfvcApi(): js.Promise[ITfvcApi] = js.native
    def getTfvcApi(serverUrl: String): js.Promise[ITfvcApi] = js.native
    def getTfvcApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[ITfvcApi] = js.native
    def getTfvcApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[ITfvcApi] = js.native
    
    def getWorkApi(): js.Promise[IWorkApi] = js.native
    def getWorkApi(serverUrl: String): js.Promise[IWorkApi] = js.native
    def getWorkApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IWorkApi] = js.native
    def getWorkApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[IWorkApi] = js.native
    
    def getWorkItemTrackingApi(): js.Promise[IWorkItemTrackingApi] = js.native
    def getWorkItemTrackingApi(serverUrl: String): js.Promise[IWorkItemTrackingApi] = js.native
    def getWorkItemTrackingApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IWorkItemTrackingApi] = js.native
    def getWorkItemTrackingApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[IWorkItemTrackingApi] = js.native
    
    def getWorkItemTrackingProcessApi(): js.Promise[IWorkItemTrackingProcessApi] = js.native
    def getWorkItemTrackingProcessApi(serverUrl: String): js.Promise[IWorkItemTrackingProcessApi] = js.native
    def getWorkItemTrackingProcessApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IWorkItemTrackingProcessApi] = js.native
    def getWorkItemTrackingProcessApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[IWorkItemTrackingProcessApi] = js.native
    
    def getWorkItemTrackingProcessDefinitionApi(): js.Promise[IWorkItemTrackingProcessDefinitionsApi] = js.native
    def getWorkItemTrackingProcessDefinitionApi(serverUrl: String): js.Promise[IWorkItemTrackingProcessDefinitionsApi] = js.native
    def getWorkItemTrackingProcessDefinitionApi(serverUrl: String, handlers: js.Array[IRequestHandler]): js.Promise[IWorkItemTrackingProcessDefinitionsApi] = js.native
    def getWorkItemTrackingProcessDefinitionApi(serverUrl: Unit, handlers: js.Array[IRequestHandler]): js.Promise[IWorkItemTrackingProcessDefinitionsApi] = js.native
    
    var options: IRequestOptions = js.native
    
    var rest: RestClient = js.native
    
    var serverUrl: String = js.native
    
    var vsoClient: VsoClient = js.native
  }
  /* static members */
  object WebApi {
    
    @JSImport("vso-node-api/WebApi", "WebApi")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Convenience factory to create with a bearer token.
      * @param defaultServerUrl default server url to use when creating new apis from factory methods
      * @param defaultAuthHandler default authentication credentials to use when creating new apis from factory methods
      */
    inline def createWithBearerToken(defaultUrl: String, token: String): WebApi = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithBearerToken")(defaultUrl.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[WebApi]
    inline def createWithBearerToken(defaultUrl: String, token: String, options: IRequestOptions): WebApi = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithBearerToken")(defaultUrl.asInstanceOf[js.Any], token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebApi]
  }
  
  inline def getBasicHandler(username: String, password: String): IRequestHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("getBasicHandler")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[IRequestHandler]
  
  inline def getBearerHandler(token: String): IRequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("getBearerHandler")(token.asInstanceOf[js.Any]).asInstanceOf[IRequestHandler]
  
  inline def getHandlerFromToken(token: String): IRequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandlerFromToken")(token.asInstanceOf[js.Any]).asInstanceOf[IRequestHandler]
  
  inline def getNtlmHandler(username: String, password: String): IRequestHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("getNtlmHandler")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[IRequestHandler]
  inline def getNtlmHandler(username: String, password: String, workstation: String): IRequestHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("getNtlmHandler")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], workstation.asInstanceOf[js.Any])).asInstanceOf[IRequestHandler]
  inline def getNtlmHandler(username: String, password: String, workstation: String, domain: String): IRequestHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("getNtlmHandler")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], workstation.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[IRequestHandler]
  inline def getNtlmHandler(username: String, password: String, workstation: Unit, domain: String): IRequestHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("getNtlmHandler")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], workstation.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[IRequestHandler]
  
  inline def getPersonalAccessTokenHandler(token: String): IRequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("getPersonalAccessTokenHandler")(token.asInstanceOf[js.Any]).asInstanceOf[IRequestHandler]
}
