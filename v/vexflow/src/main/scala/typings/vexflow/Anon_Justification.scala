package typings.vexflow

import typings.vexflow.Vex.Flow.TextNote.Justification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Justification extends js.Object {
  var justification: js.UndefOr[Justification] = js.undefined
  var shift_x: js.UndefOr[Double] = js.undefined
  var shift_y: js.UndefOr[Double] = js.undefined
}

object Anon_Justification {
  @scala.inline
  def apply(justification: Justification = null, shift_x: Int | Double = null, shift_y: Int | Double = null): Anon_Justification = {
    val __obj = js.Dynamic.literal()
    if (justification != null) __obj.updateDynamic("justification")(justification.asInstanceOf[js.Any])
    if (shift_x != null) __obj.updateDynamic("shift_x")(shift_x.asInstanceOf[js.Any])
    if (shift_y != null) __obj.updateDynamic("shift_y")(shift_y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Justification]
  }
}

