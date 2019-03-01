package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  /**
    * Toggled active class
    * @default 'uk-active'
    * <h2>Possible value</h2>
    * string
    */
  var activeClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Fade in tooltip
    * @default false
    * <h2>Possible value</h2>
    * boolean
    */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Custom class to add on show
    * @default ''
    * <h2>Possible value</h2>
    * string
    */
  var cls: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Delay tooltip show in ms
    * @default 0
    * <h2>Possible value</h2>
    * integer
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Offset to the source element
    * @default 5
    * <h2>Possible value</h2>
    * integer
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Tooltip position
    * @default 'top'
    * <h2>Possible value</h2>
    * string
    */
  var pos: js.UndefOr[java.lang.String] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    activeClass: java.lang.String = null,
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    cls: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    pos: java.lang.String = null
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pos != null) __obj.updateDynamic("pos")(pos)
    __obj.asInstanceOf[TooltipOptions]
  }
}

