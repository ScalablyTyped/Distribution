package typings
package vsoDashNodeDashApiLib.taskagentapibaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITaskAgentApiBase
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def acquireAccessToken(authenticationRequest: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.AadOauthTokenRequest): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.AadOauthTokenResult] = js.native
  def addAgent(agent: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent, poolId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent] = js.native
  def addAgentPool(pool: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPool): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPool] = js.native
  def addAgentQueue(queue: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentQueue): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentQueue] = js.native
  def addAgentQueue(
    queue: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentQueue,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentQueue] = js.native
  def addDeploymentGroup(
    deploymentGroup: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroup,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroup] = js.native
  def addDeploymentMachineGroup(
    machineGroup: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachineGroup,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachineGroup] = js.native
  def addTaskGroup(
    taskGroup: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskGroup,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskGroup] = js.native
  def addVariableGroup(
    group: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.VariableGroup,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.VariableGroup] = js.native
  def createAadOAuthRequest(tenantId: java.lang.String, redirectUri: java.lang.String): js.Promise[java.lang.String] = js.native
  def createAadOAuthRequest(
    tenantId: java.lang.String,
    redirectUri: java.lang.String,
    promptOption: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.AadLoginPromptOption
  ): js.Promise[java.lang.String] = js.native
  def createAgentPoolMaintenanceDefinition(
    definition: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceDefinition,
    poolId: scala.Double
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceDefinition
  ] = js.native
  def createAgentSession(
    session: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentSession,
    poolId: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentSession] = js.native
  def createServiceEndpoint(
    endpoint: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpoint,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpoint] = js.native
  def createTeamProject(): js.Promise[scala.Unit] = js.native
  def createTeamProject(project: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteAgent(poolId: scala.Double, agentId: scala.Double): js.Promise[scala.Unit] = js.native
  def deleteAgentPool(poolId: scala.Double): js.Promise[scala.Unit] = js.native
  def deleteAgentPoolMaintenanceDefinition(poolId: scala.Double, definitionId: scala.Double): js.Promise[scala.Unit] = js.native
  def deleteAgentPoolMaintenanceJob(poolId: scala.Double, jobId: scala.Double): js.Promise[scala.Unit] = js.native
  def deleteAgentQueue(queueId: scala.Double): js.Promise[scala.Unit] = js.native
  def deleteAgentQueue(queueId: scala.Double, project: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteAgentRequest(poolId: scala.Double, requestId: scala.Double, lockToken: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteAgentRequest(
    poolId: scala.Double,
    requestId: scala.Double,
    lockToken: java.lang.String,
    result: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskResult
  ): js.Promise[scala.Unit] = js.native
  def deleteAgentSession(poolId: scala.Double, sessionId: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteDeploymentGroup(project: java.lang.String, deploymentGroupId: scala.Double): js.Promise[scala.Unit] = js.native
  def deleteDeploymentMachineGroup(project: java.lang.String, machineGroupId: scala.Double): js.Promise[scala.Unit] = js.native
  def deleteMessage(poolId: scala.Double, messageId: scala.Double, sessionId: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteSecureFile(project: java.lang.String, secureFileId: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteServiceEndpoint(project: java.lang.String, endpointId: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteTaskDefinition(taskId: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteTaskGroup(project: java.lang.String, taskGroupId: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteVariableGroup(project: java.lang.String, groupId: scala.Double): js.Promise[scala.Unit] = js.native
  def downloadSecureFile(project: java.lang.String, secureFileId: java.lang.String, ticket: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def downloadSecureFile(
    project: java.lang.String,
    secureFileId: java.lang.String,
    ticket: java.lang.String,
    download: scala.Boolean
  ): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def executeServiceEndpointRequest(
    serviceEndpointRequest: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpointRequest,
    project: java.lang.String,
    endpointId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpointRequestResult
  ] = js.native
  def generateDeploymentGroupAccessToken(project: java.lang.String, deploymentGroupId: scala.Double): js.Promise[java.lang.String] = js.native
  def generateDeploymentMachineGroupAccessToken(project: java.lang.String, machineGroupId: scala.Double): js.Promise[java.lang.String] = js.native
  def getAgent(poolId: scala.Double, agentId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent] = js.native
  def getAgent(poolId: scala.Double, agentId: scala.Double, includeCapabilities: scala.Boolean): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent] = js.native
  def getAgent(
    poolId: scala.Double,
    agentId: scala.Double,
    includeCapabilities: scala.Boolean,
    includeAssignedRequest: scala.Boolean
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent] = js.native
  def getAgent(
    poolId: scala.Double,
    agentId: scala.Double,
    includeCapabilities: scala.Boolean,
    includeAssignedRequest: scala.Boolean,
    propertyFilters: js.Array[java.lang.String]
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent] = js.native
  def getAgentPool(poolId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPool] = js.native
  def getAgentPool(poolId: scala.Double, properties: js.Array[java.lang.String]): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPool] = js.native
  def getAgentPool(
    poolId: scala.Double,
    properties: js.Array[java.lang.String],
    actionFilter: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolActionFilter
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPool] = js.native
  def getAgentPoolMaintenanceDefinition(poolId: scala.Double, definitionId: scala.Double): js.Promise[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceDefinition
  ] = js.native
  def getAgentPoolMaintenanceDefinitions(poolId: scala.Double): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceDefinition
    ]
  ] = js.native
  def getAgentPoolMaintenanceJob(poolId: scala.Double, jobId: scala.Double): js.Promise[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJob
  ] = js.native
  def getAgentPoolMaintenanceJobLogs(poolId: scala.Double, jobId: scala.Double): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getAgentPoolMaintenanceJobs(poolId: scala.Double): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJob
    ]
  ] = js.native
  def getAgentPoolMaintenanceJobs(poolId: scala.Double, definitionId: scala.Double): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJob
    ]
  ] = js.native
  def getAgentPoolRoles(): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef]] = js.native
  def getAgentPoolRoles(poolId: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef]] = js.native
  def getAgentPools(): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPool]] = js.native
  def getAgentPools(poolName: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPool]] = js.native
  def getAgentPools(poolName: java.lang.String, properties: js.Array[java.lang.String]): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPool]] = js.native
  def getAgentPools(
    poolName: java.lang.String,
    properties: js.Array[java.lang.String],
    poolType: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolType
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPool]] = js.native
  def getAgentPools(
    poolName: java.lang.String,
    properties: js.Array[java.lang.String],
    poolType: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolType,
    actionFilter: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolActionFilter
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPool]] = js.native
  def getAgentQueue(queueId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentQueue] = js.native
  def getAgentQueue(queueId: scala.Double, project: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentQueue] = js.native
  def getAgentQueue(
    queueId: scala.Double,
    project: java.lang.String,
    actionFilter: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentQueueActionFilter
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentQueue] = js.native
  def getAgentQueueRoles(): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef]] = js.native
  def getAgentQueueRoles(queueId: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef]] = js.native
  def getAgentQueues(): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentQueue]] = js.native
  def getAgentQueues(project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentQueue]] = js.native
  def getAgentQueues(project: java.lang.String, queueName: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentQueue]] = js.native
  def getAgentQueues(
    project: java.lang.String,
    queueName: java.lang.String,
    actionFilter: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentQueueActionFilter
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentQueue]] = js.native
  def getAgentRequest(poolId: scala.Double, requestId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentJobRequest] = js.native
  def getAgentRequestsForAgent(poolId: scala.Double, agentId: scala.Double): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentJobRequest]
  ] = js.native
  def getAgentRequestsForAgent(poolId: scala.Double, agentId: scala.Double, completedRequestCount: scala.Double): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentJobRequest]
  ] = js.native
  def getAgentRequestsForAgents(poolId: scala.Double): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentJobRequest]
  ] = js.native
  def getAgentRequestsForAgents(poolId: scala.Double, agentIds: js.Array[scala.Double]): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentJobRequest]
  ] = js.native
  def getAgentRequestsForAgents(poolId: scala.Double, agentIds: js.Array[scala.Double], completedRequestCount: scala.Double): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentJobRequest]
  ] = js.native
  def getAgentRequestsForPlan(poolId: scala.Double, planId: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentJobRequest]
  ] = js.native
  def getAgentRequestsForPlan(poolId: scala.Double, planId: java.lang.String, jobId: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentJobRequest]
  ] = js.native
  def getAgents(poolId: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent]] = js.native
  def getAgents(poolId: scala.Double, agentName: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent]] = js.native
  def getAgents(poolId: scala.Double, agentName: java.lang.String, includeCapabilities: scala.Boolean): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent]] = js.native
  def getAgents(
    poolId: scala.Double,
    agentName: java.lang.String,
    includeCapabilities: scala.Boolean,
    includeAssignedRequest: scala.Boolean
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent]] = js.native
  def getAgents(
    poolId: scala.Double,
    agentName: java.lang.String,
    includeCapabilities: scala.Boolean,
    includeAssignedRequest: scala.Boolean,
    propertyFilters: js.Array[java.lang.String]
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent]] = js.native
  def getAgents(
    poolId: scala.Double,
    agentName: java.lang.String,
    includeCapabilities: scala.Boolean,
    includeAssignedRequest: scala.Boolean,
    propertyFilters: js.Array[java.lang.String],
    demands: js.Array[java.lang.String]
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent]] = js.native
  def getAzureSubscriptions(): js.Promise[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.AzureSubscriptionQueryResult
  ] = js.native
  def getDeploymentGroup(project: java.lang.String, deploymentGroupId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroup] = js.native
  def getDeploymentGroup(
    project: java.lang.String,
    deploymentGroupId: scala.Double,
    actionFilter: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroupActionFilter
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroup] = js.native
  def getDeploymentGroup(
    project: java.lang.String,
    deploymentGroupId: scala.Double,
    actionFilter: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroupActionFilter,
    expand: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroupExpands
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroup] = js.native
  def getDeploymentGroups(project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroup]] = js.native
  def getDeploymentGroups(project: java.lang.String, name: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroup]] = js.native
  def getDeploymentGroups(
    project: java.lang.String,
    name: java.lang.String,
    actionFilter: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroupActionFilter
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroup]] = js.native
  def getDeploymentGroups(
    project: java.lang.String,
    name: java.lang.String,
    actionFilter: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroupActionFilter,
    expand: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroupExpands
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroup]] = js.native
  def getDeploymentMachineGroup(project: java.lang.String, machineGroupId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachineGroup] = js.native
  def getDeploymentMachineGroup(
    project: java.lang.String,
    machineGroupId: scala.Double,
    actionFilter: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.MachineGroupActionFilter
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachineGroup] = js.native
  def getDeploymentMachineGroupMachines(project: java.lang.String, machineGroupId: scala.Double): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachine]
  ] = js.native
  def getDeploymentMachineGroupMachines(project: java.lang.String, machineGroupId: scala.Double, tagFilters: js.Array[java.lang.String]): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachine]
  ] = js.native
  def getDeploymentMachineGroups(project: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachineGroup]
  ] = js.native
  def getDeploymentMachineGroups(project: java.lang.String, machineGroupName: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachineGroup]
  ] = js.native
  def getDeploymentMachineGroups(
    project: java.lang.String,
    machineGroupName: java.lang.String,
    actionFilter: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.MachineGroupActionFilter
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachineGroup]
  ] = js.native
  def getDeploymentMachines(project: java.lang.String, deploymentGroupId: scala.Double): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachine]
  ] = js.native
  def getDeploymentMachines(project: java.lang.String, deploymentGroupId: scala.Double, tags: js.Array[java.lang.String]): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachine]
  ] = js.native
  def getMessage(poolId: scala.Double, sessionId: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentMessage] = js.native
  def getMessage(poolId: scala.Double, sessionId: java.lang.String, lastMessageId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentMessage] = js.native
  def getPackage(packageType: java.lang.String, platform: java.lang.String, version: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.PackageMetadata] = js.native
  def getPackages(): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.PackageMetadata]] = js.native
  def getPackages(packageType: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.PackageMetadata]] = js.native
  def getPackages(packageType: java.lang.String, platform: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.PackageMetadata]] = js.native
  def getPackages(packageType: java.lang.String, platform: java.lang.String, top: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.PackageMetadata]] = js.native
  def getSecureFile(project: java.lang.String, secureFileId: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFile] = js.native
  def getSecureFile(project: java.lang.String, secureFileId: java.lang.String, includeDownloadTicket: scala.Boolean): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFile] = js.native
  def getSecureFiles(project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFile]] = js.native
  def getSecureFiles(project: java.lang.String, namePattern: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFile]] = js.native
  def getSecureFiles(project: java.lang.String, namePattern: java.lang.String, includeDownloadTickets: scala.Boolean): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFile]] = js.native
  def getSecureFiles(
    project: java.lang.String,
    namePattern: java.lang.String,
    includeDownloadTickets: scala.Boolean,
    actionFilter: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFileActionFilter
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFile]] = js.native
  def getSecureFilesByIds(project: java.lang.String, secureFileIds: js.Array[java.lang.String]): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFile]] = js.native
  def getSecureFilesByIds(
    project: java.lang.String,
    secureFileIds: js.Array[java.lang.String],
    includeDownloadTickets: scala.Boolean
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFile]] = js.native
  def getServiceEndpointDetails(project: java.lang.String, endpointId: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpoint] = js.native
  def getServiceEndpointTypes(): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpointType]
  ] = js.native
  def getServiceEndpointTypes(`type`: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpointType]
  ] = js.native
  def getServiceEndpointTypes(`type`: java.lang.String, scheme: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpointType]
  ] = js.native
  def getServiceEndpoints(project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpoint]] = js.native
  def getServiceEndpoints(project: java.lang.String, `type`: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpoint]] = js.native
  def getServiceEndpoints(project: java.lang.String, `type`: java.lang.String, authSchemes: js.Array[java.lang.String]): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpoint]] = js.native
  def getServiceEndpoints(
    project: java.lang.String,
    `type`: java.lang.String,
    authSchemes: js.Array[java.lang.String],
    endpointIds: js.Array[java.lang.String]
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpoint]] = js.native
  def getServiceEndpoints(
    project: java.lang.String,
    `type`: java.lang.String,
    authSchemes: js.Array[java.lang.String],
    endpointIds: js.Array[java.lang.String],
    includeFailed: scala.Boolean
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpoint]] = js.native
  def getTaskContentZip(taskId: java.lang.String, versionString: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTaskContentZip(taskId: java.lang.String, versionString: java.lang.String, visibility: js.Array[java.lang.String]): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTaskContentZip(
    taskId: java.lang.String,
    versionString: java.lang.String,
    visibility: js.Array[java.lang.String],
    scopeLocal: scala.Boolean
  ): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTaskDefinition(taskId: java.lang.String, versionString: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinition] = js.native
  def getTaskDefinition(taskId: java.lang.String, versionString: java.lang.String, visibility: js.Array[java.lang.String]): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinition] = js.native
  def getTaskDefinition(
    taskId: java.lang.String,
    versionString: java.lang.String,
    visibility: js.Array[java.lang.String],
    scopeLocal: scala.Boolean
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinition] = js.native
  def getTaskDefinitions(): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinition]] = js.native
  def getTaskDefinitions(taskId: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinition]] = js.native
  def getTaskDefinitions(taskId: java.lang.String, visibility: js.Array[java.lang.String]): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinition]] = js.native
  def getTaskDefinitions(taskId: java.lang.String, visibility: js.Array[java.lang.String], scopeLocal: scala.Boolean): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinition]] = js.native
  def getTaskGroupHistory(project: java.lang.String, taskGroupId: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskGroupRevision]
  ] = js.native
  def getTaskGroupRevision(project: java.lang.String, taskGroupId: java.lang.String, revision: scala.Double): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTaskGroups(project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskGroup]] = js.native
  def getTaskGroups(project: java.lang.String, taskGroupId: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskGroup]] = js.native
  def getTaskGroups(project: java.lang.String, taskGroupId: java.lang.String, expanded: scala.Boolean): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskGroup]] = js.native
  def getTaskHubLicenseDetails(hubName: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskHubLicenseDetails] = js.native
  def getTaskHubLicenseDetails(hubName: java.lang.String, includeEnterpriseUsersCount: scala.Boolean): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskHubLicenseDetails] = js.native
  def getTaskHubLicenseDetails(
    hubName: java.lang.String,
    includeEnterpriseUsersCount: scala.Boolean,
    includeHostedAgentMinutesCount: scala.Boolean
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskHubLicenseDetails] = js.native
  def getVariableGroup(project: java.lang.String, groupId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.VariableGroup] = js.native
  def getVariableGroups(project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.VariableGroup]] = js.native
  def getVariableGroups(project: java.lang.String, groupName: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.VariableGroup]] = js.native
  def getVariableGroups(
    project: java.lang.String,
    groupName: java.lang.String,
    actionFilter: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.VariableGroupActionFilter
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.VariableGroup]] = js.native
  def getVariableGroupsById(project: java.lang.String, groupIds: js.Array[scala.Double]): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.VariableGroup]] = js.native
  def getVstsAadTenantId(): js.Promise[java.lang.String] = js.native
  def queryEndpoint(endpoint: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskDefinitionEndpoint): js.Promise[js.Array[java.lang.String]] = js.native
  def querySecureFilesByProperties(condition: java.lang.String, project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFile]] = js.native
  def querySecureFilesByProperties(condition: java.lang.String, project: java.lang.String, namePattern: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFile]] = js.native
  def queryServiceEndpoint(
    binding: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DataSourceBinding,
    project: java.lang.String
  ): js.Promise[js.Array[java.lang.String]] = js.native
  def queueAgentPoolMaintenanceJob(
    job: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJob,
    poolId: scala.Double
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJob
  ] = js.native
  def queueAgentRequest(
    request: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentJobRequest,
    poolId: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentJobRequest] = js.native
  def refreshAgent(poolId: scala.Double, agentId: scala.Double): js.Promise[scala.Unit] = js.native
  def refreshAgents(poolId: scala.Double): js.Promise[scala.Unit] = js.native
  def replaceAgent(
    agent: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent,
    poolId: scala.Double,
    agentId: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent] = js.native
  def sendMessage(
    message: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentMessage,
    poolId: scala.Double,
    requestId: scala.Double
  ): js.Promise[scala.Unit] = js.native
  def updateAgent(
    agent: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent,
    poolId: scala.Double,
    agentId: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent] = js.native
  def updateAgentPool(pool: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPool, poolId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPool] = js.native
  def updateAgentPoolMaintenanceDefinition(
    definition: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceDefinition,
    poolId: scala.Double,
    definitionId: scala.Double
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceDefinition
  ] = js.native
  def updateAgentPoolMaintenanceJob(
    job: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJob,
    poolId: scala.Double,
    jobId: scala.Double
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJob
  ] = js.native
  def updateAgentRequest(
    request: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentJobRequest,
    poolId: scala.Double,
    requestId: scala.Double,
    lockToken: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgentJobRequest] = js.native
  def updateAgentUpdateState(poolId: scala.Double, agentId: scala.Double, currentState: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent] = js.native
  def updateAgentUserCapabilities(
    userCapabilities: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    poolId: scala.Double,
    agentId: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAgent] = js.native
  def updateDeploymentGroup(
    deploymentGroup: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroup,
    project: java.lang.String,
    deploymentGroupId: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentGroup] = js.native
  def updateDeploymentMachineGroup(
    machineGroup: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachineGroup,
    project: java.lang.String,
    machineGroupId: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachineGroup] = js.native
  def updateDeploymentMachineGroupMachines(
    deploymentMachines: js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachine],
    project: java.lang.String,
    machineGroupId: scala.Double
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachine]
  ] = js.native
  def updateDeploymentMachines(
    deploymentMachines: js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachine],
    project: java.lang.String,
    deploymentGroupId: scala.Double
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.DeploymentMachine]
  ] = js.native
  def updateSecureFile(
    secureFile: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFile,
    project: java.lang.String,
    secureFileId: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFile] = js.native
  def updateSecureFiles(
    secureFiles: js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFile],
    project: java.lang.String
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFile]] = js.native
  def updateServiceEndpoint(
    endpoint: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpoint,
    project: java.lang.String,
    endpointId: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpoint] = js.native
  def updateServiceEndpoints(
    endpoints: js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpoint],
    project: java.lang.String
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.ServiceEndpoint]] = js.native
  def updateTaskGroup(
    taskGroup: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskGroup,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskGroup] = js.native
  def updateTaskHubLicenseDetails(
    taskHubLicenseDetails: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskHubLicenseDetails,
    hubName: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskHubLicenseDetails] = js.native
  def updateVariableGroup(
    group: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.VariableGroup,
    project: java.lang.String,
    groupId: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.VariableGroup] = js.native
  def uploadSecureFile(
    customHeaders: js.Any,
    contentStream: nodeLib.NodeJSNs.ReadableStream,
    project: java.lang.String,
    name: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFile] = js.native
  def validateInputs(
    inputValidationRequest: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.InputValidationRequest
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.InputValidationRequest] = js.native
}

