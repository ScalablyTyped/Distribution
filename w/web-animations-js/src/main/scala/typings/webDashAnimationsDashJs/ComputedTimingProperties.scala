package typings.webDashAnimationsDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedTimingProperties extends js.Object {
  var activeDuration: Double
  var currentIteration: Double | Null
  var endTime: Double
  var localTime: Double | Null
  var progress: Double | Null
}

object ComputedTimingProperties {
  @scala.inline
  def apply(
    activeDuration: Double,
    endTime: Double,
    currentIteration: Int | Double = null,
    localTime: Int | Double = null,
    progress: Int | Double = null
  ): ComputedTimingProperties = {
    val __obj = js.Dynamic.literal(activeDuration = activeDuration.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any])
    if (currentIteration != null) __obj.updateDynamic("currentIteration")(currentIteration.asInstanceOf[js.Any])
    if (localTime != null) __obj.updateDynamic("localTime")(localTime.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedTimingProperties]
  }
}

