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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("orderBy")(orderBy)
    __obj.updateDynamic("orderDirection")(orderDirection)
    __obj.updateDynamic("pageNumber")(pageNumber)
    __obj.updateDynamic("pageSize")(pageSize)
    __obj.asInstanceOf[Anon_Filter]
  }
}

