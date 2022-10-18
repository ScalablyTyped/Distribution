package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timeline
  extends StObject
     with TimelineReference {
  
  /**
    * The process or person that last changed the timeline.
    */
  var lastChangedBy: String
  
  /**
    * The time the timeline was last changed.
    */
  var lastChangedOn: js.Date
  
  var records: js.Array[TimelineRecord]
}
object Timeline {
  
  inline def apply(
    changeId: Double,
    id: String,
    lastChangedBy: String,
    lastChangedOn: js.Date,
    records: js.Array[TimelineRecord],
    url: String
  ): Timeline = {
    val __obj = js.Dynamic.literal(changeId = changeId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastChangedBy = lastChangedBy.asInstanceOf[js.Any], lastChangedOn = lastChangedOn.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeline]
  }
  
  extension [Self <: Timeline](x: Self) {
    
    inline def setLastChangedBy(value: String): Self = StObject.set(x, "lastChangedBy", value.asInstanceOf[js.Any])
    
    inline def setLastChangedOn(value: js.Date): Self = StObject.set(x, "lastChangedOn", value.asInstanceOf[js.Any])
    
    inline def setRecords(value: js.Array[TimelineRecord]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRecordsVarargs(value: TimelineRecord*): Self = StObject.set(x, "records", js.Array(value*))
  }
}
