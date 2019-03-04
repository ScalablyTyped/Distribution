package typings
package umbracoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: java.lang.String
  var orderBy: umbracoLib.umbracoNs.resourcesNs.OrderItemsBy
  var orderDirection: umbracoLib.umbracoNs.resourcesNs.Direction
  var pageNumber: scala.Double
  var pageSize: scala.Double
}

object Anon_Filter {
  @scala.inline
  def apply(
    filter: java.lang.String,
    orderBy: umbracoLib.umbracoNs.resourcesNs.OrderItemsBy,
    orderDirection: umbracoLib.umbracoNs.resourcesNs.Direction,
    pageNumber: scala.Double,
    pageSize: scala.Double
  ): Anon_Filter = {
    val __obj = js.Dynamic.literal(filter = filter, orderBy = orderBy, orderDirection = orderDirection, pageNumber = pageNumber, pageSize = pageSize)
  
    __obj.asInstanceOf[Anon_Filter]
  }
}

