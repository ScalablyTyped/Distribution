package typings.vegaTypings.scaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeIntervalStep extends js.Object {
  var interval: TimeInterval
  var step: Double
}

object TimeIntervalStep {
  @scala.inline
  def apply(interval: TimeInterval, step: Double): TimeIntervalStep = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimeIntervalStep]
  }
}

