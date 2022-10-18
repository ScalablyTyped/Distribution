package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import typings.vsoNodeApi.interfacesDistributedTaskCommonInterfacesMod.ProcessParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseEnvironment extends StObject {
  
  /**
    * Gets list of conditions.
    */
  var conditions: js.Array[ReleaseCondition]
  
  /**
    * Gets date on which it got created.
    */
  var createdOn: js.Date
  
  /**
    * Gets definition environment id.
    */
  var definitionEnvironmentId: Double
  
  /**
    * Gets demands.
    */
  var demands: js.Array[Any]
  
  /**
    * Gets list of deploy phases snapshot.
    */
  var deployPhasesSnapshot: js.Array[DeployPhase]
  
  /**
    * Gets deploy steps.
    */
  var deploySteps: js.Array[DeploymentAttempt]
  
  /**
    * Gets environment options.
    */
  var environmentOptions: EnvironmentOptions
  
  /**
    * Gets the unique identifier of this field.
    */
  var id: Double
  
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: js.Date
  
  /**
    * Gets name.
    */
  var name: String
  
  /**
    * Gets next scheduled UTC time.
    */
  var nextScheduledUtcTime: js.Date
  
  /**
    * Gets the identity who is owner for release environment.
    */
  var owner: IdentityRef
  
  /**
    * Gets list of post deploy approvals snapshot.
    */
  var postApprovalsSnapshot: ReleaseDefinitionApprovals
  
  /**
    * Gets list of post deploy approvals.
    */
  var postDeployApprovals: js.Array[ReleaseApproval]
  
  var postDeploymentGatesSnapshot: ReleaseDefinitionGatesStep
  
  /**
    * Gets list of pre deploy approvals snapshot.
    */
  var preApprovalsSnapshot: ReleaseDefinitionApprovals
  
  /**
    * Gets list of pre deploy approvals.
    */
  var preDeployApprovals: js.Array[ReleaseApproval]
  
  var preDeploymentGatesSnapshot: ReleaseDefinitionGatesStep
  
  /**
    * Gets process parameters.
    */
  var processParameters: ProcessParameters
  
  /**
    * Gets queue id.
    */
  var queueId: Double
  
  /**
    * Gets rank.
    */
  var rank: Double
  
  /**
    * Gets release reference which specifies the reference of the release to which this release environment is associated.
    */
  var release: ReleaseShallowReference
  
  /**
    * Gets the identity who created release.
    */
  var releaseCreatedBy: IdentityRef
  
  /**
    * Gets releaseDefinitionReference which specifies the reference of the release definition to which this release environment is associated.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference
  
  /**
    * Gets release description.
    */
  var releaseDescription: String
  
  /**
    * Gets release id.
    */
  var releaseId: Double
  
  /**
    * Gets schedule deployment time of release environment.
    */
  var scheduledDeploymentTime: js.Date
  
  /**
    * Gets list of schedules.
    */
  var schedules: js.Array[ReleaseSchedule]
  
  /**
    * Gets environment status.
    */
  var status: EnvironmentStatus
  
  /**
    * Gets time to deploy.
    */
  var timeToDeploy: Double
  
  /**
    * Gets trigger reason.
    */
  var triggerReason: String
  
  /**
    * Gets the list of variable groups.
    */
  var variableGroups: js.Array[VariableGroup]
  
  /**
    * Gets the dictionary of variables.
    */
  var variables: StringDictionary[ConfigurationVariableValue]
  
  /**
    * Gets list of workflow tasks.
    */
  var workflowTasks: js.Array[WorkflowTask]
}
object ReleaseEnvironment {
  
  inline def apply(
    conditions: js.Array[ReleaseCondition],
    createdOn: js.Date,
    definitionEnvironmentId: Double,
    demands: js.Array[Any],
    deployPhasesSnapshot: js.Array[DeployPhase],
    deploySteps: js.Array[DeploymentAttempt],
    environmentOptions: EnvironmentOptions,
    id: Double,
    modifiedOn: js.Date,
    name: String,
    nextScheduledUtcTime: js.Date,
    owner: IdentityRef,
    postApprovalsSnapshot: ReleaseDefinitionApprovals,
    postDeployApprovals: js.Array[ReleaseApproval],
    postDeploymentGatesSnapshot: ReleaseDefinitionGatesStep,
    preApprovalsSnapshot: ReleaseDefinitionApprovals,
    preDeployApprovals: js.Array[ReleaseApproval],
    preDeploymentGatesSnapshot: ReleaseDefinitionGatesStep,
    processParameters: ProcessParameters,
    queueId: Double,
    rank: Double,
    release: ReleaseShallowReference,
    releaseCreatedBy: IdentityRef,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseDescription: String,
    releaseId: Double,
    scheduledDeploymentTime: js.Date,
    schedules: js.Array[ReleaseSchedule],
    status: EnvironmentStatus,
    timeToDeploy: Double,
    triggerReason: String,
    variableGroups: js.Array[VariableGroup],
    variables: StringDictionary[ConfigurationVariableValue],
    workflowTasks: js.Array[WorkflowTask]
  ): ReleaseEnvironment = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], definitionEnvironmentId = definitionEnvironmentId.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], deployPhasesSnapshot = deployPhasesSnapshot.asInstanceOf[js.Any], deploySteps = deploySteps.asInstanceOf[js.Any], environmentOptions = environmentOptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextScheduledUtcTime = nextScheduledUtcTime.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], postApprovalsSnapshot = postApprovalsSnapshot.asInstanceOf[js.Any], postDeployApprovals = postDeployApprovals.asInstanceOf[js.Any], postDeploymentGatesSnapshot = postDeploymentGatesSnapshot.asInstanceOf[js.Any], preApprovalsSnapshot = preApprovalsSnapshot.asInstanceOf[js.Any], preDeployApprovals = preDeployApprovals.asInstanceOf[js.Any], preDeploymentGatesSnapshot = preDeploymentGatesSnapshot.asInstanceOf[js.Any], processParameters = processParameters.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseCreatedBy = releaseCreatedBy.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], releaseDescription = releaseDescription.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any], scheduledDeploymentTime = scheduledDeploymentTime.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timeToDeploy = timeToDeploy.asInstanceOf[js.Any], triggerReason = triggerReason.asInstanceOf[js.Any], variableGroups = variableGroups.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any], workflowTasks = workflowTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironment]
  }
  
  extension [Self <: ReleaseEnvironment](x: Self) {
    
    inline def setConditions(value: js.Array[ReleaseCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: ReleaseCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setDefinitionEnvironmentId(value: Double): Self = StObject.set(x, "definitionEnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setDemands(value: js.Array[Any]): Self = StObject.set(x, "demands", value.asInstanceOf[js.Any])
    
    inline def setDemandsVarargs(value: Any*): Self = StObject.set(x, "demands", js.Array(value*))
    
    inline def setDeployPhasesSnapshot(value: js.Array[DeployPhase]): Self = StObject.set(x, "deployPhasesSnapshot", value.asInstanceOf[js.Any])
    
    inline def setDeployPhasesSnapshotVarargs(value: DeployPhase*): Self = StObject.set(x, "deployPhasesSnapshot", js.Array(value*))
    
    inline def setDeploySteps(value: js.Array[DeploymentAttempt]): Self = StObject.set(x, "deploySteps", value.asInstanceOf[js.Any])
    
    inline def setDeployStepsVarargs(value: DeploymentAttempt*): Self = StObject.set(x, "deploySteps", js.Array(value*))
    
    inline def setEnvironmentOptions(value: EnvironmentOptions): Self = StObject.set(x, "environmentOptions", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setModifiedOn(value: js.Date): Self = StObject.set(x, "modifiedOn", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNextScheduledUtcTime(value: js.Date): Self = StObject.set(x, "nextScheduledUtcTime", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPostApprovalsSnapshot(value: ReleaseDefinitionApprovals): Self = StObject.set(x, "postApprovalsSnapshot", value.asInstanceOf[js.Any])
    
    inline def setPostDeployApprovals(value: js.Array[ReleaseApproval]): Self = StObject.set(x, "postDeployApprovals", value.asInstanceOf[js.Any])
    
    inline def setPostDeployApprovalsVarargs(value: ReleaseApproval*): Self = StObject.set(x, "postDeployApprovals", js.Array(value*))
    
    inline def setPostDeploymentGatesSnapshot(value: ReleaseDefinitionGatesStep): Self = StObject.set(x, "postDeploymentGatesSnapshot", value.asInstanceOf[js.Any])
    
    inline def setPreApprovalsSnapshot(value: ReleaseDefinitionApprovals): Self = StObject.set(x, "preApprovalsSnapshot", value.asInstanceOf[js.Any])
    
    inline def setPreDeployApprovals(value: js.Array[ReleaseApproval]): Self = StObject.set(x, "preDeployApprovals", value.asInstanceOf[js.Any])
    
    inline def setPreDeployApprovalsVarargs(value: ReleaseApproval*): Self = StObject.set(x, "preDeployApprovals", js.Array(value*))
    
    inline def setPreDeploymentGatesSnapshot(value: ReleaseDefinitionGatesStep): Self = StObject.set(x, "preDeploymentGatesSnapshot", value.asInstanceOf[js.Any])
    
    inline def setProcessParameters(value: ProcessParameters): Self = StObject.set(x, "processParameters", value.asInstanceOf[js.Any])
    
    inline def setQueueId(value: Double): Self = StObject.set(x, "queueId", value.asInstanceOf[js.Any])
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: ReleaseShallowReference): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseCreatedBy(value: IdentityRef): Self = StObject.set(x, "releaseCreatedBy", value.asInstanceOf[js.Any])
    
    inline def setReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = StObject.set(x, "releaseDefinition", value.asInstanceOf[js.Any])
    
    inline def setReleaseDescription(value: String): Self = StObject.set(x, "releaseDescription", value.asInstanceOf[js.Any])
    
    inline def setReleaseId(value: Double): Self = StObject.set(x, "releaseId", value.asInstanceOf[js.Any])
    
    inline def setScheduledDeploymentTime(value: js.Date): Self = StObject.set(x, "scheduledDeploymentTime", value.asInstanceOf[js.Any])
    
    inline def setSchedules(value: js.Array[ReleaseSchedule]): Self = StObject.set(x, "schedules", value.asInstanceOf[js.Any])
    
    inline def setSchedulesVarargs(value: ReleaseSchedule*): Self = StObject.set(x, "schedules", js.Array(value*))
    
    inline def setStatus(value: EnvironmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTimeToDeploy(value: Double): Self = StObject.set(x, "timeToDeploy", value.asInstanceOf[js.Any])
    
    inline def setTriggerReason(value: String): Self = StObject.set(x, "triggerReason", value.asInstanceOf[js.Any])
    
    inline def setVariableGroups(value: js.Array[VariableGroup]): Self = StObject.set(x, "variableGroups", value.asInstanceOf[js.Any])
    
    inline def setVariableGroupsVarargs(value: VariableGroup*): Self = StObject.set(x, "variableGroups", js.Array(value*))
    
    inline def setVariables(value: StringDictionary[ConfigurationVariableValue]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setWorkflowTasks(value: js.Array[WorkflowTask]): Self = StObject.set(x, "workflowTasks", value.asInstanceOf[js.Any])
    
    inline def setWorkflowTasksVarargs(value: WorkflowTask*): Self = StObject.set(x, "workflowTasks", js.Array(value*))
  }
}
