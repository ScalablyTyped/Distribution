package typings.vsoNodeApi.workInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineTeamIteration extends StObject {
  
  /**
    * The end date of the iteration
    */
  var finishDate: Date = js.native
  
  /**
    * The iteration name
    */
  var name: String = js.native
  
  /**
    * All the partially paged workitems in this iteration.
    */
  var partiallyPagedWorkItems: js.Array[js.Array[_]] = js.native
  
  /**
    * The iteration path
    */
  var path: String = js.native
  
  /**
    * The start date of the iteration
    */
  var startDate: Date = js.native
  
  /**
    * The status of this iteration
    */
  var status: TimelineIterationStatus = js.native
  
  /**
    * The work items that have been paged in this iteration
    */
  var workItems: js.Array[js.Array[_]] = js.native
}
object TimelineTeamIteration {
  
  @scala.inline
  def apply(
    finishDate: Date,
    name: String,
    partiallyPagedWorkItems: js.Array[js.Array[_]],
    path: String,
    startDate: Date,
    status: TimelineIterationStatus,
    workItems: js.Array[js.Array[_]]
  ): TimelineTeamIteration = {
    val __obj = js.Dynamic.literal(finishDate = finishDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partiallyPagedWorkItems = partiallyPagedWorkItems.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineTeamIteration]
  }
  
  @scala.inline
  implicit class TimelineTeamIterationMutableBuilder[Self <: TimelineTeamIteration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinishDate(value: Date): Self = StObject.set(x, "finishDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartiallyPagedWorkItems(value: js.Array[js.Array[_]]): Self = StObject.set(x, "partiallyPagedWorkItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartiallyPagedWorkItemsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "partiallyPagedWorkItems", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: TimelineIterationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItems(value: js.Array[js.Array[_]]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "workItems", js.Array(value :_*))
  }
}
