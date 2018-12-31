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

