package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectTiming extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var direction: js.UndefOr[PlaybackDirection] = js.undefined
  var duration: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var endDelay: js.UndefOr[scala.Double] = js.undefined
  var fill: js.UndefOr[FillMode] = js.undefined
  var iterationStart: js.UndefOr[scala.Double] = js.undefined
  var iterations: js.UndefOr[scala.Double] = js.undefined
}

object EffectTiming {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    direction: PlaybackDirection = null,
    duration: scala.Double | java.lang.String = null,
    easing: java.lang.String = null,
    endDelay: scala.Int | scala.Double = null,
    fill: FillMode = null,
    iterationStart: scala.Int | scala.Double = null,
    iterations: scala.Int | scala.Double = null
  ): EffectTiming = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (endDelay != null) __obj.updateDynamic("endDelay")(endDelay.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (iterationStart != null) __obj.updateDynamic("iterationStart")(iterationStart.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectTiming]
  }
}

