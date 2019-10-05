package typings.uiDashGrid.uiDashGridMod.grouping

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
    val __obj = js.Dynamic.literal(aggregation = aggregation, colName = colName, field = field)
  
    __obj.asInstanceOf[IGridTreeAggregations]
  }
}

