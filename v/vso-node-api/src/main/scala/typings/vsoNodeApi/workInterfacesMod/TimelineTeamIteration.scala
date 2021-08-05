package typings.vsoNodeApi.workInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineTeamIteration extends StObject {
  
  /**
    * The end date of the iteration
    */
  var finishDate: Date
  
  /**
    * The iteration name
    */
  var name: String
  
  /**
    * All the partially paged workitems in this iteration.
    */
  var partiallyPagedWorkItems: js.Array[js.Array[js.Any]]
  
  /**
    * The iteration path
    */
  var path: String
  
  /**
    * The start date of the iteration
    */
  var startDate: Date
  
  /**
    * The status of this iteration
    */
  var status: TimelineIterationStatus
  
  /**
    * The work items that have been paged in this iteration
    */
  var workItems: js.Array[js.Array[js.Any]]
}
object TimelineTeamIteration {
  
  inline def apply(
    finishDate: Date,
    name: String,
    partiallyPagedWorkItems: js.Array[js.Array[js.Any]],
    path: String,
    startDate: Date,
    status: TimelineIterationStatus,
    workItems: js.Array[js.Array[js.Any]]
  ): TimelineTeamIteration = {
    val __obj = js.Dynamic.literal(finishDate = finishDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partiallyPagedWorkItems = partiallyPagedWorkItems.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineTeamIteration]
  }
  
  extension [Self <: TimelineTeamIteration](x: Self) {
    
    inline def setFinishDate(value: Date): Self = StObject.set(x, "finishDate", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPartiallyPagedWorkItems(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "partiallyPagedWorkItems", value.asInstanceOf[js.Any])
    
    inline def setPartiallyPagedWorkItemsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "partiallyPagedWorkItems", js.Array(value :_*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: TimelineIterationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setWorkItems(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    inline def setWorkItemsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "workItems", js.Array(value :_*))
  }
}
