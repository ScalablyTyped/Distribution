package typings.vsoNodeApi.releaseInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentManualInterventionPendingEvent extends StObject {
  
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
  implicit class DeploymentManualInterventionPendingEventMutableBuilder[Self <: DeploymentManualInterventionPendingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployment(value: Deployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailRecipients(value: js.Array[String]): Self = StObject.set(x, "emailRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailRecipientsVarargs(value: String*): Self = StObject.set(x, "emailRecipients", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentOwner(value: IdentityRef): Self = StObject.set(x, "environmentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualIntervention(value: ManualIntervention): Self = StObject.set(x, "manualIntervention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: Release): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
