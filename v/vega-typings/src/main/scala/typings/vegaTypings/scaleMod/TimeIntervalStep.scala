package typings.vegaTypings.scaleMod

import typings.vegaTypings.axisMod._TickCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeIntervalStep extends _TickCount {
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

