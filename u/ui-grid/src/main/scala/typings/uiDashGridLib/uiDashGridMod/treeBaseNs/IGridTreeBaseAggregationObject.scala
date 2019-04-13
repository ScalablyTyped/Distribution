package typings
package uiDashGridLib.uiDashGridMod.treeBaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridTreeBaseAggregationObject extends js.Object {
  var count: scala.Double
  var rendered: js.UndefOr[java.lang.String] = js.undefined
  var sum: scala.Double
  var value: scala.Double
}

object IGridTreeBaseAggregationObject {
  @scala.inline
  def apply(count: scala.Double, sum: scala.Double, value: scala.Double, rendered: java.lang.String = null): IGridTreeBaseAggregationObject = {
    val __obj = js.Dynamic.literal(count = count, sum = sum, value = value)
    if (rendered != null) __obj.updateDynamic("rendered")(rendered)
    __obj.asInstanceOf[IGridTreeBaseAggregationObject]
  }
}

