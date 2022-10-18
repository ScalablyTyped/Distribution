package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineRecordsUpdatedEvent
  extends StObject
     with RealtimeBuildEvent {
  
  var timelineRecords: js.Array[TimelineRecord]
}
object TimelineRecordsUpdatedEvent {
  
  inline def apply(buildId: Double, timelineRecords: js.Array[TimelineRecord]): TimelineRecordsUpdatedEvent = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], timelineRecords = timelineRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineRecordsUpdatedEvent]
  }
  
  extension [Self <: TimelineRecordsUpdatedEvent](x: Self) {
    
    inline def setTimelineRecords(value: js.Array[TimelineRecord]): Self = StObject.set(x, "timelineRecords", value.asInstanceOf[js.Any])
    
    inline def setTimelineRecordsVarargs(value: TimelineRecord*): Self = StObject.set(x, "timelineRecords", js.Array(value*))
  }
}
