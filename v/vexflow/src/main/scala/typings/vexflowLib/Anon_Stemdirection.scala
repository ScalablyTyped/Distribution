package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stemdirection extends js.Object {
  var stem_direction: js.UndefOr[scala.Double] = js.undefined
  var stem_extension: js.UndefOr[scala.Double] = js.undefined
  var x_begin: js.UndefOr[scala.Double] = js.undefined
  var x_end: js.UndefOr[scala.Double] = js.undefined
  var y_bottom: js.UndefOr[scala.Double] = js.undefined
  var y_extend: js.UndefOr[scala.Double] = js.undefined
  var y_top: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Stemdirection {
  @scala.inline
  def apply(
    stem_direction: scala.Int | scala.Double = null,
    stem_extension: scala.Int | scala.Double = null,
    x_begin: scala.Int | scala.Double = null,
    x_end: scala.Int | scala.Double = null,
    y_bottom: scala.Int | scala.Double = null,
    y_extend: scala.Int | scala.Double = null,
    y_top: scala.Int | scala.Double = null
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

