package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideSetOptions extends js.Object {
  /**
    * Animation name
    * @default 'fade'
    */
  var animation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines whether or not the slideset items should switch automatically.
    * @default false
    */
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defines the timespan between switching slideset items.
    * @default 7000
    */
  var autoplayInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default visible items in a set
    * @default 1
    */
  var default: js.UndefOr[scala.Double] = js.undefined
  /**
    * Animation delay between items in a set
    * @default 100
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Animation duration in ms
    * @default 200
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Items filter
    * @default ""
    */
  var filter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Visible items in a set at large breakpoint
    * @default null
    */
  var large: js.UndefOr[scala.Double] = js.undefined
  /**
    * Visible items in a set at medium breakpoint
    * @default null
    */
  var medium: js.UndefOr[scala.Double] = js.undefined
  /**
    * Pause autoplay when hovering a slideset.
    * @default true
    */
  var pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Visible items in a set at small breakpoint
    * @default null
    */
  var small: js.UndefOr[scala.Double] = js.undefined
  /**
    * Visible items in a set at xlarge breakpoint
    * @default null
    */
  var xlarge: js.UndefOr[scala.Double] = js.undefined
}

object SlideSetOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayInterval: scala.Int | scala.Double = null,
    default: scala.Int | scala.Double = null,
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    filter: java.lang.String = null,
    large: scala.Int | scala.Double = null,
    medium: scala.Int | scala.Double = null,
    pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    small: scala.Int | scala.Double = null,
    xlarge: scala.Int | scala.Double = null
  ): SlideSetOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideSetOptions]
  }
}

