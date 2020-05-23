package typings.webAnimationsJs

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
    delay: js.UndefOr[Double] = js.undefined,
    direction: AnimationEffectTimingPlaybackDirection = null,
    duration: js.UndefOr[Double] = js.undefined,
    easing: String = null,
    endDelay: js.UndefOr[Double] = js.undefined,
    fill: AnimationEffectTimingFillMode = null,
    iterationStart: js.UndefOr[Double] = js.undefined,
    iterations: js.UndefOr[Double] = js.undefined,
    playbackRate: js.UndefOr[Double] = js.undefined
  ): AnimationEffectTiming = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(endDelay)) __obj.updateDynamic("endDelay")(endDelay.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(iterationStart)) __obj.updateDynamic("iterationStart")(iterationStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(playbackRate)) __obj.updateDynamic("playbackRate")(playbackRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEffectTiming]
  }
}

