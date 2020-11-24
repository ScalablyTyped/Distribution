package typings.vsoNodeApi.workItemTrackingInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemQueryResult extends js.Object {
  
  /**
    * The date the query was run in the context of.
    */
  var asOf: Date = js.native
  
  /**
    * The columns of the query.
    */
  var columns: js.Array[WorkItemFieldReference] = js.native
  
  /**
    * The result type
    */
  var queryResultType: QueryResultType = js.native
  
  /**
    * The type of the query
    */
  var queryType: QueryType = js.native
  
  /**
    * The sort columns of the query.
    */
  var sortColumns: js.Array[WorkItemQuerySortColumn] = js.native
  
  /**
    * The work item links returned by the query.
    */
  var workItemRelations: js.Array[WorkItemLink] = js.native
  
  /**
    * The work items returned by the query.
    */
  var workItems: js.Array[WorkItemReference] = js.native
}
object WorkItemQueryResult {
  
  @scala.inline
  def apply(
    asOf: Date,
    columns: js.Array[WorkItemFieldReference],
    queryResultType: QueryResultType,
    queryType: QueryType,
    sortColumns: js.Array[WorkItemQuerySortColumn],
    workItemRelations: js.Array[WorkItemLink],
    workItems: js.Array[WorkItemReference]
  ): WorkItemQueryResult = {
    val __obj = js.Dynamic.literal(asOf = asOf.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], queryResultType = queryResultType.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], sortColumns = sortColumns.asInstanceOf[js.Any], workItemRelations = workItemRelations.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemQueryResult]
  }
  
  @scala.inline
  implicit class WorkItemQueryResultOps[Self <: WorkItemQueryResult] (val x: Self) extends AnyVal {
    
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
    def setAsOf(value: Date): Self = this.set("asOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: WorkItemFieldReference*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[WorkItemFieldReference]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryResultType(value: QueryResultType): Self = this.set("queryResultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryType(value: QueryType): Self = this.set("queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortColumnsVarargs(value: WorkItemQuerySortColumn*): Self = this.set("sortColumns", js.Array(value :_*))
    
    @scala.inline
    def setSortColumns(value: js.Array[WorkItemQuerySortColumn]): Self = this.set("sortColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemRelationsVarargs(value: WorkItemLink*): Self = this.set("workItemRelations", js.Array(value :_*))
    
    @scala.inline
    def setWorkItemRelations(value: js.Array[WorkItemLink]): Self = this.set("workItemRelations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemsVarargs(value: WorkItemReference*): Self = this.set("workItems", js.Array(value :_*))
    
    @scala.inline
    def setWorkItems(value: js.Array[WorkItemReference]): Self = this.set("workItems", value.asInstanceOf[js.Any])
  }
}
