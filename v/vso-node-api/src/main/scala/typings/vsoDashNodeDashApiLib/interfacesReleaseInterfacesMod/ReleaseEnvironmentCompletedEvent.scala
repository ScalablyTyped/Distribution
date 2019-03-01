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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createdByName")(createdByName)
    __obj.updateDynamic("definitionId")(definitionId)
    __obj.updateDynamic("definitionName")(definitionName)
    __obj.updateDynamic("environment")(environment)
    __obj.updateDynamic("environmentId")(environmentId)
    __obj.updateDynamic("projectName")(projectName)
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("releaseCreatedBy")(releaseCreatedBy)
    __obj.updateDynamic("releaseLogsUri")(releaseLogsUri)
    __obj.updateDynamic("releaseName")(releaseName)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("webAccessUri")(webAccessUri)
    __obj.asInstanceOf[ReleaseEnvironmentCompletedEvent]
  }
}

