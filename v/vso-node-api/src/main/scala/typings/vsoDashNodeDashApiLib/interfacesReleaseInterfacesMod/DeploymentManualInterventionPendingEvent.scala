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
    val __obj = js.Dynamic.literal(deployment = deployment, emailRecipients = emailRecipients, environmentOwner = environmentOwner, manualIntervention = manualIntervention, project = project, release = release)
  
    __obj.asInstanceOf[DeploymentManualInterventionPendingEvent]
  }
}

