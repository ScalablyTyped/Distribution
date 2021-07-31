package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineRecordsUpdatedEvent
  extends StObject
     with RealtimeBuildEvent {
  
  var timelineRecords: js.Array[TimelineRecord]
}
object TimelineRecordsUpdatedEvent {
  
  @scala.inline
  def apply(buildId: Double, timelineRecords: js.Array[TimelineRecord]): TimelineRecordsUpdatedEvent = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], timelineRecords = timelineRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineRecordsUpdatedEvent]
  }
  
  @scala.inline
  implicit class TimelineRecordsUpdatedEventMutableBuilder[Self <: TimelineRecordsUpdatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimelineRecords(value: js.Array[TimelineRecord]): Self = StObject.set(x, "timelineRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineRecordsVarargs(value: TimelineRecord*): Self = StObject.set(x, "timelineRecords", js.Array(value :_*))
  }
}
