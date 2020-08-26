package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoNodeApi.distributedTaskCommonInterfacesMod.ProcessParameters
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseEnvironment extends js.Object {
  /**
    * Gets list of conditions.
    */
  var conditions: js.Array[ReleaseCondition] = js.native
  /**
    * Gets date on which it got created.
    */
  var createdOn: Date = js.native
  /**
    * Gets definition environment id.
    */
  var definitionEnvironmentId: Double = js.native
  /**
    * Gets demands.
    */
  var demands: js.Array[_] = js.native
  /**
    * Gets list of deploy phases snapshot.
    */
  var deployPhasesSnapshot: js.Array[DeployPhase] = js.native
  /**
    * Gets deploy steps.
    */
  var deploySteps: js.Array[DeploymentAttempt] = js.native
  /**
    * Gets environment options.
    */
  var environmentOptions: EnvironmentOptions = js.native
  /**
    * Gets the unique identifier of this field.
    */
  var id: Double = js.native
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: Date = js.native
  /**
    * Gets name.
    */
  var name: String = js.native
  /**
    * Gets next scheduled UTC time.
    */
  var nextScheduledUtcTime: Date = js.native
  /**
    * Gets the identity who is owner for release environment.
    */
  var owner: IdentityRef = js.native
  /**
    * Gets list of post deploy approvals snapshot.
    */
  var postApprovalsSnapshot: ReleaseDefinitionApprovals = js.native
  /**
    * Gets list of post deploy approvals.
    */
  var postDeployApprovals: js.Array[ReleaseApproval] = js.native
  var postDeploymentGatesSnapshot: ReleaseDefinitionGatesStep = js.native
  /**
    * Gets list of pre deploy approvals snapshot.
    */
  var preApprovalsSnapshot: ReleaseDefinitionApprovals = js.native
  /**
    * Gets list of pre deploy approvals.
    */
  var preDeployApprovals: js.Array[ReleaseApproval] = js.native
  var preDeploymentGatesSnapshot: ReleaseDefinitionGatesStep = js.native
  /**
    * Gets process parameters.
    */
  var processParameters: ProcessParameters = js.native
  /**
    * Gets queue id.
    */
  var queueId: Double = js.native
  /**
    * Gets rank.
    */
  var rank: Double = js.native
  /**
    * Gets release reference which specifies the reference of the release to which this release environment is associated.
    */
  var release: ReleaseShallowReference = js.native
  /**
    * Gets the identity who created release.
    */
  var releaseCreatedBy: IdentityRef = js.native
  /**
    * Gets releaseDefinitionReference which specifies the reference of the release definition to which this release environment is associated.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference = js.native
  /**
    * Gets release description.
    */
  var releaseDescription: String = js.native
  /**
    * Gets release id.
    */
  var releaseId: Double = js.native
  /**
    * Gets schedule deployment time of release environment.
    */
  var scheduledDeploymentTime: Date = js.native
  /**
    * Gets list of schedules.
    */
  var schedules: js.Array[ReleaseSchedule] = js.native
  /**
    * Gets environment status.
    */
  var status: EnvironmentStatus = js.native
  /**
    * Gets time to deploy.
    */
  var timeToDeploy: Double = js.native
  /**
    * Gets trigger reason.
    */
  var triggerReason: String = js.native
  /**
    * Gets the list of variable groups.
    */
  var variableGroups: js.Array[VariableGroup] = js.native
  /**
    * Gets the dictionary of variables.
    */
  var variables: StringDictionary[ConfigurationVariableValue] = js.native
  /**
    * Gets list of workflow tasks.
    */
  var workflowTasks: js.Array[WorkflowTask] = js.native
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
  @scala.inline
  implicit class ReleaseEnvironmentOps[Self <: ReleaseEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConditionsVarargs(value: ReleaseCondition*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[ReleaseCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedOn(value: Date): Self = this.set("createdOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinitionEnvironmentId(value: Double): Self = this.set("definitionEnvironmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDemandsVarargs(value: js.Any*): Self = this.set("demands", js.Array(value :_*))
    @scala.inline
    def setDemands(value: js.Array[_]): Self = this.set("demands", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeployPhasesSnapshotVarargs(value: DeployPhase*): Self = this.set("deployPhasesSnapshot", js.Array(value :_*))
    @scala.inline
    def setDeployPhasesSnapshot(value: js.Array[DeployPhase]): Self = this.set("deployPhasesSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeployStepsVarargs(value: DeploymentAttempt*): Self = this.set("deploySteps", js.Array(value :_*))
    @scala.inline
    def setDeploySteps(value: js.Array[DeploymentAttempt]): Self = this.set("deploySteps", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentOptions(value: EnvironmentOptions): Self = this.set("environmentOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedOn(value: Date): Self = this.set("modifiedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextScheduledUtcTime(value: Date): Self = this.set("nextScheduledUtcTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: IdentityRef): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostApprovalsSnapshot(value: ReleaseDefinitionApprovals): Self = this.set("postApprovalsSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostDeployApprovalsVarargs(value: ReleaseApproval*): Self = this.set("postDeployApprovals", js.Array(value :_*))
    @scala.inline
    def setPostDeployApprovals(value: js.Array[ReleaseApproval]): Self = this.set("postDeployApprovals", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostDeploymentGatesSnapshot(value: ReleaseDefinitionGatesStep): Self = this.set("postDeploymentGatesSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreApprovalsSnapshot(value: ReleaseDefinitionApprovals): Self = this.set("preApprovalsSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreDeployApprovalsVarargs(value: ReleaseApproval*): Self = this.set("preDeployApprovals", js.Array(value :_*))
    @scala.inline
    def setPreDeployApprovals(value: js.Array[ReleaseApproval]): Self = this.set("preDeployApprovals", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreDeploymentGatesSnapshot(value: ReleaseDefinitionGatesStep): Self = this.set("preDeploymentGatesSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessParameters(value: ProcessParameters): Self = this.set("processParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueId(value: Double): Self = this.set("queueId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelease(value: ReleaseShallowReference): Self = this.set("release", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseCreatedBy(value: IdentityRef): Self = this.set("releaseCreatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = this.set("releaseDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseDescription(value: String): Self = this.set("releaseDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseId(value: Double): Self = this.set("releaseId", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheduledDeploymentTime(value: Date): Self = this.set("scheduledDeploymentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchedulesVarargs(value: ReleaseSchedule*): Self = this.set("schedules", js.Array(value :_*))
    @scala.inline
    def setSchedules(value: js.Array[ReleaseSchedule]): Self = this.set("schedules", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: EnvironmentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeToDeploy(value: Double): Self = this.set("timeToDeploy", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerReason(value: String): Self = this.set("triggerReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariableGroupsVarargs(value: VariableGroup*): Self = this.set("variableGroups", js.Array(value :_*))
    @scala.inline
    def setVariableGroups(value: js.Array[VariableGroup]): Self = this.set("variableGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: StringDictionary[ConfigurationVariableValue]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflowTasksVarargs(value: WorkflowTask*): Self = this.set("workflowTasks", js.Array(value :_*))
    @scala.inline
    def setWorkflowTasks(value: js.Array[WorkflowTask]): Self = this.set("workflowTasks", value.asInstanceOf[js.Any])
  }
  
}

