package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentApprovalCompletedEvent extends StObject {
  
  var approval: ReleaseApproval
  
  var project: ProjectReference
  
  var release: Release
}
object DeploymentApprovalCompletedEvent {
  
  inline def apply(approval: ReleaseApproval, project: ProjectReference, release: Release): DeploymentApprovalCompletedEvent = {
    val __obj = js.Dynamic.literal(approval = approval.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentApprovalCompletedEvent]
  }
  
  extension [Self <: DeploymentApprovalCompletedEvent](x: Self) {
    
    inline def setApproval(value: ReleaseApproval): Self = StObject.set(x, "approval", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: Release): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
