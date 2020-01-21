package typings.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDrawThreshold extends js.Object {
  var drawThreshold: js.UndefOr[Double] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var maxVisible: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object AnonDrawThreshold {
  @scala.inline
  def apply(
    drawThreshold: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    maxVisible: Int | Double = null,
    min: Int | Double = null
  ): AnonDrawThreshold = {
    val __obj = js.Dynamic.literal()
    if (drawThreshold != null) __obj.updateDynamic("drawThreshold")(drawThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxVisible != null) __obj.updateDynamic("maxVisible")(maxVisible.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDrawThreshold]
  }
}

