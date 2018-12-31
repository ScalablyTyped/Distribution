package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseEnvironmentCompletedEvent extends js.Object {
  var createdByName: java.lang.String
  var definitionId: scala.Double
  var definitionName: java.lang.String
  var environment: ReleaseEnvironment
  var environmentId: scala.Double
  var projectName: java.lang.String
  var reason: DeploymentReason
  var releaseCreatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var releaseLogsUri: java.lang.String
  var releaseName: java.lang.String
  var status: java.lang.String
  var title: java.lang.String
  var webAccessUri: java.lang.String
}

