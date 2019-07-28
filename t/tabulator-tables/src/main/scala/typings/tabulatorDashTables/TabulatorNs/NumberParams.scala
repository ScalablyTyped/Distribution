package typings.tabulatorDashTables.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberParams extends _EditorParams {
  var max: js.UndefOr[Double] = js.undefined
  // range,number
  var min: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object NumberParams {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null, step: Int | Double = null): NumberParams = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberParams]
  }
}

