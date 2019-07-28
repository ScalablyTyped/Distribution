package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stemdirection extends js.Object {
  var stem_direction: js.UndefOr[Double] = js.undefined
  var stem_extension: js.UndefOr[Double] = js.undefined
  var x_begin: js.UndefOr[Double] = js.undefined
  var x_end: js.UndefOr[Double] = js.undefined
  var y_bottom: js.UndefOr[Double] = js.undefined
  var y_extend: js.UndefOr[Double] = js.undefined
  var y_top: js.UndefOr[Double] = js.undefined
}

object Anon_Stemdirection {
  @scala.inline
  def apply(
    stem_direction: Int | Double = null,
    stem_extension: Int | Double = null,
    x_begin: Int | Double = null,
    x_end: Int | Double = null,
    y_bottom: Int | Double = null,
    y_extend: Int | Double = null,
    y_top: Int | Double = null
  ): Anon_Stemdirection = {
    val __obj = js.Dynamic.literal()
    if (stem_direction != null) __obj.updateDynamic("stem_direction")(stem_direction.asInstanceOf[js.Any])
    if (stem_extension != null) __obj.updateDynamic("stem_extension")(stem_extension.asInstanceOf[js.Any])
    if (x_begin != null) __obj.updateDynamic("x_begin")(x_begin.asInstanceOf[js.Any])
    if (x_end != null) __obj.updateDynamic("x_end")(x_end.asInstanceOf[js.Any])
    if (y_bottom != null) __obj.updateDynamic("y_bottom")(y_bottom.asInstanceOf[js.Any])
    if (y_extend != null) __obj.updateDynamic("y_extend")(y_extend.asInstanceOf[js.Any])
    if (y_top != null) __obj.updateDynamic("y_top")(y_top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Stemdirection]
  }
}

