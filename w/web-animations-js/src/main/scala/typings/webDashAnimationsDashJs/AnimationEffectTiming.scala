package typings.webDashAnimationsDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationEffectTiming extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[AnimationEffectTimingPlaybackDirection] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var endDelay: js.UndefOr[Double] = js.undefined
  var fill: js.UndefOr[AnimationEffectTimingFillMode] = js.undefined
  var iterationStart: js.UndefOr[Double] = js.undefined
  var iterations: js.UndefOr[Double] = js.undefined
  var playbackRate: js.UndefOr[Double] = js.undefined
}

object AnimationEffectTiming {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    direction: AnimationEffectTimingPlaybackDirection = null,
    duration: Int | Double = null,
    easing: String = null,
    endDelay: Int | Double = null,
    fill: AnimationEffectTimingFillMode = null,
    iterationStart: Int | Double = null,
    iterations: Int | Double = null,
    playbackRate: Int | Double = null
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

