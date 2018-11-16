package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

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
  var createdDate: stdLib.Date
  /**
       * The link query mode.
       */
  var filterOptions: LinkQueryMode
  /**
       * If this is a query folder, indicates if it contains any children.
       */
  var hasChildren: scala.Boolean
  /**
       * The id of the query item.
       */
  var id: java.lang.String
  /**
       * Indicates if this query item is deleted.
       */
  var isDeleted: scala.Boolean
  /**
       * Indicates if this is a query folder or a query.
       */
  var isFolder: scala.Boolean
  /**
       * Indicates if the WIQL of this query is invalid. This could be due to invalid syntax or a no longer valid area/iteration path.
       */
  var isInvalidSyntax: scala.Boolean
  /**
       * Indicates if this query item is public or private.
       */
  var isPublic: scala.Boolean
  /**
       * The identity who last ran the query.
       */
  var lastExecutedBy: IdentityReference
  /**
       * When the query was last run.
       */
  var lastExecutedDate: stdLib.Date
  /**
       * The identity who last modified the query item.
       */
  var lastModifiedBy: IdentityReference
  /**
       * When the query item was last modified.
       */
  var lastModifiedDate: stdLib.Date
  /**
       * The link query clause.
       */
  var linkClauses: WorkItemQueryClause
  /**
       * The name of the query item.
       */
  var name: java.lang.String
  /**
       * The path of the query item.
       */
  var path: java.lang.String
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
  var wiql: java.lang.String
}

