package typings.uiDashGrid.uiDashGridMod.treeBaseNs

import typings.uiDashGrid.uiDashGridMod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridTreeBaseCustomAggregation[TEntity] extends js.Object {
  var finalizerFn: js.UndefOr[js.Function1[/* aggregation */ IGridTreeBaseAggregationObject, Unit]] = js.native
  var label: String = js.native
  def aggregationFn(aggregation: IGridTreeBaseAggregationObject, fieldValue: js.Any, numValue: Double): Unit = js.native
  def aggregationFn(
    aggregation: IGridTreeBaseAggregationObject,
    fieldValue: js.Any,
    numValue: Double,
    row: IGridRowOf[TEntity]
  ): Unit = js.native
}

