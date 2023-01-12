package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentManualInterventionPendingEvent extends StObject {
  
  var deployment: Deployment
  
  var emailRecipients: js.Array[String]
  
  var environmentOwner: IdentityRef
  
  var manualIntervention: ManualIntervention
  
  var project: ProjectReference
  
  var release: Release
}
object DeploymentManualInterventionPendingEvent {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: DeploymentManualInterventionPendingEvent] (val x: Self) extends AnyVal {
    
    inline def setDeployment(value: Deployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setEmailRecipients(value: js.Array[String]): Self = StObject.set(x, "emailRecipients", value.asInstanceOf[js.Any])
    
    inline def setEmailRecipientsVarargs(value: String*): Self = StObject.set(x, "emailRecipients", js.Array(value*))
    
    inline def setEnvironmentOwner(value: IdentityRef): Self = StObject.set(x, "environmentOwner", value.asInstanceOf[js.Any])
    
    inline def setManualIntervention(value: ManualIntervention): Self = StObject.set(x, "manualIntervention", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: Release): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
