package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsoleLogEvent
  extends StObject
     with RealtimeBuildEvent {
  
  var lines: js.Array[String]
  
  var timelineId: String
  
  var timelineRecordId: String
}
object ConsoleLogEvent {
  
  inline def apply(buildId: Double, lines: js.Array[String], timelineId: String, timelineRecordId: String): ConsoleLogEvent = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], timelineId = timelineId.asInstanceOf[js.Any], timelineRecordId = timelineRecordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleLogEvent]
  }
  
  extension [Self <: ConsoleLogEvent](x: Self) {
    
    inline def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value :_*))
    
    inline def setTimelineId(value: String): Self = StObject.set(x, "timelineId", value.asInstanceOf[js.Any])
    
    inline def setTimelineRecordId(value: String): Self = StObject.set(x, "timelineRecordId", value.asInstanceOf[js.Any])
  }
}
