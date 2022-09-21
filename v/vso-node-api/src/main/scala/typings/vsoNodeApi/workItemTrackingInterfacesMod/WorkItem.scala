package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItem
  extends StObject
     with WorkItemTrackingResource {
  
  /**
    * Map of field and values for the work item.
    */
  var fields: StringDictionary[Any]
  
  /**
    * The work item ID.
    */
  var id: Double
  
  /**
    * Relations of the work item.
    */
  var relations: js.Array[WorkItemRelation]
  
  /**
    * Revision number of the work item.
    */
  var rev: Double
}
object WorkItem {
  
  inline def apply(
    _links: Any,
    fields: StringDictionary[Any],
    id: Double,
    relations: js.Array[WorkItemRelation],
    rev: Double,
    url: String
  ): WorkItem = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItem]
  }
  
  extension [Self <: WorkItem](x: Self) {
    
    inline def setFields(value: StringDictionary[Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRelations(value: js.Array[WorkItemRelation]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    inline def setRelationsVarargs(value: WorkItemRelation*): Self = StObject.set(x, "relations", js.Array(value*))
    
    inline def setRev(value: Double): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
  }
}
