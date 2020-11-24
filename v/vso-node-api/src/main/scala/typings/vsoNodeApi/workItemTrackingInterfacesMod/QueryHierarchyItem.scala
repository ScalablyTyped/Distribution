package typings.vsoNodeApi.workItemTrackingInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryHierarchyItem extends WorkItemTrackingResource {
  
  /**
    * The child query items inside a query folder.
    */
  var children: js.Array[QueryHierarchyItem] = js.native
  
  /**
    * The clauses for a flat query.
    */
  var clauses: WorkItemQueryClause = js.native
  
  /**
    * The columns of the query.
    */
  var columns: js.Array[WorkItemFieldReference] = js.native
  
  /**
    * The identity who created the query item.
    */
  var createdBy: IdentityReference = js.native
  
  /**
    * When the query item was created.
    */
  var createdDate: Date = js.native
  
  /**
    * The link query mode.
    */
  var filterOptions: LinkQueryMode = js.native
  
  /**
    * If this is a query folder, indicates if it contains any children.
    */
  var hasChildren: Boolean = js.native
  
  /**
    * The id of the query item.
    */
  var id: String = js.native
  
  /**
    * Indicates if this query item is deleted.
    */
  var isDeleted: Boolean = js.native
  
  /**
    * Indicates if this is a query folder or a query.
    */
  var isFolder: Boolean = js.native
  
  /**
    * Indicates if the WIQL of this query is invalid. This could be due to invalid syntax or a no longer valid area/iteration path.
    */
  var isInvalidSyntax: Boolean = js.native
  
  /**
    * Indicates if this query item is public or private.
    */
  var isPublic: Boolean = js.native
  
  /**
    * The identity who last ran the query.
    */
  var lastExecutedBy: IdentityReference = js.native
  
  /**
    * When the query was last run.
    */
  var lastExecutedDate: Date = js.native
  
  /**
    * The identity who last modified the query item.
    */
  var lastModifiedBy: IdentityReference = js.native
  
  /**
    * When the query item was last modified.
    */
  var lastModifiedDate: Date = js.native
  
  /**
    * The link query clause.
    */
  var linkClauses: WorkItemQueryClause = js.native
  
  /**
    * The name of the query item.
    */
  var name: String = js.native
  
  /**
    * The path of the query item.
    */
  var path: String = js.native
  
  /**
    * The recursion option for use in a tree query.
    */
  var queryRecursionOption: QueryRecursionOption = js.native
  
  /**
    * The type of query.
    */
  var queryType: QueryType = js.native
  
  /**
    * The sort columns of the query.
    */
  var sortColumns: js.Array[WorkItemQuerySortColumn] = js.native
  
  /**
    * The source clauses in a tree or one-hop link query.
    */
  var sourceClauses: WorkItemQueryClause = js.native
  
  /**
    * The target clauses in a tree or one-hop link query.
    */
  var targetClauses: WorkItemQueryClause = js.native
  
  /**
    * The WIQL text of the query
    */
  var wiql: String = js.native
}
object QueryHierarchyItem {
  
  @scala.inline
  def apply(
    _links: js.Any,
    children: js.Array[QueryHierarchyItem],
    clauses: WorkItemQueryClause,
    columns: js.Array[WorkItemFieldReference],
    createdBy: IdentityReference,
    createdDate: Date,
    filterOptions: LinkQueryMode,
    hasChildren: Boolean,
    id: String,
    isDeleted: Boolean,
    isFolder: Boolean,
    isInvalidSyntax: Boolean,
    isPublic: Boolean,
    lastExecutedBy: IdentityReference,
    lastExecutedDate: Date,
    lastModifiedBy: IdentityReference,
    lastModifiedDate: Date,
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
  implicit class QueryHierarchyItemOps[Self <: QueryHierarchyItem] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: QueryHierarchyItem*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[QueryHierarchyItem]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClauses(value: WorkItemQueryClause): Self = this.set("clauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: WorkItemFieldReference*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[WorkItemFieldReference]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: IdentityReference): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: Date): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOptions(value: LinkQueryMode): Self = this.set("filterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasChildren(value: Boolean): Self = this.set("hasChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = this.set("isDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFolder(value: Boolean): Self = this.set("isFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInvalidSyntax(value: Boolean): Self = this.set("isInvalidSyntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPublic(value: Boolean): Self = this.set("isPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastExecutedBy(value: IdentityReference): Self = this.set("lastExecutedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastExecutedDate(value: Date): Self = this.set("lastExecutedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedBy(value: IdentityReference): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkClauses(value: WorkItemQueryClause): Self = this.set("linkClauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryRecursionOption(value: QueryRecursionOption): Self = this.set("queryRecursionOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryType(value: QueryType): Self = this.set("queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortColumnsVarargs(value: WorkItemQuerySortColumn*): Self = this.set("sortColumns", js.Array(value :_*))
    
    @scala.inline
    def setSortColumns(value: js.Array[WorkItemQuerySortColumn]): Self = this.set("sortColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceClauses(value: WorkItemQueryClause): Self = this.set("sourceClauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetClauses(value: WorkItemQueryClause): Self = this.set("targetClauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWiql(value: String): Self = this.set("wiql", value.asInstanceOf[js.Any])
  }
}
