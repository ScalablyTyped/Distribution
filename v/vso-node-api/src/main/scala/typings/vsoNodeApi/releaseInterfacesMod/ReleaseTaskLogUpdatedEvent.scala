package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseTaskLogUpdatedEvent extends RealtimeReleaseEvent {
  
  var environmentId: Double = js.native
  
  var lines: js.Array[String] = js.native
  
  var timelineRecordId: String = js.native
}
object ReleaseTaskLogUpdatedEvent {
  
  @scala.inline
  def apply(
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
  implicit class ReleaseTaskLogUpdatedEventMutableBuilder[Self <: ReleaseTaskLogUpdatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentId(value: Double): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value :_*))
    
    @scala.inline
    def setTimelineRecordId(value: String): Self = StObject.set(x, "timelineRecordId", value.asInstanceOf[js.Any])
  }
}
