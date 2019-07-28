package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import typings.vsoDashNodeDashApi.interfacesDistributedTaskCommonInterfacesMod.ProcessParameters
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
    val __obj = js.Dynamic.literal(badgeUrl = badgeUrl, conditions = conditions, demands = demands, deployPhases = deployPhases, deployStep = deployStep, environmentOptions = environmentOptions, executionPolicy = executionPolicy, id = id, name = name, owner = owner, postDeployApprovals = postDeployApprovals, postDeploymentGates = postDeploymentGates, preDeployApprovals = preDeployApprovals, preDeploymentGates = preDeploymentGates, processParameters = processParameters, properties = properties, queueId = queueId, rank = rank, retentionPolicy = retentionPolicy, runOptions = runOptions, schedules = schedules, variableGroups = variableGroups, variables = variables)
  
    __obj.asInstanceOf[ReleaseDefinitionEnvironment]
  }
}

