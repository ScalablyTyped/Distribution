package typings.velocityDashAnimate.jqueryNs.velocityNs

import typings.velocityDashAnimate.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends CommonOptions {
  var easing: js.UndefOr[Easing] = js.undefined
  var loop: js.UndefOr[Double | Boolean] = js.undefined
  var progress: js.UndefOr[ProgressCallback] = js.undefined
  var queue: js.UndefOr[String | Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    _cacheValues: js.UndefOr[Boolean] = js.undefined,
    axis: String = null,
    begin: ElementCallback = null,
    complete: ElementCallback = null,
    container: JQuery = null,
    delay: Double | Boolean = null,
    display: String | Boolean = null,
    duration: String | Double = null,
    easing: Easing = null,
    loop: Double | Boolean = null,
    mobileHA: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    progress: ProgressCallback = null,
    queue: String | Boolean = null
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

