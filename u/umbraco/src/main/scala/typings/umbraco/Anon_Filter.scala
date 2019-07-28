package typings.umbraco

import typings.umbraco.umbracoNs.resourcesNs.Direction
import typings.umbraco.umbracoNs.resourcesNs.OrderItemsBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: String
  var orderBy: OrderItemsBy
  var orderDirection: Direction
  var pageNumber: Double
  var pageSize: Double
}

object Anon_Filter {
  @scala.inline
  def apply(
    filter: String,
    orderBy: OrderItemsBy,
    orderDirection: Direction,
    pageNumber: Double,
    pageSize: Double
  ): Anon_Filter = {
    val __obj = js.Dynamic.literal(filter = filter, orderBy = orderBy, orderDirection = orderDirection, pageNumber = pageNumber, pageSize = pageSize)
  
    __obj.asInstanceOf[Anon_Filter]
  }
}

