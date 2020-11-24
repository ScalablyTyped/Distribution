package typings.uiGrid.mod.treeBase

import typings.uiGrid.mod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridTreeBaseCustomAggregation[TEntity] extends js.Object {
  
  def aggregationFn(aggregation: IGridTreeBaseAggregationObject, fieldValue: js.Any, numValue: Double): Unit = js.native
  def aggregationFn(
    aggregation: IGridTreeBaseAggregationObject,
    fieldValue: js.Any,
    numValue: Double,
    row: IGridRowOf[TEntity]
  ): Unit = js.native
  
  var finalizerFn: js.UndefOr[js.Function1[/* aggregation */ IGridTreeBaseAggregationObject, Unit]] = js.native
  
  var label: String = js.native
}
