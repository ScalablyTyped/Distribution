package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseCreatedEvent extends StObject {
  
  var project: ProjectReference
  
  var release: Release
}
object ReleaseCreatedEvent {
  
  inline def apply(project: ProjectReference, release: Release): ReleaseCreatedEvent = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseCreatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseCreatedEvent] (val x: Self) extends AnyVal {
    
    inline def setProject(value: ProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: Release): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
