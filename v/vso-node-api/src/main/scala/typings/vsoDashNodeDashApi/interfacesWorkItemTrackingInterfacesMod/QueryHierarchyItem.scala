package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryHierarchyItem extends WorkItemTrackingResource {
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
  var createdDate: Date
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
  var lastExecutedDate: Date
  /**
    * The identity who last modified the query item.
    */
  var lastModifiedBy: IdentityReference
  /**
    * When the query item was last modified.
    */
  var lastModifiedDate: Date
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
    val __obj = js.Dynamic.literal(_links = _links, children = children, clauses = clauses, columns = columns, createdBy = createdBy, createdDate = createdDate, filterOptions = filterOptions, hasChildren = hasChildren, id = id, isDeleted = isDeleted, isFolder = isFolder, isInvalidSyntax = isInvalidSyntax, isPublic = isPublic, lastExecutedBy = lastExecutedBy, lastExecutedDate = lastExecutedDate, lastModifiedBy = lastModifiedBy, lastModifiedDate = lastModifiedDate, linkClauses = linkClauses, name = name, path = path, queryRecursionOption = queryRecursionOption, queryType = queryType, sortColumns = sortColumns, sourceClauses = sourceClauses, targetClauses = targetClauses, url = url, wiql = wiql)
  
    __obj.asInstanceOf[QueryHierarchyItem]
  }
}

