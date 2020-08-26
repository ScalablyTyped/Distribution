package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryFilter extends js.Object {
  /**
    * The filter values define the set of values in this query. They are applied based on the QueryFilterType.
    */
  var criteria: js.Array[FilterCriteria] = js.native
  /**
    * The PagingDirection is applied to a paging token if one exists. If not the direction is ignored, and Forward from the start of the resultset is used. Direction should be left out of the request unless a paging token is used to help prevent future issues.
    */
  var direction: PagingDirection = js.native
  /**
    * The page number requested by the user. If not provided 1 is assumed by default.
    */
  var pageNumber: Double = js.native
  /**
    * The page size defines the number of results the caller wants for this filter. The count can't exceed the overall query size limits.
    */
  var pageSize: Double = js.native
  /**
    * The paging token is a distinct type of filter and the other filter fields are ignored. The paging token represents the continuation of a previously executed query. The information about where in the result and what fields are being filtered are embeded in the token.
    */
  var pagingToken: String = js.native
  /**
    * Defines the type of sorting to be applied on the results. The page slice is cut of the sorted results only.
    */
  var sortBy: Double = js.native
  /**
    * Defines the order of sorting, 1 for Ascending, 2 for Descending, else default ordering based on the SortBy value
    */
  var sortOrder: Double = js.native
}

object QueryFilter {
  @scala.inline
  def apply(
    criteria: js.Array[FilterCriteria],
    direction: PagingDirection,
    pageNumber: Double,
    pageSize: Double,
    pagingToken: String,
    sortBy: Double,
    sortOrder: Double
  ): QueryFilter = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pagingToken = pagingToken.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFilter]
  }
  @scala.inline
  implicit class QueryFilterOps[Self <: QueryFilter] (val x: Self) extends AnyVal {
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
    def setCriteriaVarargs(value: FilterCriteria*): Self = this.set("criteria", js.Array(value :_*))
    @scala.inline
    def setCriteria(value: js.Array[FilterCriteria]): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: PagingDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageNumber(value: Double): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagingToken(value: String): Self = this.set("pagingToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortBy(value: Double): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortOrder(value: Double): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
  }
  
}

