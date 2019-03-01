package typings
package tinyDashSliderDashReactLib.tinyDashSliderDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  /**
    * Allows using arrow keys to switch slides.
    * @defaultValue false
    */
  var arrowKeys: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Height of slider container changes according to each slide"s height.
    * @defaultValue false
    */
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Toggles the automatic change of slides
    * @defaultValue false
    */
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Stops sliding on mouseover.
    * @defaultValue false
    */
  var autoplayHoverPause: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Pauses the sliding when the page is invisiable and resumes it when the page become visiable again
    * @defaultValue true
    */
  var autoplayResetOnVisibility: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Text or markup in the autoplay start/stop button.
    * @defaultValue ["start", "stop"]
    */
  var autoplayText: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Time between 2 autoplay slides change (in "ms").
    * @defaultValue 5000
    */
  var autoplayTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Controls the display and functionalities of controls components (prev/next buttons). If true, display the controls and add all functionalities.
    * @defaultValue true
    */
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Text or markup in the prev/next buttons
    * @defaultValue ["prev", "next"]
    */
  var controlsText: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Disable slider.
    * @defaultValue false
    */
  var disable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Space on the outside (in "px").
    * @defaultValue 0
    */
  var edgePadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * Controls width attribute of the slides.
    * @defaultValue false
    */
  var fixedWidth: js.UndefOr[
    scala.Double | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false`
  ] = js.undefined
  /**
    * Space between slides (in "px").
    * @defaultValue 0
    */
  var gutter: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of slides being displayed in the viewport.
    * @defaultValue 1
    */
  var items: js.UndefOr[scala.Double] = js.undefined
  /**
    * Changing slides by dragging them.
    * @defaultValue false
    */
  var mouseDrag: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls the display and functionalities of nav components (dots). If true, display the nav and add all functionalities.
    * @defaultValue true
    */
  var nav: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Number of slides going on one "click".
    * @defaultValue 1
    */
  var slideBy: js.UndefOr[scala.Double | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.page] = js.undefined
  /**
    * Speed of the slide animation (in "ms").
    * @defaultValue 300
    */
  var speed: js.UndefOr[scala.Double] = js.undefined
  /**
    * The initial index of the slider.
    * @defaultValue 0
    */
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Activates input detection for touch devices.
    * @defaultValue true
    */
  var touch: js.UndefOr[scala.Boolean] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    arrowKeys: js.UndefOr[scala.Boolean] = js.undefined,
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayHoverPause: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayResetOnVisibility: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayText: js.Array[java.lang.String] = null,
    autoplayTimeout: scala.Int | scala.Double = null,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    controlsText: js.Array[java.lang.String] = null,
    disable: js.UndefOr[scala.Boolean] = js.undefined,
    edgePadding: scala.Int | scala.Double = null,
    fixedWidth: scala.Double | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false` = null,
    gutter: scala.Int | scala.Double = null,
    items: scala.Int | scala.Double = null,
    mouseDrag: js.UndefOr[scala.Boolean] = js.undefined,
    nav: js.UndefOr[scala.Boolean] = js.undefined,
    slideBy: scala.Double | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.page = null,
    speed: scala.Int | scala.Double = null,
    startIndex: scala.Int | scala.Double = null,
    touch: js.UndefOr[scala.Boolean] = js.undefined
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowKeys)) __obj.updateDynamic("arrowKeys")(arrowKeys)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(autoplayHoverPause)) __obj.updateDynamic("autoplayHoverPause")(autoplayHoverPause)
    if (!js.isUndefined(autoplayResetOnVisibility)) __obj.updateDynamic("autoplayResetOnVisibility")(autoplayResetOnVisibility)
    if (autoplayText != null) __obj.updateDynamic("autoplayText")(autoplayText)
    if (autoplayTimeout != null) __obj.updateDynamic("autoplayTimeout")(autoplayTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (controlsText != null) __obj.updateDynamic("controlsText")(controlsText)
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (edgePadding != null) __obj.updateDynamic("edgePadding")(edgePadding.asInstanceOf[js.Any])
    if (fixedWidth != null) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseDrag)) __obj.updateDynamic("mouseDrag")(mouseDrag)
    if (!js.isUndefined(nav)) __obj.updateDynamic("nav")(nav)
    if (slideBy != null) __obj.updateDynamic("slideBy")(slideBy.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch)
    __obj.asInstanceOf[CommonOptions]
  }
}

