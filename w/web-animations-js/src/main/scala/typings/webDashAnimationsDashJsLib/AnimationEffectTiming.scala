package typings
package webDashAnimationsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationEffectTiming extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var direction: js.UndefOr[AnimationEffectTimingPlaybackDirection] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var endDelay: js.UndefOr[scala.Double] = js.undefined
  var fill: js.UndefOr[AnimationEffectTimingFillMode] = js.undefined
  var iterationStart: js.UndefOr[scala.Double] = js.undefined
  var iterations: js.UndefOr[scala.Double] = js.undefined
  var playbackRate: js.UndefOr[scala.Double] = js.undefined
}

object AnimationEffectTiming {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    direction: AnimationEffectTimingPlaybackDirection = null,
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String = null,
    endDelay: scala.Int | scala.Double = null,
    fill: AnimationEffectTimingFillMode = null,
    iterationStart: scala.Int | scala.Double = null,
    iterations: scala.Int | scala.Double = null,
    playbackRate: scala.Int | scala.Double = null
  ): AnimationEffectTiming = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (endDelay != null) __obj.updateDynamic("endDelay")(endDelay.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (iterationStart != null) __obj.updateDynamic("iterationStart")(iterationStart.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEffectTiming]
  }
}

