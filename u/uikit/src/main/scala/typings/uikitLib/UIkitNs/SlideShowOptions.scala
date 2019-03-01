package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideShowOptions extends js.Object {
  /**
    * Defines the preferred transition between items.
    * @default 'fade
    */
  var animation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines whether or not the slideshow items should switch automatically.
    * @default false
    */
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defines the timespan between switching slideshow items.
    * @default 7000
    */
  var autoplayInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines the transition duration.
    * @default 500
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines the slideshow height.
    * @default 'auto'
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines whether or not the Ken Burns effect is active. If kenburns is a numeric value, it will be used as
    * the animation duration.
    * @default false
    */
  var kenburns: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Animation series.
    * @default 'uk-animation-middle-left, uk-animation-top-right, uk-animation-bottom-left, uk-animation-top-center,uk-animation-bottom-right'
    */
  var kenburnsanimations: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Pause autoplay when hovering a slideshow.
    * @default true
    */
  var pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defines the number of slices, if a "Slice" transition is set.
    * @default 15
    */
  var slices: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines the first slideshow item to be displayed.
    * @default 0
    */
  var start: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines whether or not a video starts automatically.
    * @default true
    */
  var videoautoplay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defines whether or not a video is muted.
    * @default false
    */
  var videomute: js.UndefOr[scala.Boolean] = js.undefined
}

object SlideShowOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayInterval: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    height: java.lang.String = null,
    kenburns: js.UndefOr[scala.Boolean] = js.undefined,
    kenburnsanimations: java.lang.String = null,
    pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    slices: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null,
    videoautoplay: js.UndefOr[scala.Boolean] = js.undefined,
    videomute: js.UndefOr[scala.Boolean] = js.undefined
  ): SlideShowOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(kenburns)) __obj.updateDynamic("kenburns")(kenburns)
    if (kenburnsanimations != null) __obj.updateDynamic("kenburnsanimations")(kenburnsanimations)
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(videoautoplay)) __obj.updateDynamic("videoautoplay")(videoautoplay)
    if (!js.isUndefined(videomute)) __obj.updateDynamic("videomute")(videomute)
    __obj.asInstanceOf[SlideShowOptions]
  }
}

