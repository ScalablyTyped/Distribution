package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import typings.vsoDashNodeDashApi.interfacesDistributedTaskCommonInterfacesMod.ProcessParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseEnvironment extends js.Object {
  /**
    * Gets list of conditions.
    */
  var conditions: js.Array[ReleaseCondition]
  /**
    * Gets date on which it got created.
    */
  var createdOn: Date
  /**
    * Gets definition environment id.
    */
  var definitionEnvironmentId: Double
  /**
    * Gets demands.
    */
  var demands: js.Array[_]
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
  var modifiedOn: Date
  /**
    * Gets name.
    */
  var name: String
  /**
    * Gets next scheduled UTC time.
    */
  var nextScheduledUtcTime: Date
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
  var scheduledDeploymentTime: Date
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
  @scala.inline
  def apply(
    conditions: js.Array[ReleaseCondition],
    createdOn: Date,
    definitionEnvironmentId: Double,
    demands: js.Array[_],
    deployPhasesSnapshot: js.Array[DeployPhase],
    deploySteps: js.Array[DeploymentAttempt],
    environmentOptions: EnvironmentOptions,
    id: Double,
    modifiedOn: Date,
    name: String,
    nextScheduledUtcTime: Date,
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
    scheduledDeploymentTime: Date,
    schedules: js.Array[ReleaseSchedule],
    status: EnvironmentStatus,
    timeToDeploy: Double,
    triggerReason: String,
    variableGroups: js.Array[VariableGroup],
    variables: StringDictionary[ConfigurationVariableValue],
    workflowTasks: js.Array[WorkflowTask]
  ): ReleaseEnvironment = {
    val __obj = js.Dynamic.literal(conditions = conditions, createdOn = createdOn, definitionEnvironmentId = definitionEnvironmentId, demands = demands, deployPhasesSnapshot = deployPhasesSnapshot, deploySteps = deploySteps, environmentOptions = environmentOptions, id = id, modifiedOn = modifiedOn, name = name, nextScheduledUtcTime = nextScheduledUtcTime, owner = owner, postApprovalsSnapshot = postApprovalsSnapshot, postDeployApprovals = postDeployApprovals, postDeploymentGatesSnapshot = postDeploymentGatesSnapshot, preApprovalsSnapshot = preApprovalsSnapshot, preDeployApprovals = preDeployApprovals, preDeploymentGatesSnapshot = preDeploymentGatesSnapshot, processParameters = processParameters, queueId = queueId, rank = rank, release = release, releaseCreatedBy = releaseCreatedBy, releaseDefinition = releaseDefinition, releaseDescription = releaseDescription, releaseId = releaseId, scheduledDeploymentTime = scheduledDeploymentTime, schedules = schedules, status = status, timeToDeploy = timeToDeploy, triggerReason = triggerReason, variableGroups = variableGroups, variables = variables, workflowTasks = workflowTasks)
  
    __obj.asInstanceOf[ReleaseEnvironment]
  }
}

