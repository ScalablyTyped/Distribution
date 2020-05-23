package typings.uifabricUtilities.pointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var left: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
  /** @deprecated Use `left` instead */
  var x: js.UndefOr[Double] = js.undefined
  /** @deprecated Use `top` instead */
  var y: js.UndefOr[Double] = js.undefined
}

object Point {
  @scala.inline
  def apply(
    left: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): Point = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

