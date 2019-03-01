package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentManualInterventionPendingEvent extends js.Object {
  var deployment: Deployment
  var emailRecipients: js.Array[java.lang.String]
  var environmentOwner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var manualIntervention: ManualIntervention
  var project: ProjectReference
  var release: Release
}

object DeploymentManualInterventionPendingEvent {
  @scala.inline
  def apply(
    deployment: Deployment,
    emailRecipients: js.Array[java.lang.String],
    environmentOwner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    manualIntervention: ManualIntervention,
    project: ProjectReference,
    release: Release
  ): DeploymentManualInterventionPendingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deployment")(deployment)
    __obj.updateDynamic("emailRecipients")(emailRecipients)
    __obj.updateDynamic("environmentOwner")(environmentOwner)
    __obj.updateDynamic("manualIntervention")(manualIntervention)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[DeploymentManualInterventionPendingEvent]
  }
}

