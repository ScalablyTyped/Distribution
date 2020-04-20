package typings.umbraco

import typings.umbraco.umbraco.resources.Direction
import typings.umbraco.umbraco.resources.OrderItemsBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter extends js.Object {
  var filter: String
  var orderBy: OrderItemsBy
  var orderDirection: Direction
  var pageNumber: Double
  var pageSize: Double
}

object AnonFilter {
  @scala.inline
  def apply(
    filter: String,
    orderBy: OrderItemsBy,
    orderDirection: Direction,
    pageNumber: Double,
    pageSize: Double
  ): AnonFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any], orderDirection = orderDirection.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilter]
  }
}

