package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentManualInterventionPendingEvent extends js.Object {
  var deployment: Deployment
  var emailRecipients: js.Array[String]
  var environmentOwner: IdentityRef
  var manualIntervention: ManualIntervention
  var project: ProjectReference
  var release: Release
}

object DeploymentManualInterventionPendingEvent {
  @scala.inline
  def apply(
    deployment: Deployment,
    emailRecipients: js.Array[String],
    environmentOwner: IdentityRef,
    manualIntervention: ManualIntervention,
    project: ProjectReference,
    release: Release
  ): DeploymentManualInterventionPendingEvent = {
    val __obj = js.Dynamic.literal(deployment = deployment, emailRecipients = emailRecipients, environmentOwner = environmentOwner, manualIntervention = manualIntervention, project = project, release = release)
  
    __obj.asInstanceOf[DeploymentManualInterventionPendingEvent]
  }
}

