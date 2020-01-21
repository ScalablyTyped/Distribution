package typings.uiGrid.mod.treeBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridTreeBaseAggregationObject extends js.Object {
  var count: Double
  var rendered: js.UndefOr[String] = js.undefined
  var sum: Double
  var value: Double
}

object IGridTreeBaseAggregationObject {
  @scala.inline
  def apply(count: Double, sum: Double, value: Double, rendered: String = null): IGridTreeBaseAggregationObject = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (rendered != null) __obj.updateDynamic("rendered")(rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridTreeBaseAggregationObject]
  }
}

