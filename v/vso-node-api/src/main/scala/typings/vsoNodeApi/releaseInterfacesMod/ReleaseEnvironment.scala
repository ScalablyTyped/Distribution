package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoNodeApi.distributedTaskCommonInterfacesMod.ProcessParameters
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], definitionEnvironmentId = definitionEnvironmentId.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], deployPhasesSnapshot = deployPhasesSnapshot.asInstanceOf[js.Any], deploySteps = deploySteps.asInstanceOf[js.Any], environmentOptions = environmentOptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextScheduledUtcTime = nextScheduledUtcTime.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], postApprovalsSnapshot = postApprovalsSnapshot.asInstanceOf[js.Any], postDeployApprovals = postDeployApprovals.asInstanceOf[js.Any], postDeploymentGatesSnapshot = postDeploymentGatesSnapshot.asInstanceOf[js.Any], preApprovalsSnapshot = preApprovalsSnapshot.asInstanceOf[js.Any], preDeployApprovals = preDeployApprovals.asInstanceOf[js.Any], preDeploymentGatesSnapshot = preDeploymentGatesSnapshot.asInstanceOf[js.Any], processParameters = processParameters.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseCreatedBy = releaseCreatedBy.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], releaseDescription = releaseDescription.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any], scheduledDeploymentTime = scheduledDeploymentTime.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timeToDeploy = timeToDeploy.asInstanceOf[js.Any], triggerReason = triggerReason.asInstanceOf[js.Any], variableGroups = variableGroups.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any], workflowTasks = workflowTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironment]
  }
}

