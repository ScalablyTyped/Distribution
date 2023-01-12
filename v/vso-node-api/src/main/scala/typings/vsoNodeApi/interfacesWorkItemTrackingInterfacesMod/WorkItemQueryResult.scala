package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemQueryResult extends StObject {
  
  /**
    * The date the query was run in the context of.
    */
  var asOf: js.Date
  
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
  
  inline def apply(
    asOf: js.Date,
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
  implicit open class MutableBuilder[Self <: WorkItemQueryResult] (val x: Self) extends AnyVal {
    
    inline def setAsOf(value: js.Date): Self = StObject.set(x, "asOf", value.asInstanceOf[js.Any])
    
    inline def setColumns(value: js.Array[WorkItemFieldReference]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: WorkItemFieldReference*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setQueryResultType(value: QueryResultType): Self = StObject.set(x, "queryResultType", value.asInstanceOf[js.Any])
    
    inline def setQueryType(value: QueryType): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    inline def setSortColumns(value: js.Array[WorkItemQuerySortColumn]): Self = StObject.set(x, "sortColumns", value.asInstanceOf[js.Any])
    
    inline def setSortColumnsVarargs(value: WorkItemQuerySortColumn*): Self = StObject.set(x, "sortColumns", js.Array(value*))
    
    inline def setWorkItemRelations(value: js.Array[WorkItemLink]): Self = StObject.set(x, "workItemRelations", value.asInstanceOf[js.Any])
    
    inline def setWorkItemRelationsVarargs(value: WorkItemLink*): Self = StObject.set(x, "workItemRelations", js.Array(value*))
    
    inline def setWorkItems(value: js.Array[WorkItemReference]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    inline def setWorkItemsVarargs(value: WorkItemReference*): Self = StObject.set(x, "workItems", js.Array(value*))
  }
}
