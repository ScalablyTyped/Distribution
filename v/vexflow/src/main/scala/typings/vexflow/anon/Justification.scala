package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Justification extends js.Object {
  var justification: js.UndefOr[typings.vexflow.Vex.Flow.TextNote.Justification] = js.undefined
  var shift_x: js.UndefOr[Double] = js.undefined
  var shift_y: js.UndefOr[Double] = js.undefined
}

object Justification {
  @scala.inline
  def apply(
    justification: typings.vexflow.Vex.Flow.TextNote.Justification = null,
    shift_x: js.UndefOr[Double] = js.undefined,
    shift_y: js.UndefOr[Double] = js.undefined
  ): Justification = {
    val __obj = js.Dynamic.literal()
    if (justification != null) __obj.updateDynamic("justification")(justification.asInstanceOf[js.Any])
    if (!js.isUndefined(shift_x)) __obj.updateDynamic("shift_x")(shift_x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shift_y)) __obj.updateDynamic("shift_y")(shift_y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Justification]
  }
}

