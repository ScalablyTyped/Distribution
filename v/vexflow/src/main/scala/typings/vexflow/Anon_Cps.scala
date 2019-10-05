package typings.vexflow

import typings.vexflow.Vex.Flow.Curve.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cps extends js.Object {
  var cps: js.UndefOr[js.Array[Anon_X]] = js.undefined
  var invert: Boolean
  var position: Position
  var spacing: js.UndefOr[Double] = js.undefined
  var thickness: js.UndefOr[Double] = js.undefined
  var x_shift: js.UndefOr[Double] = js.undefined
  var y_shift: Double
}

object Anon_Cps {
  @scala.inline
  def apply(
    invert: Boolean,
    position: Position,
    y_shift: Double,
    cps: js.Array[Anon_X] = null,
    spacing: Int | Double = null,
    thickness: Int | Double = null,
    x_shift: Int | Double = null
  ): Anon_Cps = {
    val __obj = js.Dynamic.literal(invert = invert, position = position, y_shift = y_shift)
    if (cps != null) __obj.updateDynamic("cps")(cps)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (x_shift != null) __obj.updateDynamic("x_shift")(x_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cps]
  }
}

