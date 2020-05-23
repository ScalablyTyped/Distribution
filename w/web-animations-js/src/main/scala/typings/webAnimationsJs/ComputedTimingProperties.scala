package typings.webAnimationsJs

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
    currentIteration: Double = null.asInstanceOf[Double],
    localTime: Double = null.asInstanceOf[Double],
    progress: Double = null.asInstanceOf[Double]
  ): ComputedTimingProperties = {
    val __obj = js.Dynamic.literal(activeDuration = activeDuration.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], currentIteration = currentIteration.asInstanceOf[js.Any], localTime = localTime.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedTimingProperties]
  }
}

