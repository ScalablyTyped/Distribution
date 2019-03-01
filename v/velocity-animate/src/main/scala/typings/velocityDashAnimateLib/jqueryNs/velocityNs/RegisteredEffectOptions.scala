package typings
package velocityDashAnimateLib.jqueryNs.velocityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisteredEffectOptions extends CommonOptions {
  var backwards: js.UndefOr[scala.Boolean] = js.undefined
  var drag: js.UndefOr[scala.Boolean] = js.undefined
  var stagger: js.UndefOr[scala.Double] = js.undefined
}

object RegisteredEffectOptions {
  @scala.inline
  def apply(
    _cacheValues: js.UndefOr[scala.Boolean] = js.undefined,
    axis: java.lang.String = null,
    backwards: js.UndefOr[scala.Boolean] = js.undefined,
    begin: ElementCallback = null,
    complete: ElementCallback = null,
    container: velocityDashAnimateLib.JQuery = null,
    delay: scala.Double | scala.Boolean = null,
    display: java.lang.String | scala.Boolean = null,
    drag: js.UndefOr[scala.Boolean] = js.undefined,
    duration: java.lang.String | scala.Double = null,
    mobileHA: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null,
    stagger: scala.Int | scala.Double = null
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

