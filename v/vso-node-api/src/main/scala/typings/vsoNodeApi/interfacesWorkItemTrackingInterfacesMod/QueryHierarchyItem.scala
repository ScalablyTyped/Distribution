package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryHierarchyItem
  extends StObject
     with WorkItemTrackingResource {
  
  /**
    * The child query items inside a query folder.
    */
  var children: js.Array[QueryHierarchyItem]
  
  /**
    * The clauses for a flat query.
    */
  var clauses: WorkItemQueryClause
  
  /**
    * The columns of the query.
    */
  var columns: js.Array[WorkItemFieldReference]
  
  /**
    * The identity who created the query item.
    */
  var createdBy: IdentityReference
  
  /**
    * When the query item was created.
    */
  var createdDate: js.Date
  
  /**
    * The link query mode.
    */
  var filterOptions: LinkQueryMode
  
  /**
    * If this is a query folder, indicates if it contains any children.
    */
  var hasChildren: Boolean
  
  /**
    * The id of the query item.
    */
  var id: String
  
  /**
    * Indicates if this query item is deleted.
    */
  var isDeleted: Boolean
  
  /**
    * Indicates if this is a query folder or a query.
    */
  var isFolder: Boolean
  
  /**
    * Indicates if the WIQL of this query is invalid. This could be due to invalid syntax or a no longer valid area/iteration path.
    */
  var isInvalidSyntax: Boolean
  
  /**
    * Indicates if this query item is public or private.
    */
  var isPublic: Boolean
  
  /**
    * The identity who last ran the query.
    */
  var lastExecutedBy: IdentityReference
  
  /**
    * When the query was last run.
    */
  var lastExecutedDate: js.Date
  
  /**
    * The identity who last modified the query item.
    */
  var lastModifiedBy: IdentityReference
  
  /**
    * When the query item was last modified.
    */
  var lastModifiedDate: js.Date
  
  /**
    * The link query clause.
    */
  var linkClauses: WorkItemQueryClause
  
  /**
    * The name of the query item.
    */
  var name: String
  
  /**
    * The path of the query item.
    */
  var path: String
  
  /**
    * The recursion option for use in a tree query.
    */
  var queryRecursionOption: QueryRecursionOption
  
  /**
    * The type of query.
    */
  var queryType: QueryType
  
  /**
    * The sort columns of the query.
    */
  var sortColumns: js.Array[WorkItemQuerySortColumn]
  
  /**
    * The source clauses in a tree or one-hop link query.
    */
  var sourceClauses: WorkItemQueryClause
  
  /**
    * The target clauses in a tree or one-hop link query.
    */
  var targetClauses: WorkItemQueryClause
  
  /**
    * The WIQL text of the query
    */
  var wiql: String
}
object QueryHierarchyItem {
  
  inline def apply(
    _links: Any,
    children: js.Array[QueryHierarchyItem],
    clauses: WorkItemQueryClause,
    columns: js.Array[WorkItemFieldReference],
    createdBy: IdentityReference,
    createdDate: js.Date,
    filterOptions: LinkQueryMode,
    hasChildren: Boolean,
    id: String,
    isDeleted: Boolean,
    isFolder: Boolean,
    isInvalidSyntax: Boolean,
    isPublic: Boolean,
    lastExecutedBy: IdentityReference,
    lastExecutedDate: js.Date,
    lastModifiedBy: IdentityReference,
    lastModifiedDate: js.Date,
    linkClauses: WorkItemQueryClause,
    name: String,
    path: String,
    queryRecursionOption: QueryRecursionOption,
    queryType: QueryType,
    sortColumns: js.Array[WorkItemQuerySortColumn],
    sourceClauses: WorkItemQueryClause,
    targetClauses: WorkItemQueryClause,
    url: String,
    wiql: String
  ): QueryHierarchyItem = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], clauses = clauses.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], filterOptions = filterOptions.asInstanceOf[js.Any], hasChildren = hasChildren.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], isInvalidSyntax = isInvalidSyntax.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any], lastExecutedBy = lastExecutedBy.asInstanceOf[js.Any], lastExecutedDate = lastExecutedDate.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], linkClauses = linkClauses.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], queryRecursionOption = queryRecursionOption.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], sortColumns = sortColumns.asInstanceOf[js.Any], sourceClauses = sourceClauses.asInstanceOf[js.Any], targetClauses = targetClauses.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], wiql = wiql.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryHierarchyItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryHierarchyItem] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[QueryHierarchyItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: QueryHierarchyItem*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setClauses(value: WorkItemQueryClause): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
    
    inline def setColumns(value: js.Array[WorkItemFieldReference]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: WorkItemFieldReference*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCreatedBy(value: IdentityReference): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setFilterOptions(value: LinkQueryMode): Self = StObject.set(x, "filterOptions", value.asInstanceOf[js.Any])
    
    inline def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    inline def setIsFolder(value: Boolean): Self = StObject.set(x, "isFolder", value.asInstanceOf[js.Any])
    
    inline def setIsInvalidSyntax(value: Boolean): Self = StObject.set(x, "isInvalidSyntax", value.asInstanceOf[js.Any])
    
    inline def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
    
    inline def setLastExecutedBy(value: IdentityReference): Self = StObject.set(x, "lastExecutedBy", value.asInstanceOf[js.Any])
    
    inline def setLastExecutedDate(value: js.Date): Self = StObject.set(x, "lastExecutedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedBy(value: IdentityReference): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLinkClauses(value: WorkItemQueryClause): Self = StObject.set(x, "linkClauses", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQueryRecursionOption(value: QueryRecursionOption): Self = StObject.set(x, "queryRecursionOption", value.asInstanceOf[js.Any])
    
    inline def setQueryType(value: QueryType): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    inline def setSortColumns(value: js.Array[WorkItemQuerySortColumn]): Self = StObject.set(x, "sortColumns", value.asInstanceOf[js.Any])
    
    inline def setSortColumnsVarargs(value: WorkItemQuerySortColumn*): Self = StObject.set(x, "sortColumns", js.Array(value*))
    
    inline def setSourceClauses(value: WorkItemQueryClause): Self = StObject.set(x, "sourceClauses", value.asInstanceOf[js.Any])
    
    inline def setTargetClauses(value: WorkItemQueryClause): Self = StObject.set(x, "targetClauses", value.asInstanceOf[js.Any])
    
    inline def setWiql(value: String): Self = StObject.set(x, "wiql", value.asInstanceOf[js.Any])
  }
}
