package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DrawThreshold extends js.Object {
  var drawThreshold: js.UndefOr[scala.Double] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var maxVisible: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DrawThreshold {
  @scala.inline
  def apply(
    drawThreshold: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    maxVisible: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): Anon_DrawThreshold = {
    val __obj = js.Dynamic.literal()
    if (drawThreshold != null) __obj.updateDynamic("drawThreshold")(drawThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxVisible != null) __obj.updateDynamic("maxVisible")(maxVisible.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DrawThreshold]
  }
}

