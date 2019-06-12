package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cps extends js.Object {
  var cps: js.UndefOr[js.Array[Anon_X]] = js.undefined
  var invert: scala.Boolean
  var position: vexflowLib.VexNs.FlowNs.CurveNs.Position
  var spacing: js.UndefOr[scala.Double] = js.undefined
  var thickness: js.UndefOr[scala.Double] = js.undefined
  var x_shift: js.UndefOr[scala.Double] = js.undefined
  var y_shift: scala.Double
}

object Anon_Cps {
  @scala.inline
  def apply(
    invert: scala.Boolean,
    position: vexflowLib.VexNs.FlowNs.CurveNs.Position,
    y_shift: scala.Double,
    cps: js.Array[Anon_X] = null,
    spacing: scala.Int | scala.Double = null,
    thickness: scala.Int | scala.Double = null,
    x_shift: scala.Int | scala.Double = null
  ): Anon_Cps = {
    val __obj = js.Dynamic.literal(invert = invert, position = position.asInstanceOf[js.Any], y_shift = y_shift)
    if (cps != null) __obj.updateDynamic("cps")(cps)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (x_shift != null) __obj.updateDynamic("x_shift")(x_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cps]
  }
}

