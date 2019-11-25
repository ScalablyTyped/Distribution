package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineTimeAxisOption extends js.Object {
  var scale: js.UndefOr[TimelineTimeAxisScaleType] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object TimelineTimeAxisOption {
  @scala.inline
  def apply(scale: TimelineTimeAxisScaleType = null, step: Int | Double = null): TimelineTimeAxisOption = {
    val __obj = js.Dynamic.literal()
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineTimeAxisOption]
  }
}

