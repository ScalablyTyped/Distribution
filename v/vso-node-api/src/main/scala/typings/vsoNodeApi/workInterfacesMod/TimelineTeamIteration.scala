package typings.vsoNodeApi.workInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineTeamIteration extends js.Object {
  
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
  implicit class TimelineTeamIterationOps[Self <: TimelineTeamIteration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFinishDate(value: Date): Self = this.set("finishDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartiallyPagedWorkItemsVarargs(value: js.Array[js.Any]*): Self = this.set("partiallyPagedWorkItems", js.Array(value :_*))
    
    @scala.inline
    def setPartiallyPagedWorkItems(value: js.Array[js.Array[_]]): Self = this.set("partiallyPagedWorkItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: TimelineIterationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemsVarargs(value: js.Array[js.Any]*): Self = this.set("workItems", js.Array(value :_*))
    
    @scala.inline
    def setWorkItems(value: js.Array[js.Array[_]]): Self = this.set("workItems", value.asInstanceOf[js.Any])
  }
}
