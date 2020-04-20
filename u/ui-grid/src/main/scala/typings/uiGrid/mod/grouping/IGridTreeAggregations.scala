package typings.uiGrid.mod.grouping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridTreeAggregations extends js.Object {
  var aggregation: String
  var colName: String
  var field: String
}

object IGridTreeAggregations {
  @scala.inline
  def apply(aggregation: String, colName: String, field: String): IGridTreeAggregations = {
    val __obj = js.Dynamic.literal(aggregation = aggregation.asInstanceOf[js.Any], colName = colName.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridTreeAggregations]
  }
}

