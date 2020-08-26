package typings.umbraco.anon

import typings.umbraco.umbraco.resources.Direction
import typings.umbraco.umbraco.resources.OrderItemsBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  var filter: String = js.native
  var orderBy: OrderItemsBy = js.native
  var orderDirection: Direction = js.native
  var pageNumber: Double = js.native
  var pageSize: Double = js.native
}

object Filter {
  @scala.inline
  def apply(
    filter: String,
    orderBy: OrderItemsBy,
    orderDirection: Direction,
    pageNumber: Double,
    pageSize: Double
  ): Filter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any], orderDirection = orderDirection.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrderBy(value: OrderItemsBy): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrderDirection(value: Direction): Self = this.set("orderDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageNumber(value: Double): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
  }
  
}

