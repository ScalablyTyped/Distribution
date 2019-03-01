package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineTimeAxisOption extends js.Object {
  var scale: js.UndefOr[TimelineTimeAxisScaleType] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
}

object TimelineTimeAxisOption {
  @scala.inline
  def apply(scale: TimelineTimeAxisScaleType = null, step: scala.Int | scala.Double = null): TimelineTimeAxisOption = {
    val __obj = js.Dynamic.literal()
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineTimeAxisOption]
  }
}

