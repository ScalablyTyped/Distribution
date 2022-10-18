package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealtimeReleaseEvent extends StObject {
  
  var projectId: String
  
  var releaseId: Double
}
object RealtimeReleaseEvent {
  
  inline def apply(projectId: String, releaseId: Double): RealtimeReleaseEvent = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealtimeReleaseEvent]
  }
  
  extension [Self <: RealtimeReleaseEvent](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setReleaseId(value: Double): Self = StObject.set(x, "releaseId", value.asInstanceOf[js.Any])
  }
}
