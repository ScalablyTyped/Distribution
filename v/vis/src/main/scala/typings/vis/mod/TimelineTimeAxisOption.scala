package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineTimeAxisOption extends js.Object {
  var scale: js.UndefOr[TimelineTimeAxisScaleType] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object TimelineTimeAxisOption {
  @scala.inline
  def apply(scale: TimelineTimeAxisScaleType = null, step: js.UndefOr[Double] = js.undefined): TimelineTimeAxisOption = {
    val __obj = js.Dynamic.literal()
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineTimeAxisOption]
  }
}

