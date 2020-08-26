package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.distributedTaskCommonInterfacesMod.ProcessParameters
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDefinitionEnvironment extends js.Object {
  var badgeUrl: String = js.native
  var conditions: js.Array[Condition] = js.native
  var demands: js.Array[_] = js.native
  var deployPhases: js.Array[DeployPhase] = js.native
  var deployStep: ReleaseDefinitionDeployStep = js.native
  var environmentOptions: EnvironmentOptions = js.native
  var executionPolicy: EnvironmentExecutionPolicy = js.native
  var id: Double = js.native
  var name: String = js.native
  var owner: IdentityRef = js.native
  var postDeployApprovals: ReleaseDefinitionApprovals = js.native
  var postDeploymentGates: ReleaseDefinitionGatesStep = js.native
  var preDeployApprovals: ReleaseDefinitionApprovals = js.native
  var preDeploymentGates: ReleaseDefinitionGatesStep = js.native
  var processParameters: ProcessParameters = js.native
  var properties: js.Any = js.native
  var queueId: Double = js.native
  var rank: Double = js.native
  var retentionPolicy: EnvironmentRetentionPolicy = js.native
  var runOptions: StringDictionary[String] = js.native
  var schedules: js.Array[ReleaseSchedule] = js.native
  var variableGroups: js.Array[Double] = js.native
  var variables: StringDictionary[ConfigurationVariableValue] = js.native
}

object ReleaseDefinitionEnvironment {
  @scala.inline
  def apply(
    badgeUrl: String,
    conditions: js.Array[Condition],
    demands: js.Array[_],
    deployPhases: js.Array[DeployPhase],
    deployStep: ReleaseDefinitionDeployStep,
    environmentOptions: EnvironmentOptions,
    executionPolicy: EnvironmentExecutionPolicy,
    id: Double,
    name: String,
    owner: IdentityRef,
    postDeployApprovals: ReleaseDefinitionApprovals,
    postDeploymentGates: ReleaseDefinitionGatesStep,
    preDeployApprovals: ReleaseDefinitionApprovals,
    preDeploymentGates: ReleaseDefinitionGatesStep,
    processParameters: ProcessParameters,
    properties: js.Any,
    queueId: Double,
    rank: Double,
    retentionPolicy: EnvironmentRetentionPolicy,
    runOptions: StringDictionary[String],
    schedules: js.Array[ReleaseSchedule],
    variableGroups: js.Array[Double],
    variables: StringDictionary[ConfigurationVariableValue]
  ): ReleaseDefinitionEnvironment = {
    val __obj = js.Dynamic.literal(badgeUrl = badgeUrl.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], deployPhases = deployPhases.asInstanceOf[js.Any], deployStep = deployStep.asInstanceOf[js.Any], environmentOptions = environmentOptions.asInstanceOf[js.Any], executionPolicy = executionPolicy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], postDeployApprovals = postDeployApprovals.asInstanceOf[js.Any], postDeploymentGates = postDeploymentGates.asInstanceOf[js.Any], preDeployApprovals = preDeployApprovals.asInstanceOf[js.Any], preDeploymentGates = preDeploymentGates.asInstanceOf[js.Any], processParameters = processParameters.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], retentionPolicy = retentionPolicy.asInstanceOf[js.Any], runOptions = runOptions.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], variableGroups = variableGroups.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionEnvironment]
  }
  @scala.inline
  implicit class ReleaseDefinitionEnvironmentOps[Self <: ReleaseDefinitionEnvironment] (val x: Self) extends AnyVal {
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
    def setBadgeUrl(value: String): Self = this.set("badgeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditionsVarargs(value: Condition*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[Condition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDemandsVarargs(value: js.Any*): Self = this.set("demands", js.Array(value :_*))
    @scala.inline
    def setDemands(value: js.Array[_]): Self = this.set("demands", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeployPhasesVarargs(value: DeployPhase*): Self = this.set("deployPhases", js.Array(value :_*))
    @scala.inline
    def setDeployPhases(value: js.Array[DeployPhase]): Self = this.set("deployPhases", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeployStep(value: ReleaseDefinitionDeployStep): Self = this.set("deployStep", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentOptions(value: EnvironmentOptions): Self = this.set("environmentOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionPolicy(value: EnvironmentExecutionPolicy): Self = this.set("executionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: IdentityRef): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostDeployApprovals(value: ReleaseDefinitionApprovals): Self = this.set("postDeployApprovals", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostDeploymentGates(value: ReleaseDefinitionGatesStep): Self = this.set("postDeploymentGates", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreDeployApprovals(value: ReleaseDefinitionApprovals): Self = this.set("preDeployApprovals", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreDeploymentGates(value: ReleaseDefinitionGatesStep): Self = this.set("preDeploymentGates", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessParameters(value: ProcessParameters): Self = this.set("processParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueId(value: Double): Self = this.set("queueId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetentionPolicy(value: EnvironmentRetentionPolicy): Self = this.set("retentionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunOptions(value: StringDictionary[String]): Self = this.set("runOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchedulesVarargs(value: ReleaseSchedule*): Self = this.set("schedules", js.Array(value :_*))
    @scala.inline
    def setSchedules(value: js.Array[ReleaseSchedule]): Self = this.set("schedules", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariableGroupsVarargs(value: Double*): Self = this.set("variableGroups", js.Array(value :_*))
    @scala.inline
    def setVariableGroups(value: js.Array[Double]): Self = this.set("variableGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: StringDictionary[ConfigurationVariableValue]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

