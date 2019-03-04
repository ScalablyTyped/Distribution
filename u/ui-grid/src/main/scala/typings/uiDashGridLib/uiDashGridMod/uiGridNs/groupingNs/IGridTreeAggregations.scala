package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.groupingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridTreeAggregations extends js.Object {
  var aggregation: java.lang.String
  var colName: java.lang.String
  var field: java.lang.String
}

object IGridTreeAggregations {
  @scala.inline
  def apply(aggregation: java.lang.String, colName: java.lang.String, field: java.lang.String): IGridTreeAggregations = {
    val __obj = js.Dynamic.literal(aggregation = aggregation, colName = colName, field = field)
  
    __obj.asInstanceOf[IGridTreeAggregations]
  }
}

