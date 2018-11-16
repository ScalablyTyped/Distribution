package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.treeBaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridTreeBaseCustomAggregation[TEntity] extends js.Object {
  var finalizerFn: js.UndefOr[js.Function1[/* aggregation */ IGridTreeBaseAggregationObject, scala.Unit]] = js.native
  var label: java.lang.String = js.native
  def aggregationFn(aggregation: IGridTreeBaseAggregationObject, fieldValue: js.Any, numValue: scala.Double): scala.Unit = js.native
  def aggregationFn(
    aggregation: IGridTreeBaseAggregationObject,
    fieldValue: js.Any,
    numValue: scala.Double,
    row: uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity]
  ): scala.Unit = js.native
}

