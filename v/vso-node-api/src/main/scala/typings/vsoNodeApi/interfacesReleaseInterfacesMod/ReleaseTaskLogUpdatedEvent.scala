package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseTaskLogUpdatedEvent
  extends StObject
     with RealtimeReleaseEvent {
  
  var environmentId: Double
  
  var lines: js.Array[String]
  
  var timelineRecordId: String
}
object ReleaseTaskLogUpdatedEvent {
  
  inline def apply(
    environmentId: Double,
    lines: js.Array[String],
    projectId: String,
    releaseId: Double,
    timelineRecordId: String
  ): ReleaseTaskLogUpdatedEvent = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any], timelineRecordId = timelineRecordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseTaskLogUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseTaskLogUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentId(value: Double): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setTimelineRecordId(value: String): Self = StObject.set(x, "timelineRecordId", value.asInstanceOf[js.Any])
  }
}
