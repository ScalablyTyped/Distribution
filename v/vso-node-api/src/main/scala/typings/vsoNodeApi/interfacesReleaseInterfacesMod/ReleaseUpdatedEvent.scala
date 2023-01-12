package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseUpdatedEvent
  extends StObject
     with RealtimeReleaseEvent {
  
  var release: Release
}
object ReleaseUpdatedEvent {
  
  inline def apply(projectId: String, release: Release, releaseId: Double): ReleaseUpdatedEvent = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setRelease(value: Release): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
