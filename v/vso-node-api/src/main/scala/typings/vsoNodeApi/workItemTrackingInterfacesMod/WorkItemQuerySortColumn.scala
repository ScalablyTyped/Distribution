package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemQuerySortColumn extends StObject {
  
  /**
    * The direction to sort by.
    */
  var descending: Boolean
  
  /**
    * A work item field.
    */
  var field: WorkItemFieldReference
}
object WorkItemQuerySortColumn {
  
  inline def apply(descending: Boolean, field: WorkItemFieldReference): WorkItemQuerySortColumn = {
    val __obj = js.Dynamic.literal(descending = descending.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemQuerySortColumn]
  }
  
  extension [Self <: WorkItemQuerySortColumn](x: Self) {
    
    inline def setDescending(value: Boolean): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    
    inline def setField(value: WorkItemFieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
