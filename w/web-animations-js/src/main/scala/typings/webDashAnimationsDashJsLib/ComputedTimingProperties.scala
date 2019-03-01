package typings
package webDashAnimationsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedTimingProperties extends js.Object {
  var activeDuration: scala.Double
  var currentIteration: scala.Double | scala.Null
  var endTime: scala.Double
  var localTime: scala.Double | scala.Null
  var progress: scala.Double | scala.Null
}

object ComputedTimingProperties {
  @scala.inline
  def apply(
    activeDuration: scala.Double,
    endTime: scala.Double,
    currentIteration: scala.Int | scala.Double = null,
    localTime: scala.Int | scala.Double = null,
    progress: scala.Int | scala.Double = null
  ): ComputedTimingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activeDuration")(activeDuration)
    __obj.updateDynamic("endTime")(endTime)
    if (currentIteration != null) __obj.updateDynamic("currentIteration")(currentIteration.asInstanceOf[js.Any])
    if (localTime != null) __obj.updateDynamic("localTime")(localTime.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedTimingProperties]
  }
}

