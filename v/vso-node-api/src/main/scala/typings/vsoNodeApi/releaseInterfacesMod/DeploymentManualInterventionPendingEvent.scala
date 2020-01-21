package typings.vsoNodeApi.releaseInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(deployment = deployment.asInstanceOf[js.Any], emailRecipients = emailRecipients.asInstanceOf[js.Any], environmentOwner = environmentOwner.asInstanceOf[js.Any], manualIntervention = manualIntervention.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeploymentManualInterventionPendingEvent]
  }
}

