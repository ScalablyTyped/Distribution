package typings.velocityDashAnimate.jqueryNs.velocityNs

import typings.velocityDashAnimate.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisteredEffectOptions extends CommonOptions {
  var backwards: js.UndefOr[Boolean] = js.undefined
  var drag: js.UndefOr[Boolean] = js.undefined
  var stagger: js.UndefOr[Double] = js.undefined
}

object RegisteredEffectOptions {
  @scala.inline
  def apply(
    _cacheValues: js.UndefOr[Boolean] = js.undefined,
    axis: String = null,
    backwards: js.UndefOr[Boolean] = js.undefined,
    begin: ElementCallback = null,
    complete: ElementCallback = null,
    container: JQuery = null,
    delay: Double | Boolean = null,
    display: String | Boolean = null,
    drag: js.UndefOr[Boolean] = js.undefined,
    duration: String | Double = null,
    mobileHA: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    stagger: Int | Double = null
  ): RegisteredEffectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_cacheValues)) __obj.updateDynamic("_cacheValues")(_cacheValues)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (!js.isUndefined(backwards)) __obj.updateDynamic("backwards")(backwards)
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (container != null) __obj.updateDynamic("container")(container)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(drag)) __obj.updateDynamic("drag")(drag)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(mobileHA)) __obj.updateDynamic("mobileHA")(mobileHA)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (stagger != null) __obj.updateDynamic("stagger")(stagger.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredEffectOptions]
  }
}

