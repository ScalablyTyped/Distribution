package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeReleaseEvent extends StObject {
  
  var projectId: String = js.native
  
  var releaseId: Double = js.native
}
object RealtimeReleaseEvent {
  
  @scala.inline
  def apply(projectId: String, releaseId: Double): RealtimeReleaseEvent = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealtimeReleaseEvent]
  }
  
  @scala.inline
  implicit class RealtimeReleaseEventMutableBuilder[Self <: RealtimeReleaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseId(value: Double): Self = StObject.set(x, "releaseId", value.asInstanceOf[js.Any])
  }
}
