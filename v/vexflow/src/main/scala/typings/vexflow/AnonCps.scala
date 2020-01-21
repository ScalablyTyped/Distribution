package typings.vexflow

import typings.vexflow.Vex.Flow.Curve.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCps extends js.Object {
  var cps: js.UndefOr[js.Array[AnonX]] = js.undefined
  var invert: Boolean
  var position: Position
  var spacing: js.UndefOr[Double] = js.undefined
  var thickness: js.UndefOr[Double] = js.undefined
  var x_shift: js.UndefOr[Double] = js.undefined
  var y_shift: Double
}

object AnonCps {
  @scala.inline
  def apply(
    invert: Boolean,
    position: Position,
    y_shift: Double,
    cps: js.Array[AnonX] = null,
    spacing: Int | Double = null,
    thickness: Int | Double = null,
    x_shift: Int | Double = null
  ): AnonCps = {
    val __obj = js.Dynamic.literal(invert = invert.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    if (cps != null) __obj.updateDynamic("cps")(cps.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (x_shift != null) __obj.updateDynamic("x_shift")(x_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCps]
  }
}

