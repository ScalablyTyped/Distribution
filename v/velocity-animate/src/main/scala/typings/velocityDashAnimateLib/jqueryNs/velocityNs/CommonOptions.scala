package typings
package velocityDashAnimateLib.jqueryNs.velocityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  var _cacheValues: js.UndefOr[scala.Boolean] = js.undefined
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var begin: js.UndefOr[ElementCallback] = js.undefined
  var complete: js.UndefOr[ElementCallback] = js.undefined
  var container: js.UndefOr[velocityDashAnimateLib.JQuery] = js.undefined
  var delay: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var display: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var duration: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var mobileHA: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
}

object CommonOptions {
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
    mobileHA: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_cacheValues)) __obj.updateDynamic("_cacheValues")(_cacheValues)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (container != null) __obj.updateDynamic("container")(container)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(mobileHA)) __obj.updateDynamic("mobileHA")(mobileHA)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptions]
  }
}

