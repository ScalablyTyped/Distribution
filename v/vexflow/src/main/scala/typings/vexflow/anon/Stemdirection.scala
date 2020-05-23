package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stemdirection extends js.Object {
  var stem_direction: js.UndefOr[Double] = js.undefined
  var stem_extension: js.UndefOr[Double] = js.undefined
  var x_begin: js.UndefOr[Double] = js.undefined
  var x_end: js.UndefOr[Double] = js.undefined
  var y_bottom: js.UndefOr[Double] = js.undefined
  var y_extend: js.UndefOr[Double] = js.undefined
  var y_top: js.UndefOr[Double] = js.undefined
}

object Stemdirection {
  @scala.inline
  def apply(
    stem_direction: js.UndefOr[Double] = js.undefined,
    stem_extension: js.UndefOr[Double] = js.undefined,
    x_begin: js.UndefOr[Double] = js.undefined,
    x_end: js.UndefOr[Double] = js.undefined,
    y_bottom: js.UndefOr[Double] = js.undefined,
    y_extend: js.UndefOr[Double] = js.undefined,
    y_top: js.UndefOr[Double] = js.undefined
  ): Stemdirection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stem_direction)) __obj.updateDynamic("stem_direction")(stem_direction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stem_extension)) __obj.updateDynamic("stem_extension")(stem_extension.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x_begin)) __obj.updateDynamic("x_begin")(x_begin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x_end)) __obj.updateDynamic("x_end")(x_end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y_bottom)) __obj.updateDynamic("y_bottom")(y_bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y_extend)) __obj.updateDynamic("y_extend")(y_extend.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y_top)) __obj.updateDynamic("y_top")(y_top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stemdirection]
  }
}

