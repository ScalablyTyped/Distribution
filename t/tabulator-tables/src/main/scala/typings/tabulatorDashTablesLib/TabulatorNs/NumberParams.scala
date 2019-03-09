package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberParams extends _EditorParams {
  var max: js.UndefOr[scala.Double] = js.undefined
  // range,number
  var min: js.UndefOr[scala.Double] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
}

object NumberParams {
  @scala.inline
  def apply(
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null
  ): NumberParams = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberParams]
  }
}

