package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemUpdate
  extends StObject
     with WorkItemTrackingResource {
  
  /**
    * List of updates to fields.
    */
  var fields: StringDictionary[WorkItemFieldUpdate]
  
  /**
    * ID of update.
    */
  var id: Double
  
  /**
    * List of updates to relations.
    */
  var relations: WorkItemRelationUpdates
  
  /**
    * The revision number of work item update.
    */
  var rev: Double
  
  /**
    * Identity for the work item update.
    */
  var revisedBy: IdentityReference
  
  /**
    * The work item updates revision date.
    */
  var revisedDate: js.Date
  
  /**
    * The work item ID.
    */
  var workItemId: Double
}
object WorkItemUpdate {
  
  inline def apply(
    _links: Any,
    fields: StringDictionary[WorkItemFieldUpdate],
    id: Double,
    relations: WorkItemRelationUpdates,
    rev: Double,
    revisedBy: IdentityReference,
    revisedDate: js.Date,
    url: String,
    workItemId: Double
  ): WorkItemUpdate = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], revisedBy = revisedBy.asInstanceOf[js.Any], revisedDate = revisedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemId = workItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemUpdate]
  }
  
  extension [Self <: WorkItemUpdate](x: Self) {
    
    inline def setFields(value: StringDictionary[WorkItemFieldUpdate]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRelations(value: WorkItemRelationUpdates): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    inline def setRev(value: Double): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    inline def setRevisedBy(value: IdentityReference): Self = StObject.set(x, "revisedBy", value.asInstanceOf[js.Any])
    
    inline def setRevisedDate(value: js.Date): Self = StObject.set(x, "revisedDate", value.asInstanceOf[js.Any])
    
    inline def setWorkItemId(value: Double): Self = StObject.set(x, "workItemId", value.asInstanceOf[js.Any])
  }
}
