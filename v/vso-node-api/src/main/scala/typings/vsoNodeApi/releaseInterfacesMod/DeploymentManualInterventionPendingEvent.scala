package typings.vsoNodeApi.releaseInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentManualInterventionPendingEvent extends js.Object {
  var deployment: Deployment = js.native
  var emailRecipients: js.Array[String] = js.native
  var environmentOwner: IdentityRef = js.native
  var manualIntervention: ManualIntervention = js.native
  var project: ProjectReference = js.native
  var release: Release = js.native
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
  @scala.inline
  implicit class DeploymentManualInterventionPendingEventOps[Self <: DeploymentManualInterventionPendingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeployment(value: Deployment): Self = this.set("deployment", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailRecipientsVarargs(value: String*): Self = this.set("emailRecipients", js.Array(value :_*))
    @scala.inline
    def setEmailRecipients(value: js.Array[String]): Self = this.set("emailRecipients", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentOwner(value: IdentityRef): Self = this.set("environmentOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def setManualIntervention(value: ManualIntervention): Self = this.set("manualIntervention", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: ProjectReference): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelease(value: Release): Self = this.set("release", value.asInstanceOf[js.Any])
  }
  
}

