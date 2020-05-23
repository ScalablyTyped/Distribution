package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cps extends js.Object {
  var cps: js.UndefOr[js.Array[X]] = js.undefined
  var invert: Boolean
  var position: typings.vexflow.Vex.Flow.Curve.Position
  var spacing: js.UndefOr[Double] = js.undefined
  var thickness: js.UndefOr[Double] = js.undefined
  var x_shift: js.UndefOr[Double] = js.undefined
  var y_shift: Double
}

object Cps {
  @scala.inline
  def apply(
    invert: Boolean,
    position: typings.vexflow.Vex.Flow.Curve.Position,
    y_shift: Double,
    cps: js.Array[X] = null,
    spacing: js.UndefOr[Double] = js.undefined,
    thickness: js.UndefOr[Double] = js.undefined,
    x_shift: js.UndefOr[Double] = js.undefined
  ): Cps = {
    val __obj = js.Dynamic.literal(invert = invert.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    if (cps != null) __obj.updateDynamic("cps")(cps.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing)) __obj.updateDynamic("spacing")(spacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(thickness)) __obj.updateDynamic("thickness")(thickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x_shift)) __obj.updateDynamic("x_shift")(x_shift.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cps]
  }
}

