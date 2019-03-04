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

object ReleaseEnvironmentCompletedEvent {
  @scala.inline
  def apply(
    createdByName: java.lang.String,
    definitionId: scala.Double,
    definitionName: java.lang.String,
    environment: ReleaseEnvironment,
    environmentId: scala.Double,
    projectName: java.lang.String,
    reason: DeploymentReason,
    releaseCreatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    releaseLogsUri: java.lang.String,
    releaseName: java.lang.String,
    status: java.lang.String,
    title: java.lang.String,
    webAccessUri: java.lang.String
  ): ReleaseEnvironmentCompletedEvent = {
    val __obj = js.Dynamic.literal(createdByName = createdByName, definitionId = definitionId, definitionName = definitionName, environment = environment, environmentId = environmentId, projectName = projectName, reason = reason, releaseCreatedBy = releaseCreatedBy, releaseLogsUri = releaseLogsUri, releaseName = releaseName, status = status, title = title, webAccessUri = webAccessUri)
  
    __obj.asInstanceOf[ReleaseEnvironmentCompletedEvent]
  }
}

