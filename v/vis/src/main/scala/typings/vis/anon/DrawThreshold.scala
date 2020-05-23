package typings.vis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawThreshold extends js.Object {
  var drawThreshold: js.UndefOr[Double] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var maxVisible: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object DrawThreshold {
  @scala.inline
  def apply(
    drawThreshold: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    maxVisible: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined
  ): DrawThreshold = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drawThreshold)) __obj.updateDynamic("drawThreshold")(drawThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxVisible)) __obj.updateDynamic("maxVisible")(maxVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawThreshold]
  }
}

