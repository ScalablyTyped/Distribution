package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineTeamIteration extends StObject {
  
  /**
    * The end date of the iteration
    */
  var finishDate: js.Date
  
  /**
    * The iteration name
    */
  var name: String
  
  /**
    * All the partially paged workitems in this iteration.
    */
  var partiallyPagedWorkItems: js.Array[js.Array[Any]]
  
  /**
    * The iteration path
    */
  var path: String
  
  /**
    * The start date of the iteration
    */
  var startDate: js.Date
  
  /**
    * The status of this iteration
    */
  var status: TimelineIterationStatus
  
  /**
    * The work items that have been paged in this iteration
    */
  var workItems: js.Array[js.Array[Any]]
}
object TimelineTeamIteration {
  
  inline def apply(
    finishDate: js.Date,
    name: String,
    partiallyPagedWorkItems: js.Array[js.Array[Any]],
    path: String,
    startDate: js.Date,
    status: TimelineIterationStatus,
    workItems: js.Array[js.Array[Any]]
  ): TimelineTeamIteration = {
    val __obj = js.Dynamic.literal(finishDate = finishDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partiallyPagedWorkItems = partiallyPagedWorkItems.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineTeamIteration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimelineTeamIteration] (val x: Self) extends AnyVal {
    
    inline def setFinishDate(value: js.Date): Self = StObject.set(x, "finishDate", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPartiallyPagedWorkItems(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "partiallyPagedWorkItems", value.asInstanceOf[js.Any])
    
    inline def setPartiallyPagedWorkItemsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "partiallyPagedWorkItems", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: TimelineIterationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setWorkItems(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    inline def setWorkItemsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "workItems", js.Array(value*))
  }
}
