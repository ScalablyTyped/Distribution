package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderOptions extends js.Object {
  /**
    * Class added on active item in center mode
    * @default uk-active
    */
  var activecls: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines whether or not the slider items should switch automatically
    * @default false
    */
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defines the timespan between switching slider items
    * @default 7000
    */
  var autoplayInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Center items mode
    * @default false
    */
  var center: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Infinite scrolling
    * @default true
    */
  var infinite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Pause autoplay when hovering a slider
    * @default true
    */
  var pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Mouse movement threshold in pixel until trigger element dragging
    * @default true
    */
  var threshold: js.UndefOr[scala.Boolean] = js.undefined
}

object SliderOptions {
  @scala.inline
  def apply(
    activecls: java.lang.String = null,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayInterval: scala.Int | scala.Double = null,
    center: js.UndefOr[scala.Boolean] = js.undefined,
    infinite: js.UndefOr[scala.Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: js.UndefOr[scala.Boolean] = js.undefined
  ): SliderOptions = {
    val __obj = js.Dynamic.literal()
    if (activecls != null) __obj.updateDynamic("activecls")(activecls)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite)
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold)
    __obj.asInstanceOf[SliderOptions]
  }
}

