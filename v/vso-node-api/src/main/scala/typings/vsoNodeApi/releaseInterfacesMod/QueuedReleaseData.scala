package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueuedReleaseData extends StObject {
  
  var projectId: String
  
  var queuePosition: Double
  
  var releaseId: Double
}
object QueuedReleaseData {
  
  @scala.inline
  def apply(projectId: String, queuePosition: Double, releaseId: Double): QueuedReleaseData = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], queuePosition = queuePosition.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueuedReleaseData]
  }
  
  @scala.inline
  implicit class QueuedReleaseDataMutableBuilder[Self <: QueuedReleaseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuePosition(value: Double): Self = StObject.set(x, "queuePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseId(value: Double): Self = StObject.set(x, "releaseId", value.asInstanceOf[js.Any])
  }
}
