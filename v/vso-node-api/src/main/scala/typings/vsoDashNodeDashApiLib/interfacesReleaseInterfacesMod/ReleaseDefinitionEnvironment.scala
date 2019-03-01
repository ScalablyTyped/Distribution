package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionEnvironment extends js.Object {
  var badgeUrl: java.lang.String
  var conditions: js.Array[Condition]
  var demands: js.Array[_]
  var deployPhases: js.Array[DeployPhase]
  var deployStep: ReleaseDefinitionDeployStep
  var environmentOptions: EnvironmentOptions
  var executionPolicy: EnvironmentExecutionPolicy
  var id: scala.Double
  var name: java.lang.String
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var postDeployApprovals: ReleaseDefinitionApprovals
  var postDeploymentGates: ReleaseDefinitionGatesStep
  var preDeployApprovals: ReleaseDefinitionApprovals
  var preDeploymentGates: ReleaseDefinitionGatesStep
  var processParameters: vsoDashNodeDashApiLib.interfacesDistributedTaskCommonInterfacesMod.ProcessParameters
  var properties: js.Any
  var queueId: scala.Double
  var rank: scala.Double
  var retentionPolicy: EnvironmentRetentionPolicy
  var runOptions: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var schedules: js.Array[ReleaseSchedule]
  var variableGroups: js.Array[scala.Double]
  var variables: org.scalablytyped.runtime.StringDictionary[ConfigurationVariableValue]
}

object ReleaseDefinitionEnvironment {
  @scala.inline
  def apply(
    badgeUrl: java.lang.String,
    conditions: js.Array[Condition],
    demands: js.Array[_],
    deployPhases: js.Array[DeployPhase],
    deployStep: ReleaseDefinitionDeployStep,
    environmentOptions: EnvironmentOptions,
    executionPolicy: EnvironmentExecutionPolicy,
    id: scala.Double,
    name: java.lang.String,
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    postDeployApprovals: ReleaseDefinitionApprovals,
    postDeploymentGates: ReleaseDefinitionGatesStep,
    preDeployApprovals: ReleaseDefinitionApprovals,
    preDeploymentGates: ReleaseDefinitionGatesStep,
    processParameters: vsoDashNodeDashApiLib.interfacesDistributedTaskCommonInterfacesMod.ProcessParameters,
    properties: js.Any,
    queueId: scala.Double,
    rank: scala.Double,
    retentionPolicy: EnvironmentRetentionPolicy,
    runOptions: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    schedules: js.Array[ReleaseSchedule],
    variableGroups: js.Array[scala.Double],
    variables: org.scalablytyped.runtime.StringDictionary[ConfigurationVariableValue]
  ): ReleaseDefinitionEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("badgeUrl")(badgeUrl)
    __obj.updateDynamic("conditions")(conditions)
    __obj.updateDynamic("demands")(demands)
    __obj.updateDynamic("deployPhases")(deployPhases)
    __obj.updateDynamic("deployStep")(deployStep)
    __obj.updateDynamic("environmentOptions")(environmentOptions)
    __obj.updateDynamic("executionPolicy")(executionPolicy)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("postDeployApprovals")(postDeployApprovals)
    __obj.updateDynamic("postDeploymentGates")(postDeploymentGates)
    __obj.updateDynamic("preDeployApprovals")(preDeployApprovals)
    __obj.updateDynamic("preDeploymentGates")(preDeploymentGates)
    __obj.updateDynamic("processParameters")(processParameters)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("queueId")(queueId)
    __obj.updateDynamic("rank")(rank)
    __obj.updateDynamic("retentionPolicy")(retentionPolicy)
    __obj.updateDynamic("runOptions")(runOptions)
    __obj.updateDynamic("schedules")(schedules)
    __obj.updateDynamic("variableGroups")(variableGroups)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[ReleaseDefinitionEnvironment]
  }
}

