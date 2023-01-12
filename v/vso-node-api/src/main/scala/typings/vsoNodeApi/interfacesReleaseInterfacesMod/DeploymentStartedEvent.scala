package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentStartedEvent extends StObject {
  
  var environment: ReleaseEnvironment
  
  var project: ProjectReference
  
  var release: Release
}
object DeploymentStartedEvent {
  
  inline def apply(environment: ReleaseEnvironment, project: ProjectReference, release: Release): DeploymentStartedEvent = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentStartedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentStartedEvent] (val x: Self) extends AnyVal {
    
    inline def setEnvironment(value: ReleaseEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: Release): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
