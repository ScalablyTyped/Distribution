package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseEnvironmentCompletedEvent extends js.Object {
  var createdByName: String
  var definitionId: Double
  var definitionName: String
  var environment: ReleaseEnvironment
  var environmentId: Double
  var projectName: String
  var reason: DeploymentReason
  var releaseCreatedBy: IdentityRef
  var releaseLogsUri: String
  var releaseName: String
  var status: String
  var title: String
  var webAccessUri: String
}

object ReleaseEnvironmentCompletedEvent {
  @scala.inline
  def apply(
    createdByName: String,
    definitionId: Double,
    definitionName: String,
    environment: ReleaseEnvironment,
    environmentId: Double,
    projectName: String,
    reason: DeploymentReason,
    releaseCreatedBy: IdentityRef,
    releaseLogsUri: String,
    releaseName: String,
    status: String,
    title: String,
    webAccessUri: String
  ): ReleaseEnvironmentCompletedEvent = {
    val __obj = js.Dynamic.literal(createdByName = createdByName, definitionId = definitionId, definitionName = definitionName, environment = environment, environmentId = environmentId, projectName = projectName, reason = reason, releaseCreatedBy = releaseCreatedBy, releaseLogsUri = releaseLogsUri, releaseName = releaseName, status = status, title = title, webAccessUri = webAccessUri)
  
    __obj.asInstanceOf[ReleaseEnvironmentCompletedEvent]
  }
}

