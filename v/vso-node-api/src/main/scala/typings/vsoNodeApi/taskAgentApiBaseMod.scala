package typings.vsoNodeApi

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadableStream
import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.AadLoginPromptOption
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.AadOauthTokenRequest
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.AadOauthTokenResult
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.AzureSubscriptionQueryResult
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.DataSourceBinding
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.DeploymentGroup
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.DeploymentGroupActionFilter
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.DeploymentGroupExpands
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.DeploymentMachine
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.DeploymentMachineGroup
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.InputValidationRequest
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.MachineGroupActionFilter
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.PackageMetadata
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.SecureFile
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.SecureFileActionFilter
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.ServiceEndpoint
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.ServiceEndpointRequest
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.ServiceEndpointRequestResult
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.ServiceEndpointType
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgent
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentJobRequest
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentMessage
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPool
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolActionFilter
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceDefinition
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJob
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolType
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentQueue
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentQueueActionFilter
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentSession
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskDefinition
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskDefinitionEndpoint
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskGroup
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskGroupRevision
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskHubLicenseDetails
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskResult
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.VariableGroup
import typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.VariableGroupActionFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskAgentApiBaseMod {
  
  @JSImport("vso-node-api/TaskAgentApiBase", "TaskAgentApiBase")
  @js.native
  open class TaskAgentApiBase protected () extends ITaskAgentApiBase {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait ITaskAgentApiBase extends ClientApiBase {
    
    def acquireAccessToken(authenticationRequest: AadOauthTokenRequest): js.Promise[AadOauthTokenResult] = js.native
    
    def addAgent(agent: TaskAgent, poolId: Double): js.Promise[TaskAgent] = js.native
    
    def addAgentPool(pool: TaskAgentPool): js.Promise[TaskAgentPool] = js.native
    
    def addAgentQueue(queue: TaskAgentQueue): js.Promise[TaskAgentQueue] = js.native
    def addAgentQueue(queue: TaskAgentQueue, project: String): js.Promise[TaskAgentQueue] = js.native
    
    def addDeploymentGroup(deploymentGroup: DeploymentGroup, project: String): js.Promise[DeploymentGroup] = js.native
    
    def addDeploymentMachineGroup(machineGroup: DeploymentMachineGroup, project: String): js.Promise[DeploymentMachineGroup] = js.native
    
    def addTaskGroup(taskGroup: TaskGroup, project: String): js.Promise[TaskGroup] = js.native
    
    def addVariableGroup(group: VariableGroup, project: String): js.Promise[VariableGroup] = js.native
    
    def createAadOAuthRequest(tenantId: String, redirectUri: String): js.Promise[String] = js.native
    def createAadOAuthRequest(tenantId: String, redirectUri: String, promptOption: AadLoginPromptOption): js.Promise[String] = js.native
    
    def createAgentPoolMaintenanceDefinition(definition: TaskAgentPoolMaintenanceDefinition, poolId: Double): js.Promise[TaskAgentPoolMaintenanceDefinition] = js.native
    
    def createAgentSession(session: TaskAgentSession, poolId: Double): js.Promise[TaskAgentSession] = js.native
    
    def createServiceEndpoint(endpoint: ServiceEndpoint, project: String): js.Promise[ServiceEndpoint] = js.native
    
    def createTeamProject(): js.Promise[Unit] = js.native
    def createTeamProject(project: String): js.Promise[Unit] = js.native
    
    def deleteAgent(poolId: Double, agentId: Double): js.Promise[Unit] = js.native
    
    def deleteAgentPool(poolId: Double): js.Promise[Unit] = js.native
    
    def deleteAgentPoolMaintenanceDefinition(poolId: Double, definitionId: Double): js.Promise[Unit] = js.native
    
    def deleteAgentPoolMaintenanceJob(poolId: Double, jobId: Double): js.Promise[Unit] = js.native
    
    def deleteAgentQueue(queueId: Double): js.Promise[Unit] = js.native
    def deleteAgentQueue(queueId: Double, project: String): js.Promise[Unit] = js.native
    
    def deleteAgentRequest(poolId: Double, requestId: Double, lockToken: String): js.Promise[Unit] = js.native
    def deleteAgentRequest(poolId: Double, requestId: Double, lockToken: String, result: TaskResult): js.Promise[Unit] = js.native
    
    def deleteAgentSession(poolId: Double, sessionId: String): js.Promise[Unit] = js.native
    
    def deleteDeploymentGroup(project: String, deploymentGroupId: Double): js.Promise[Unit] = js.native
    
    def deleteDeploymentMachineGroup(project: String, machineGroupId: Double): js.Promise[Unit] = js.native
    
    def deleteMessage(poolId: Double, messageId: Double, sessionId: String): js.Promise[Unit] = js.native
    
    def deleteSecureFile(project: String, secureFileId: String): js.Promise[Unit] = js.native
    
    def deleteServiceEndpoint(project: String, endpointId: String): js.Promise[Unit] = js.native
    
    def deleteTaskDefinition(taskId: String): js.Promise[Unit] = js.native
    
    def deleteTaskGroup(project: String, taskGroupId: String): js.Promise[Unit] = js.native
    
    def deleteVariableGroup(project: String, groupId: Double): js.Promise[Unit] = js.native
    
    def downloadSecureFile(project: String, secureFileId: String, ticket: String): js.Promise[ReadableStream] = js.native
    def downloadSecureFile(project: String, secureFileId: String, ticket: String, download: Boolean): js.Promise[ReadableStream] = js.native
    
    def executeServiceEndpointRequest(serviceEndpointRequest: ServiceEndpointRequest, project: String, endpointId: String): js.Promise[ServiceEndpointRequestResult] = js.native
    
    def generateDeploymentGroupAccessToken(project: String, deploymentGroupId: Double): js.Promise[String] = js.native
    
    def generateDeploymentMachineGroupAccessToken(project: String, machineGroupId: Double): js.Promise[String] = js.native
    
    def getAgent(poolId: Double, agentId: Double): js.Promise[TaskAgent] = js.native
    def getAgent(poolId: Double, agentId: Double, includeCapabilities: Boolean): js.Promise[TaskAgent] = js.native
    def getAgent(poolId: Double, agentId: Double, includeCapabilities: Boolean, includeAssignedRequest: Boolean): js.Promise[TaskAgent] = js.native
    def getAgent(
      poolId: Double,
      agentId: Double,
      includeCapabilities: Boolean,
      includeAssignedRequest: Boolean,
      propertyFilters: js.Array[String]
    ): js.Promise[TaskAgent] = js.native
    def getAgent(
      poolId: Double,
      agentId: Double,
      includeCapabilities: Boolean,
      includeAssignedRequest: Unit,
      propertyFilters: js.Array[String]
    ): js.Promise[TaskAgent] = js.native
    def getAgent(poolId: Double, agentId: Double, includeCapabilities: Unit, includeAssignedRequest: Boolean): js.Promise[TaskAgent] = js.native
    def getAgent(
      poolId: Double,
      agentId: Double,
      includeCapabilities: Unit,
      includeAssignedRequest: Boolean,
      propertyFilters: js.Array[String]
    ): js.Promise[TaskAgent] = js.native
    def getAgent(
      poolId: Double,
      agentId: Double,
      includeCapabilities: Unit,
      includeAssignedRequest: Unit,
      propertyFilters: js.Array[String]
    ): js.Promise[TaskAgent] = js.native
    
    def getAgentPool(poolId: Double): js.Promise[TaskAgentPool] = js.native
    def getAgentPool(poolId: Double, properties: js.Array[String]): js.Promise[TaskAgentPool] = js.native
    def getAgentPool(poolId: Double, properties: js.Array[String], actionFilter: TaskAgentPoolActionFilter): js.Promise[TaskAgentPool] = js.native
    def getAgentPool(poolId: Double, properties: Unit, actionFilter: TaskAgentPoolActionFilter): js.Promise[TaskAgentPool] = js.native
    
    def getAgentPoolMaintenanceDefinition(poolId: Double, definitionId: Double): js.Promise[TaskAgentPoolMaintenanceDefinition] = js.native
    
    def getAgentPoolMaintenanceDefinitions(poolId: Double): js.Promise[js.Array[TaskAgentPoolMaintenanceDefinition]] = js.native
    
    def getAgentPoolMaintenanceJob(poolId: Double, jobId: Double): js.Promise[TaskAgentPoolMaintenanceJob] = js.native
    
    def getAgentPoolMaintenanceJobLogs(poolId: Double, jobId: Double): js.Promise[ReadableStream] = js.native
    
    def getAgentPoolMaintenanceJobs(poolId: Double): js.Promise[js.Array[TaskAgentPoolMaintenanceJob]] = js.native
    def getAgentPoolMaintenanceJobs(poolId: Double, definitionId: Double): js.Promise[js.Array[TaskAgentPoolMaintenanceJob]] = js.native
    
    def getAgentPoolRoles(): js.Promise[js.Array[IdentityRef]] = js.native
    def getAgentPoolRoles(poolId: Double): js.Promise[js.Array[IdentityRef]] = js.native
    
    def getAgentPools(): js.Promise[js.Array[TaskAgentPool]] = js.native
    def getAgentPools(poolName: String): js.Promise[js.Array[TaskAgentPool]] = js.native
    def getAgentPools(poolName: String, properties: js.Array[String]): js.Promise[js.Array[TaskAgentPool]] = js.native
    def getAgentPools(
      poolName: String,
      properties: js.Array[String],
      poolType: Unit,
      actionFilter: TaskAgentPoolActionFilter
    ): js.Promise[js.Array[TaskAgentPool]] = js.native
    def getAgentPools(poolName: String, properties: js.Array[String], poolType: TaskAgentPoolType): js.Promise[js.Array[TaskAgentPool]] = js.native
    def getAgentPools(
      poolName: String,
      properties: js.Array[String],
      poolType: TaskAgentPoolType,
      actionFilter: TaskAgentPoolActionFilter
    ): js.Promise[js.Array[TaskAgentPool]] = js.native
    def getAgentPools(poolName: String, properties: Unit, poolType: Unit, actionFilter: TaskAgentPoolActionFilter): js.Promise[js.Array[TaskAgentPool]] = js.native
    def getAgentPools(poolName: String, properties: Unit, poolType: TaskAgentPoolType): js.Promise[js.Array[TaskAgentPool]] = js.native
    def getAgentPools(
      poolName: String,
      properties: Unit,
      poolType: TaskAgentPoolType,
      actionFilter: TaskAgentPoolActionFilter
    ): js.Promise[js.Array[TaskAgentPool]] = js.native
    def getAgentPools(poolName: Unit, properties: js.Array[String]): js.Promise[js.Array[TaskAgentPool]] = js.native
    def getAgentPools(
      poolName: Unit,
      properties: js.Array[String],
      poolType: Unit,
      actionFilter: TaskAgentPoolActionFilter
    ): js.Promise[js.Array[TaskAgentPool]] = js.native
    def getAgentPools(poolName: Unit, properties: js.Array[String], poolType: TaskAgentPoolType): js.Promise[js.Array[TaskAgentPool]] = js.native
    def getAgentPools(
      poolName: Unit,
      properties: js.Array[String],
      poolType: TaskAgentPoolType,
      actionFilter: TaskAgentPoolActionFilter
    ): js.Promise[js.Array[TaskAgentPool]] = js.native
    def getAgentPools(poolName: Unit, properties: Unit, poolType: Unit, actionFilter: TaskAgentPoolActionFilter): js.Promise[js.Array[TaskAgentPool]] = js.native
    def getAgentPools(poolName: Unit, properties: Unit, poolType: TaskAgentPoolType): js.Promise[js.Array[TaskAgentPool]] = js.native
    def getAgentPools(
      poolName: Unit,
      properties: Unit,
      poolType: TaskAgentPoolType,
      actionFilter: TaskAgentPoolActionFilter
    ): js.Promise[js.Array[TaskAgentPool]] = js.native
    
    def getAgentQueue(queueId: Double): js.Promise[TaskAgentQueue] = js.native
    def getAgentQueue(queueId: Double, project: String): js.Promise[TaskAgentQueue] = js.native
    def getAgentQueue(queueId: Double, project: String, actionFilter: TaskAgentQueueActionFilter): js.Promise[TaskAgentQueue] = js.native
    def getAgentQueue(queueId: Double, project: Unit, actionFilter: TaskAgentQueueActionFilter): js.Promise[TaskAgentQueue] = js.native
    
    def getAgentQueueRoles(): js.Promise[js.Array[IdentityRef]] = js.native
    def getAgentQueueRoles(queueId: Double): js.Promise[js.Array[IdentityRef]] = js.native
    
    def getAgentQueues(): js.Promise[js.Array[TaskAgentQueue]] = js.native
    def getAgentQueues(project: String): js.Promise[js.Array[TaskAgentQueue]] = js.native
    def getAgentQueues(project: String, queueName: String): js.Promise[js.Array[TaskAgentQueue]] = js.native
    def getAgentQueues(project: String, queueName: String, actionFilter: TaskAgentQueueActionFilter): js.Promise[js.Array[TaskAgentQueue]] = js.native
    def getAgentQueues(project: String, queueName: Unit, actionFilter: TaskAgentQueueActionFilter): js.Promise[js.Array[TaskAgentQueue]] = js.native
    def getAgentQueues(project: Unit, queueName: String): js.Promise[js.Array[TaskAgentQueue]] = js.native
    def getAgentQueues(project: Unit, queueName: String, actionFilter: TaskAgentQueueActionFilter): js.Promise[js.Array[TaskAgentQueue]] = js.native
    def getAgentQueues(project: Unit, queueName: Unit, actionFilter: TaskAgentQueueActionFilter): js.Promise[js.Array[TaskAgentQueue]] = js.native
    
    def getAgentRequest(poolId: Double, requestId: Double): js.Promise[TaskAgentJobRequest] = js.native
    
    def getAgentRequestsForAgent(poolId: Double, agentId: Double): js.Promise[js.Array[TaskAgentJobRequest]] = js.native
    def getAgentRequestsForAgent(poolId: Double, agentId: Double, completedRequestCount: Double): js.Promise[js.Array[TaskAgentJobRequest]] = js.native
    
    def getAgentRequestsForAgents(poolId: Double): js.Promise[js.Array[TaskAgentJobRequest]] = js.native
    def getAgentRequestsForAgents(poolId: Double, agentIds: js.Array[Double]): js.Promise[js.Array[TaskAgentJobRequest]] = js.native
    def getAgentRequestsForAgents(poolId: Double, agentIds: js.Array[Double], completedRequestCount: Double): js.Promise[js.Array[TaskAgentJobRequest]] = js.native
    def getAgentRequestsForAgents(poolId: Double, agentIds: Unit, completedRequestCount: Double): js.Promise[js.Array[TaskAgentJobRequest]] = js.native
    
    def getAgentRequestsForPlan(poolId: Double, planId: String): js.Promise[js.Array[TaskAgentJobRequest]] = js.native
    def getAgentRequestsForPlan(poolId: Double, planId: String, jobId: String): js.Promise[js.Array[TaskAgentJobRequest]] = js.native
    
    def getAgents(poolId: Double): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(poolId: Double, agentName: String): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(poolId: Double, agentName: String, includeCapabilities: Boolean): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(poolId: Double, agentName: String, includeCapabilities: Boolean, includeAssignedRequest: Boolean): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: String,
      includeCapabilities: Boolean,
      includeAssignedRequest: Boolean,
      propertyFilters: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: String,
      includeCapabilities: Boolean,
      includeAssignedRequest: Boolean,
      propertyFilters: js.Array[String],
      demands: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: String,
      includeCapabilities: Boolean,
      includeAssignedRequest: Boolean,
      propertyFilters: Unit,
      demands: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: String,
      includeCapabilities: Boolean,
      includeAssignedRequest: Unit,
      propertyFilters: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: String,
      includeCapabilities: Boolean,
      includeAssignedRequest: Unit,
      propertyFilters: js.Array[String],
      demands: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: String,
      includeCapabilities: Boolean,
      includeAssignedRequest: Unit,
      propertyFilters: Unit,
      demands: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(poolId: Double, agentName: String, includeCapabilities: Unit, includeAssignedRequest: Boolean): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: String,
      includeCapabilities: Unit,
      includeAssignedRequest: Boolean,
      propertyFilters: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: String,
      includeCapabilities: Unit,
      includeAssignedRequest: Boolean,
      propertyFilters: js.Array[String],
      demands: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: String,
      includeCapabilities: Unit,
      includeAssignedRequest: Boolean,
      propertyFilters: Unit,
      demands: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: String,
      includeCapabilities: Unit,
      includeAssignedRequest: Unit,
      propertyFilters: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: String,
      includeCapabilities: Unit,
      includeAssignedRequest: Unit,
      propertyFilters: js.Array[String],
      demands: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: String,
      includeCapabilities: Unit,
      includeAssignedRequest: Unit,
      propertyFilters: Unit,
      demands: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(poolId: Double, agentName: Unit, includeCapabilities: Boolean): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(poolId: Double, agentName: Unit, includeCapabilities: Boolean, includeAssignedRequest: Boolean): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: Unit,
      includeCapabilities: Boolean,
      includeAssignedRequest: Boolean,
      propertyFilters: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: Unit,
      includeCapabilities: Boolean,
      includeAssignedRequest: Boolean,
      propertyFilters: js.Array[String],
      demands: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: Unit,
      includeCapabilities: Boolean,
      includeAssignedRequest: Boolean,
      propertyFilters: Unit,
      demands: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: Unit,
      includeCapabilities: Boolean,
      includeAssignedRequest: Unit,
      propertyFilters: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: Unit,
      includeCapabilities: Boolean,
      includeAssignedRequest: Unit,
      propertyFilters: js.Array[String],
      demands: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: Unit,
      includeCapabilities: Boolean,
      includeAssignedRequest: Unit,
      propertyFilters: Unit,
      demands: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(poolId: Double, agentName: Unit, includeCapabilities: Unit, includeAssignedRequest: Boolean): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: Unit,
      includeCapabilities: Unit,
      includeAssignedRequest: Boolean,
      propertyFilters: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: Unit,
      includeCapabilities: Unit,
      includeAssignedRequest: Boolean,
      propertyFilters: js.Array[String],
      demands: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: Unit,
      includeCapabilities: Unit,
      includeAssignedRequest: Boolean,
      propertyFilters: Unit,
      demands: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: Unit,
      includeCapabilities: Unit,
      includeAssignedRequest: Unit,
      propertyFilters: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: Unit,
      includeCapabilities: Unit,
      includeAssignedRequest: Unit,
      propertyFilters: js.Array[String],
      demands: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    def getAgents(
      poolId: Double,
      agentName: Unit,
      includeCapabilities: Unit,
      includeAssignedRequest: Unit,
      propertyFilters: Unit,
      demands: js.Array[String]
    ): js.Promise[js.Array[TaskAgent]] = js.native
    
    def getAzureSubscriptions(): js.Promise[AzureSubscriptionQueryResult] = js.native
    
    def getDeploymentGroup(project: String, deploymentGroupId: Double): js.Promise[DeploymentGroup] = js.native
    def getDeploymentGroup(project: String, deploymentGroupId: Double, actionFilter: Unit, expand: DeploymentGroupExpands): js.Promise[DeploymentGroup] = js.native
    def getDeploymentGroup(project: String, deploymentGroupId: Double, actionFilter: DeploymentGroupActionFilter): js.Promise[DeploymentGroup] = js.native
    def getDeploymentGroup(
      project: String,
      deploymentGroupId: Double,
      actionFilter: DeploymentGroupActionFilter,
      expand: DeploymentGroupExpands
    ): js.Promise[DeploymentGroup] = js.native
    
    def getDeploymentGroups(project: String): js.Promise[js.Array[DeploymentGroup]] = js.native
    def getDeploymentGroups(project: String, name: String): js.Promise[js.Array[DeploymentGroup]] = js.native
    def getDeploymentGroups(project: String, name: String, actionFilter: Unit, expand: DeploymentGroupExpands): js.Promise[js.Array[DeploymentGroup]] = js.native
    def getDeploymentGroups(project: String, name: String, actionFilter: DeploymentGroupActionFilter): js.Promise[js.Array[DeploymentGroup]] = js.native
    def getDeploymentGroups(
      project: String,
      name: String,
      actionFilter: DeploymentGroupActionFilter,
      expand: DeploymentGroupExpands
    ): js.Promise[js.Array[DeploymentGroup]] = js.native
    def getDeploymentGroups(project: String, name: Unit, actionFilter: Unit, expand: DeploymentGroupExpands): js.Promise[js.Array[DeploymentGroup]] = js.native
    def getDeploymentGroups(project: String, name: Unit, actionFilter: DeploymentGroupActionFilter): js.Promise[js.Array[DeploymentGroup]] = js.native
    def getDeploymentGroups(
      project: String,
      name: Unit,
      actionFilter: DeploymentGroupActionFilter,
      expand: DeploymentGroupExpands
    ): js.Promise[js.Array[DeploymentGroup]] = js.native
    
    def getDeploymentMachineGroup(project: String, machineGroupId: Double): js.Promise[DeploymentMachineGroup] = js.native
    def getDeploymentMachineGroup(project: String, machineGroupId: Double, actionFilter: MachineGroupActionFilter): js.Promise[DeploymentMachineGroup] = js.native
    
    def getDeploymentMachineGroupMachines(project: String, machineGroupId: Double): js.Promise[js.Array[DeploymentMachine]] = js.native
    def getDeploymentMachineGroupMachines(project: String, machineGroupId: Double, tagFilters: js.Array[String]): js.Promise[js.Array[DeploymentMachine]] = js.native
    
    def getDeploymentMachineGroups(project: String): js.Promise[js.Array[DeploymentMachineGroup]] = js.native
    def getDeploymentMachineGroups(project: String, machineGroupName: String): js.Promise[js.Array[DeploymentMachineGroup]] = js.native
    def getDeploymentMachineGroups(project: String, machineGroupName: String, actionFilter: MachineGroupActionFilter): js.Promise[js.Array[DeploymentMachineGroup]] = js.native
    def getDeploymentMachineGroups(project: String, machineGroupName: Unit, actionFilter: MachineGroupActionFilter): js.Promise[js.Array[DeploymentMachineGroup]] = js.native
    
    def getDeploymentMachines(project: String, deploymentGroupId: Double): js.Promise[js.Array[DeploymentMachine]] = js.native
    def getDeploymentMachines(project: String, deploymentGroupId: Double, tags: js.Array[String]): js.Promise[js.Array[DeploymentMachine]] = js.native
    
    def getMessage(poolId: Double, sessionId: String): js.Promise[TaskAgentMessage] = js.native
    def getMessage(poolId: Double, sessionId: String, lastMessageId: Double): js.Promise[TaskAgentMessage] = js.native
    
    def getPackage(packageType: String, platform: String, version: String): js.Promise[PackageMetadata] = js.native
    
    def getPackages(): js.Promise[js.Array[PackageMetadata]] = js.native
    def getPackages(packageType: String): js.Promise[js.Array[PackageMetadata]] = js.native
    def getPackages(packageType: String, platform: String): js.Promise[js.Array[PackageMetadata]] = js.native
    def getPackages(packageType: String, platform: String, top: Double): js.Promise[js.Array[PackageMetadata]] = js.native
    def getPackages(packageType: String, platform: Unit, top: Double): js.Promise[js.Array[PackageMetadata]] = js.native
    def getPackages(packageType: Unit, platform: String): js.Promise[js.Array[PackageMetadata]] = js.native
    def getPackages(packageType: Unit, platform: String, top: Double): js.Promise[js.Array[PackageMetadata]] = js.native
    def getPackages(packageType: Unit, platform: Unit, top: Double): js.Promise[js.Array[PackageMetadata]] = js.native
    
    def getSecureFile(project: String, secureFileId: String): js.Promise[SecureFile] = js.native
    def getSecureFile(project: String, secureFileId: String, includeDownloadTicket: Boolean): js.Promise[SecureFile] = js.native
    
    def getSecureFiles(project: String): js.Promise[js.Array[SecureFile]] = js.native
    def getSecureFiles(project: String, namePattern: String): js.Promise[js.Array[SecureFile]] = js.native
    def getSecureFiles(project: String, namePattern: String, includeDownloadTickets: Boolean): js.Promise[js.Array[SecureFile]] = js.native
    def getSecureFiles(
      project: String,
      namePattern: String,
      includeDownloadTickets: Boolean,
      actionFilter: SecureFileActionFilter
    ): js.Promise[js.Array[SecureFile]] = js.native
    def getSecureFiles(
      project: String,
      namePattern: String,
      includeDownloadTickets: Unit,
      actionFilter: SecureFileActionFilter
    ): js.Promise[js.Array[SecureFile]] = js.native
    def getSecureFiles(project: String, namePattern: Unit, includeDownloadTickets: Boolean): js.Promise[js.Array[SecureFile]] = js.native
    def getSecureFiles(
      project: String,
      namePattern: Unit,
      includeDownloadTickets: Boolean,
      actionFilter: SecureFileActionFilter
    ): js.Promise[js.Array[SecureFile]] = js.native
    def getSecureFiles(
      project: String,
      namePattern: Unit,
      includeDownloadTickets: Unit,
      actionFilter: SecureFileActionFilter
    ): js.Promise[js.Array[SecureFile]] = js.native
    
    def getSecureFilesByIds(project: String, secureFileIds: js.Array[String]): js.Promise[js.Array[SecureFile]] = js.native
    def getSecureFilesByIds(project: String, secureFileIds: js.Array[String], includeDownloadTickets: Boolean): js.Promise[js.Array[SecureFile]] = js.native
    
    def getServiceEndpointDetails(project: String, endpointId: String): js.Promise[ServiceEndpoint] = js.native
    
    def getServiceEndpointTypes(): js.Promise[js.Array[ServiceEndpointType]] = js.native
    def getServiceEndpointTypes(`type`: String): js.Promise[js.Array[ServiceEndpointType]] = js.native
    def getServiceEndpointTypes(`type`: String, scheme: String): js.Promise[js.Array[ServiceEndpointType]] = js.native
    def getServiceEndpointTypes(`type`: Unit, scheme: String): js.Promise[js.Array[ServiceEndpointType]] = js.native
    
    def getServiceEndpoints(project: String): js.Promise[js.Array[ServiceEndpoint]] = js.native
    def getServiceEndpoints(project: String, `type`: String): js.Promise[js.Array[ServiceEndpoint]] = js.native
    def getServiceEndpoints(project: String, `type`: String, authSchemes: js.Array[String]): js.Promise[js.Array[ServiceEndpoint]] = js.native
    def getServiceEndpoints(project: String, `type`: String, authSchemes: js.Array[String], endpointIds: js.Array[String]): js.Promise[js.Array[ServiceEndpoint]] = js.native
    def getServiceEndpoints(
      project: String,
      `type`: String,
      authSchemes: js.Array[String],
      endpointIds: js.Array[String],
      includeFailed: Boolean
    ): js.Promise[js.Array[ServiceEndpoint]] = js.native
    def getServiceEndpoints(
      project: String,
      `type`: String,
      authSchemes: js.Array[String],
      endpointIds: Unit,
      includeFailed: Boolean
    ): js.Promise[js.Array[ServiceEndpoint]] = js.native
    def getServiceEndpoints(project: String, `type`: String, authSchemes: Unit, endpointIds: js.Array[String]): js.Promise[js.Array[ServiceEndpoint]] = js.native
    def getServiceEndpoints(
      project: String,
      `type`: String,
      authSchemes: Unit,
      endpointIds: js.Array[String],
      includeFailed: Boolean
    ): js.Promise[js.Array[ServiceEndpoint]] = js.native
    def getServiceEndpoints(project: String, `type`: String, authSchemes: Unit, endpointIds: Unit, includeFailed: Boolean): js.Promise[js.Array[ServiceEndpoint]] = js.native
    def getServiceEndpoints(project: String, `type`: Unit, authSchemes: js.Array[String]): js.Promise[js.Array[ServiceEndpoint]] = js.native
    def getServiceEndpoints(project: String, `type`: Unit, authSchemes: js.Array[String], endpointIds: js.Array[String]): js.Promise[js.Array[ServiceEndpoint]] = js.native
    def getServiceEndpoints(
      project: String,
      `type`: Unit,
      authSchemes: js.Array[String],
      endpointIds: js.Array[String],
      includeFailed: Boolean
    ): js.Promise[js.Array[ServiceEndpoint]] = js.native
    def getServiceEndpoints(
      project: String,
      `type`: Unit,
      authSchemes: js.Array[String],
      endpointIds: Unit,
      includeFailed: Boolean
    ): js.Promise[js.Array[ServiceEndpoint]] = js.native
    def getServiceEndpoints(project: String, `type`: Unit, authSchemes: Unit, endpointIds: js.Array[String]): js.Promise[js.Array[ServiceEndpoint]] = js.native
    def getServiceEndpoints(
      project: String,
      `type`: Unit,
      authSchemes: Unit,
      endpointIds: js.Array[String],
      includeFailed: Boolean
    ): js.Promise[js.Array[ServiceEndpoint]] = js.native
    def getServiceEndpoints(project: String, `type`: Unit, authSchemes: Unit, endpointIds: Unit, includeFailed: Boolean): js.Promise[js.Array[ServiceEndpoint]] = js.native
    
    def getTaskContentZip(taskId: String, versionString: String): js.Promise[ReadableStream] = js.native
    def getTaskContentZip(taskId: String, versionString: String, visibility: js.Array[String]): js.Promise[ReadableStream] = js.native
    def getTaskContentZip(taskId: String, versionString: String, visibility: js.Array[String], scopeLocal: Boolean): js.Promise[ReadableStream] = js.native
    def getTaskContentZip(taskId: String, versionString: String, visibility: Unit, scopeLocal: Boolean): js.Promise[ReadableStream] = js.native
    
    def getTaskDefinition(taskId: String, versionString: String): js.Promise[TaskDefinition] = js.native
    def getTaskDefinition(taskId: String, versionString: String, visibility: js.Array[String]): js.Promise[TaskDefinition] = js.native
    def getTaskDefinition(taskId: String, versionString: String, visibility: js.Array[String], scopeLocal: Boolean): js.Promise[TaskDefinition] = js.native
    def getTaskDefinition(taskId: String, versionString: String, visibility: Unit, scopeLocal: Boolean): js.Promise[TaskDefinition] = js.native
    
    def getTaskDefinitions(): js.Promise[js.Array[TaskDefinition]] = js.native
    def getTaskDefinitions(taskId: String): js.Promise[js.Array[TaskDefinition]] = js.native
    def getTaskDefinitions(taskId: String, visibility: js.Array[String]): js.Promise[js.Array[TaskDefinition]] = js.native
    def getTaskDefinitions(taskId: String, visibility: js.Array[String], scopeLocal: Boolean): js.Promise[js.Array[TaskDefinition]] = js.native
    def getTaskDefinitions(taskId: String, visibility: Unit, scopeLocal: Boolean): js.Promise[js.Array[TaskDefinition]] = js.native
    def getTaskDefinitions(taskId: Unit, visibility: js.Array[String]): js.Promise[js.Array[TaskDefinition]] = js.native
    def getTaskDefinitions(taskId: Unit, visibility: js.Array[String], scopeLocal: Boolean): js.Promise[js.Array[TaskDefinition]] = js.native
    def getTaskDefinitions(taskId: Unit, visibility: Unit, scopeLocal: Boolean): js.Promise[js.Array[TaskDefinition]] = js.native
    
    def getTaskGroupHistory(project: String, taskGroupId: String): js.Promise[js.Array[TaskGroupRevision]] = js.native
    
    def getTaskGroupRevision(project: String, taskGroupId: String, revision: Double): js.Promise[ReadableStream] = js.native
    
    def getTaskGroups(project: String): js.Promise[js.Array[TaskGroup]] = js.native
    def getTaskGroups(project: String, taskGroupId: String): js.Promise[js.Array[TaskGroup]] = js.native
    def getTaskGroups(project: String, taskGroupId: String, expanded: Boolean): js.Promise[js.Array[TaskGroup]] = js.native
    def getTaskGroups(project: String, taskGroupId: Unit, expanded: Boolean): js.Promise[js.Array[TaskGroup]] = js.native
    
    def getTaskHubLicenseDetails(hubName: String): js.Promise[TaskHubLicenseDetails] = js.native
    def getTaskHubLicenseDetails(hubName: String, includeEnterpriseUsersCount: Boolean): js.Promise[TaskHubLicenseDetails] = js.native
    def getTaskHubLicenseDetails(hubName: String, includeEnterpriseUsersCount: Boolean, includeHostedAgentMinutesCount: Boolean): js.Promise[TaskHubLicenseDetails] = js.native
    def getTaskHubLicenseDetails(hubName: String, includeEnterpriseUsersCount: Unit, includeHostedAgentMinutesCount: Boolean): js.Promise[TaskHubLicenseDetails] = js.native
    
    def getVariableGroup(project: String, groupId: Double): js.Promise[VariableGroup] = js.native
    
    def getVariableGroups(project: String): js.Promise[js.Array[VariableGroup]] = js.native
    def getVariableGroups(project: String, groupName: String): js.Promise[js.Array[VariableGroup]] = js.native
    def getVariableGroups(project: String, groupName: String, actionFilter: VariableGroupActionFilter): js.Promise[js.Array[VariableGroup]] = js.native
    def getVariableGroups(project: String, groupName: Unit, actionFilter: VariableGroupActionFilter): js.Promise[js.Array[VariableGroup]] = js.native
    
    def getVariableGroupsById(project: String, groupIds: js.Array[Double]): js.Promise[js.Array[VariableGroup]] = js.native
    
    def getVstsAadTenantId(): js.Promise[String] = js.native
    
    def queryEndpoint(endpoint: TaskDefinitionEndpoint): js.Promise[js.Array[String]] = js.native
    
    def querySecureFilesByProperties(condition: String, project: String): js.Promise[js.Array[SecureFile]] = js.native
    def querySecureFilesByProperties(condition: String, project: String, namePattern: String): js.Promise[js.Array[SecureFile]] = js.native
    
    def queryServiceEndpoint(binding: DataSourceBinding, project: String): js.Promise[js.Array[String]] = js.native
    
    def queueAgentPoolMaintenanceJob(job: TaskAgentPoolMaintenanceJob, poolId: Double): js.Promise[TaskAgentPoolMaintenanceJob] = js.native
    
    def queueAgentRequest(request: TaskAgentJobRequest, poolId: Double): js.Promise[TaskAgentJobRequest] = js.native
    
    def refreshAgent(poolId: Double, agentId: Double): js.Promise[Unit] = js.native
    
    def refreshAgents(poolId: Double): js.Promise[Unit] = js.native
    
    def replaceAgent(agent: TaskAgent, poolId: Double, agentId: Double): js.Promise[TaskAgent] = js.native
    
    def sendMessage(message: TaskAgentMessage, poolId: Double, requestId: Double): js.Promise[Unit] = js.native
    
    def updateAgent(agent: TaskAgent, poolId: Double, agentId: Double): js.Promise[TaskAgent] = js.native
    
    def updateAgentPool(pool: TaskAgentPool, poolId: Double): js.Promise[TaskAgentPool] = js.native
    
    def updateAgentPoolMaintenanceDefinition(definition: TaskAgentPoolMaintenanceDefinition, poolId: Double, definitionId: Double): js.Promise[TaskAgentPoolMaintenanceDefinition] = js.native
    
    def updateAgentPoolMaintenanceJob(job: TaskAgentPoolMaintenanceJob, poolId: Double, jobId: Double): js.Promise[TaskAgentPoolMaintenanceJob] = js.native
    
    def updateAgentRequest(request: TaskAgentJobRequest, poolId: Double, requestId: Double, lockToken: String): js.Promise[TaskAgentJobRequest] = js.native
    
    def updateAgentUpdateState(poolId: Double, agentId: Double, currentState: String): js.Promise[TaskAgent] = js.native
    
    def updateAgentUserCapabilities(userCapabilities: StringDictionary[String], poolId: Double, agentId: Double): js.Promise[TaskAgent] = js.native
    
    def updateDeploymentGroup(deploymentGroup: DeploymentGroup, project: String, deploymentGroupId: Double): js.Promise[DeploymentGroup] = js.native
    
    def updateDeploymentMachineGroup(machineGroup: DeploymentMachineGroup, project: String, machineGroupId: Double): js.Promise[DeploymentMachineGroup] = js.native
    
    def updateDeploymentMachineGroupMachines(deploymentMachines: js.Array[DeploymentMachine], project: String, machineGroupId: Double): js.Promise[js.Array[DeploymentMachine]] = js.native
    
    def updateDeploymentMachines(deploymentMachines: js.Array[DeploymentMachine], project: String, deploymentGroupId: Double): js.Promise[js.Array[DeploymentMachine]] = js.native
    
    def updateSecureFile(secureFile: SecureFile, project: String, secureFileId: String): js.Promise[SecureFile] = js.native
    
    def updateSecureFiles(secureFiles: js.Array[SecureFile], project: String): js.Promise[js.Array[SecureFile]] = js.native
    
    def updateServiceEndpoint(endpoint: ServiceEndpoint, project: String, endpointId: String): js.Promise[ServiceEndpoint] = js.native
    
    def updateServiceEndpoints(endpoints: js.Array[ServiceEndpoint], project: String): js.Promise[js.Array[ServiceEndpoint]] = js.native
    
    def updateTaskGroup(taskGroup: TaskGroup, project: String): js.Promise[TaskGroup] = js.native
    
    def updateTaskHubLicenseDetails(taskHubLicenseDetails: TaskHubLicenseDetails, hubName: String): js.Promise[TaskHubLicenseDetails] = js.native
    
    def updateVariableGroup(group: VariableGroup, project: String, groupId: Double): js.Promise[VariableGroup] = js.native
    
    def uploadSecureFile(customHeaders: Any, contentStream: ReadableStream, project: String, name: String): js.Promise[SecureFile] = js.native
    
    def validateInputs(inputValidationRequest: InputValidationRequest): js.Promise[InputValidationRequest] = js.native
  }
}
