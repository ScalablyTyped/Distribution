package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyframeEffectOptions extends EffectTiming {
  var composite: js.UndefOr[CompositeOperation] = js.undefined
  var iterationComposite: js.UndefOr[IterationCompositeOperation] = js.undefined
}

object KeyframeEffectOptions {
  @scala.inline
  def apply(
    composite: CompositeOperation = null,
    delay: scala.Int | scala.Double = null,
    direction: PlaybackDirection = null,
    duration: scala.Double | java.lang.String = null,
    easing: java.lang.String = null,
    endDelay: scala.Int | scala.Double = null,
    fill: FillMode = null,
    iterationComposite: IterationCompositeOperation = null,
    iterationStart: scala.Int | scala.Double = null,
    iterations: scala.Int | scala.Double = null
  ): KeyframeEffectOptions = {
    val __obj = js.Dynamic.literal()
    if (composite != null) __obj.updateDynamic("composite")(composite)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (endDelay != null) __obj.updateDynamic("endDelay")(endDelay.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (iterationComposite != null) __obj.updateDynamic("iterationComposite")(iterationComposite)
    if (iterationStart != null) __obj.updateDynamic("iterationStart")(iterationStart.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframeEffectOptions]
  }
}

