package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Justification extends js.Object {
  var justification: js.UndefOr[vexflowLib.VexNs.FlowNs.TextNoteNs.Justification] = js.undefined
  var shift_x: js.UndefOr[scala.Double] = js.undefined
  var shift_y: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Justification {
  @scala.inline
  def apply(
    justification: vexflowLib.VexNs.FlowNs.TextNoteNs.Justification = null,
    shift_x: scala.Int | scala.Double = null,
    shift_y: scala.Int | scala.Double = null
  ): Anon_Justification = {
    val __obj = js.Dynamic.literal()
    if (justification != null) __obj.updateDynamic("justification")(justification.asInstanceOf[js.Any])
    if (shift_x != null) __obj.updateDynamic("shift_x")(shift_x.asInstanceOf[js.Any])
    if (shift_y != null) __obj.updateDynamic("shift_y")(shift_y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Justification]
  }
}

