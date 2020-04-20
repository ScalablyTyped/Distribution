package typings.vsoNodeApi.releaseInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(createdByName = createdByName.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], definitionName = definitionName.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], releaseCreatedBy = releaseCreatedBy.asInstanceOf[js.Any], releaseLogsUri = releaseLogsUri.asInstanceOf[js.Any], releaseName = releaseName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], webAccessUri = webAccessUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironmentCompletedEvent]
  }
}

