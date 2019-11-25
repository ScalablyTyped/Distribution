package typings.uikit.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideSetOptions extends js.Object {
  /**
    * Animation name
    * @default 'fade'
    */
  var animation: js.UndefOr[String] = js.undefined
  /**
    * Defines whether or not the slideset items should switch automatically.
    * @default false
    */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines the timespan between switching slideset items.
    * @default 7000
    */
  var autoplayInterval: js.UndefOr[Double] = js.undefined
  /**
    * Default visible items in a set
    * @default 1
    */
  var default: js.UndefOr[Double] = js.undefined
  /**
    * Animation delay between items in a set
    * @default 100
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Animation duration in ms
    * @default 200
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Items filter
    * @default ""
    */
  var filter: js.UndefOr[String] = js.undefined
  /**
    * Visible items in a set at large breakpoint
    * @default null
    */
  var large: js.UndefOr[Double] = js.undefined
  /**
    * Visible items in a set at medium breakpoint
    * @default null
    */
  var medium: js.UndefOr[Double] = js.undefined
  /**
    * Pause autoplay when hovering a slideset.
    * @default true
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
  /**
    * Visible items in a set at small breakpoint
    * @default null
    */
  var small: js.UndefOr[Double] = js.undefined
  /**
    * Visible items in a set at xlarge breakpoint
    * @default null
    */
  var xlarge: js.UndefOr[Double] = js.undefined
}

object SlideSetOptions {
  @scala.inline
  def apply(
    animation: String = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayInterval: Int | Double = null,
    default: Int | Double = null,
    delay: Int | Double = null,
    duration: Int | Double = null,
    filter: String = null,
    large: Int | Double = null,
    medium: Int | Double = null,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    small: Int | Double = null,
    xlarge: Int | Double = null
  ): SlideSetOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideSetOptions]
  }
}

