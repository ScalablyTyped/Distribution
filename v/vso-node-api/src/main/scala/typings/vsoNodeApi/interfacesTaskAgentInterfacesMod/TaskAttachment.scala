package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAttachment extends StObject {
  
  var _links: Any
  
  var createdOn: js.Date
  
  var lastChangedBy: String
  
  var lastChangedOn: js.Date
  
  var name: String
  
  var recordId: String
  
  var timelineId: String
  
  var `type`: String
}
object TaskAttachment {
  
  inline def apply(
    _links: Any,
    createdOn: js.Date,
    lastChangedBy: String,
    lastChangedOn: js.Date,
    name: String,
    recordId: String,
    timelineId: String,
    `type`: String
  ): TaskAttachment = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], lastChangedBy = lastChangedBy.asInstanceOf[js.Any], lastChangedOn = lastChangedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recordId = recordId.asInstanceOf[js.Any], timelineId = timelineId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAttachment]
  }
  
  extension [Self <: TaskAttachment](x: Self) {
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setLastChangedBy(value: String): Self = StObject.set(x, "lastChangedBy", value.asInstanceOf[js.Any])
    
    inline def setLastChangedOn(value: js.Date): Self = StObject.set(x, "lastChangedOn", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRecordId(value: String): Self = StObject.set(x, "recordId", value.asInstanceOf[js.Any])
    
    inline def setTimelineId(value: String): Self = StObject.set(x, "timelineId", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
