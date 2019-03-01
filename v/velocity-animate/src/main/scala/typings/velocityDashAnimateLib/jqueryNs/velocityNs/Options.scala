package typings
package velocityDashAnimateLib.jqueryNs.velocityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends CommonOptions {
  var easing: js.UndefOr[Easing] = js.undefined
  var loop: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var progress: js.UndefOr[ProgressCallback] = js.undefined
  var queue: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    _cacheValues: js.UndefOr[scala.Boolean] = js.undefined,
    axis: java.lang.String = null,
    begin: ElementCallback = null,
    complete: ElementCallback = null,
    container: velocityDashAnimateLib.JQuery = null,
    delay: scala.Double | scala.Boolean = null,
    display: java.lang.String | scala.Boolean = null,
    duration: java.lang.String | scala.Double = null,
    easing: Easing = null,
    loop: scala.Double | scala.Boolean = null,
    mobileHA: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null,
    progress: ProgressCallback = null,
    queue: java.lang.String | scala.Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_cacheValues)) __obj.updateDynamic("_cacheValues")(_cacheValues)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (container != null) __obj.updateDynamic("container")(container)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(mobileHA)) __obj.updateDynamic("mobileHA")(mobileHA)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

