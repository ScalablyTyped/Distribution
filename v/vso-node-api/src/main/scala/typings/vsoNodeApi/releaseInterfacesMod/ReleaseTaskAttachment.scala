package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseTaskAttachment extends StObject {
  
  var _links: js.Any
  
  var createdOn: Date
  
  var modifiedBy: String
  
  var modifiedOn: Date
  
  var name: String
  
  var recordId: String
  
  var timelineId: String
  
  var `type`: String
}
object ReleaseTaskAttachment {
  
  inline def apply(
    _links: js.Any,
    createdOn: Date,
    modifiedBy: String,
    modifiedOn: Date,
    name: String,
    recordId: String,
    timelineId: String,
    `type`: String
  ): ReleaseTaskAttachment = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recordId = recordId.asInstanceOf[js.Any], timelineId = timelineId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseTaskAttachment]
  }
  
  extension [Self <: ReleaseTaskAttachment](x: Self) {
    
    inline def setCreatedOn(value: Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setModifiedBy(value: String): Self = StObject.set(x, "modifiedBy", value.asInstanceOf[js.Any])
    
    inline def setModifiedOn(value: Date): Self = StObject.set(x, "modifiedOn", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRecordId(value: String): Self = StObject.set(x, "recordId", value.asInstanceOf[js.Any])
    
    inline def setTimelineId(value: String): Self = StObject.set(x, "timelineId", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
