package typings.uikit.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyOptions extends js.Object {
  /**
    * UIkit animation class
    * @default ''
    * <h2>Possible value</h2>
    * string
    */
  var animation: js.UndefOr[String] = js.undefined
  /**
    * Set to <code>true</code> to bind sticky to the parent or a Css selector to bind sticky to a specific element.
    * @default false
    * <h2>Possible value</h2>
    * mixed
    */
  var boundary: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Active class to add, when element is sticky
    * @default uk-active
    * <h2>Possible value</h2>
    * string
    */
  var clsactive: js.UndefOr[String] = js.undefined
  /**
    * Class to add, when element is not sticky
    * @default ''
    * <h2>Possible value</h2>
    * string
    */
  var clsinactive: js.UndefOr[String] = js.undefined
  /**
    * Init class when the element is sticky for the first time
    * @default uk-sticky-init
    * <h2>Possible value</h2>
    * string
    */
  var clsinit: js.UndefOr[String] = js.undefined
  /**
    * Css selector where to get the width from in sticky mode. By default it takes the width from the created wrapper element.
    * @default ''
    * <h2>Possible value</h2>
    * string
    */
  var getWidthFrom: js.UndefOr[String] = js.undefined
  /**
    * Condition for the active status with a width as integer (e.g. 640) or a css media query
    * @default false
    * <h2>Possible value</h2>
    * integer / string
    */
  var media: js.UndefOr[Double | String] = js.undefined
  /**
    * Show sticky element only when scrolling up.
    * @default false
    * <h2>Possible value</h2>
    * boolean
    */
  var showup: js.UndefOr[Boolean] = js.undefined
  /**
    * Make sure that a sticky element is not over a targeted element via location hash on dom-ready.
    * @default false
    * <h2>Possible value</h2>
    * boolean
    */
  var target: js.UndefOr[Boolean] = js.undefined
  /**
    * Top offset whent sticky should be triggered
    * @default 0
    * <h2>Possible value</h2>
    * integer
    */
  var top: js.UndefOr[Double] = js.undefined
}

object StickyOptions {
  @scala.inline
  def apply(
    animation: String = null,
    boundary: Boolean | String = null,
    clsactive: String = null,
    clsinactive: String = null,
    clsinit: String = null,
    getWidthFrom: String = null,
    media: Double | String = null,
    showup: js.UndefOr[Boolean] = js.undefined,
    target: js.UndefOr[Boolean] = js.undefined,
    top: Int | Double = null
  ): StickyOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (clsactive != null) __obj.updateDynamic("clsactive")(clsactive)
    if (clsinactive != null) __obj.updateDynamic("clsinactive")(clsinactive)
    if (clsinit != null) __obj.updateDynamic("clsinit")(clsinit)
    if (getWidthFrom != null) __obj.updateDynamic("getWidthFrom")(getWidthFrom)
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (!js.isUndefined(showup)) __obj.updateDynamic("showup")(showup)
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyOptions]
  }
}

