package typings.velocityDashAnimate.jquery.velocity

import typings.std.HTMLElement
import typings.std.NodeListOf
import typings.velocityDashAnimate.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  var _cacheValues: js.UndefOr[Boolean] = js.undefined
  var axis: js.UndefOr[String] = js.undefined
  var begin: js.UndefOr[ElementCallback] = js.undefined
  var complete: js.UndefOr[ElementCallback] = js.undefined
  var container: js.UndefOr[JQuery] = js.undefined
  var delay: js.UndefOr[Double | Boolean] = js.undefined
  var display: js.UndefOr[String | Boolean] = js.undefined
  var duration: js.UndefOr[String | Double] = js.undefined
  var mobileHA: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    _cacheValues: js.UndefOr[Boolean] = js.undefined,
    axis: String = null,
    begin: /* elements */ NodeListOf[HTMLElement] => Unit = null,
    complete: /* elements */ NodeListOf[HTMLElement] => Unit = null,
    container: JQuery = null,
    delay: Double | Boolean = null,
    display: String | Boolean = null,
    duration: String | Double = null,
    mobileHA: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_cacheValues)) __obj.updateDynamic("_cacheValues")(_cacheValues)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (begin != null) __obj.updateDynamic("begin")(js.Any.fromFunction1(begin))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (container != null) __obj.updateDynamic("container")(container)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(mobileHA)) __obj.updateDynamic("mobileHA")(mobileHA)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptions]
  }
}

