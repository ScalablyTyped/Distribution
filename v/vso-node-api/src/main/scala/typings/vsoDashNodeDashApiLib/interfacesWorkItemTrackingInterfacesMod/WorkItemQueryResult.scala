package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemQueryResult extends js.Object {
  /**
    * The date the query was run in the context of.
    */
  var asOf: stdLib.Date
  /**
    * The columns of the query.
    */
  var columns: js.Array[WorkItemFieldReference]
  /**
    * The result type
    */
  var queryResultType: QueryResultType
  /**
    * The type of the query
    */
  var queryType: QueryType
  /**
    * The sort columns of the query.
    */
  var sortColumns: js.Array[WorkItemQuerySortColumn]
  /**
    * The work item links returned by the query.
    */
  var workItemRelations: js.Array[WorkItemLink]
  /**
    * The work items returned by the query.
    */
  var workItems: js.Array[WorkItemReference]
}

object WorkItemQueryResult {
  @scala.inline
  def apply(
    asOf: stdLib.Date,
    columns: js.Array[WorkItemFieldReference],
    queryResultType: QueryResultType,
    queryType: QueryType,
    sortColumns: js.Array[WorkItemQuerySortColumn],
    workItemRelations: js.Array[WorkItemLink],
    workItems: js.Array[WorkItemReference]
  ): WorkItemQueryResult = {
    val __obj = js.Dynamic.literal(asOf = asOf, columns = columns, queryResultType = queryResultType, queryType = queryType, sortColumns = sortColumns, workItemRelations = workItemRelations, workItems = workItems)
  
    __obj.asInstanceOf[WorkItemQueryResult]
  }
}

