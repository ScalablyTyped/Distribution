package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.distributedTaskCommonInterfacesMod.ProcessParameters
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionEnvironment extends js.Object {
  var badgeUrl: String
  var conditions: js.Array[Condition]
  var demands: js.Array[_]
  var deployPhases: js.Array[DeployPhase]
  var deployStep: ReleaseDefinitionDeployStep
  var environmentOptions: EnvironmentOptions
  var executionPolicy: EnvironmentExecutionPolicy
  var id: Double
  var name: String
  var owner: IdentityRef
  var postDeployApprovals: ReleaseDefinitionApprovals
  var postDeploymentGates: ReleaseDefinitionGatesStep
  var preDeployApprovals: ReleaseDefinitionApprovals
  var preDeploymentGates: ReleaseDefinitionGatesStep
  var processParameters: ProcessParameters
  var properties: js.Any
  var queueId: Double
  var rank: Double
  var retentionPolicy: EnvironmentRetentionPolicy
  var runOptions: StringDictionary[String]
  var schedules: js.Array[ReleaseSchedule]
  var variableGroups: js.Array[Double]
  var variables: StringDictionary[ConfigurationVariableValue]
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
}

