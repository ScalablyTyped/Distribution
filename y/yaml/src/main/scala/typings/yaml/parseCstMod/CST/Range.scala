package typings.yaml.parseCstMod.CST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var end: Double
  var origEnd: js.UndefOr[Double] = js.undefined
  var origStart: js.UndefOr[Double] = js.undefined
  var start: Double
  def isEmpty(): Boolean
}

object Range {
  @scala.inline
  def apply(
    end: Double,
    isEmpty: () => Boolean,
    start: Double,
    origEnd: js.UndefOr[Double] = js.undefined,
    origStart: js.UndefOr[Double] = js.undefined
  ): Range = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), start = start.asInstanceOf[js.Any])
    if (!js.isUndefined(origEnd)) __obj.updateDynamic("origEnd")(origEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(origStart)) __obj.updateDynamic("origStart")(origStart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

