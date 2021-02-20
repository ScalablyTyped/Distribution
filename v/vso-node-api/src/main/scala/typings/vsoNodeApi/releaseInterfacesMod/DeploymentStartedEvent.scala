package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentStartedEvent extends StObject {
  
  var environment: ReleaseEnvironment = js.native
  
  var project: ProjectReference = js.native
  
  var release: Release = js.native
}
object DeploymentStartedEvent {
  
  @scala.inline
  def apply(environment: ReleaseEnvironment, project: ProjectReference, release: Release): DeploymentStartedEvent = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentStartedEvent]
  }
  
  @scala.inline
  implicit class DeploymentStartedEventMutableBuilder[Self <: DeploymentStartedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: ReleaseEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: Release): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
