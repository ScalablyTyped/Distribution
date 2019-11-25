package typings.tinyDashSliderDashReact.tinyDashSliderDashReactMod

import typings.tinyDashSliderDashReact.tinyDashSliderDashReactNumbers.`false`
import typings.tinyDashSliderDashReact.tinyDashSliderDashReactStrings.page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  /**
    * Allows using arrow keys to switch slides.
    * @defaultValue false
    */
  var arrowKeys: js.UndefOr[Boolean] = js.undefined
  /**
    * Height of slider container changes according to each slide"s height.
    * @defaultValue false
    */
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  /**
    * Toggles the automatic change of slides
    * @defaultValue false
    */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /**
    * Stops sliding on mouseover.
    * @defaultValue false
    */
  var autoplayHoverPause: js.UndefOr[Boolean] = js.undefined
  /**
    * Pauses the sliding when the page is invisiable and resumes it when the page become visiable again
    * @defaultValue true
    */
  var autoplayResetOnVisibility: js.UndefOr[Boolean] = js.undefined
  /**
    * Text or markup in the autoplay start/stop button.
    * @defaultValue ["start", "stop"]
    */
  var autoplayText: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Time between 2 autoplay slides change (in "ms").
    * @defaultValue 5000
    */
  var autoplayTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Controls the display and functionalities of controls components (prev/next buttons). If true, display the controls and add all functionalities.
    * @defaultValue true
    */
  var controls: js.UndefOr[Boolean] = js.undefined
  /**
    * Text or markup in the prev/next buttons
    * @defaultValue ["prev", "next"]
    */
  var controlsText: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Disable slider.
    * @defaultValue false
    */
  var disable: js.UndefOr[Boolean] = js.undefined
  /**
    * Space on the outside (in "px").
    * @defaultValue 0
    */
  var edgePadding: js.UndefOr[Double] = js.undefined
  /**
    * Controls width attribute of the slides.
    * @defaultValue false
    */
  var fixedWidth: js.UndefOr[Double | `false`] = js.undefined
  /**
    * Space between slides (in "px").
    * @defaultValue 0
    */
  var gutter: js.UndefOr[Double] = js.undefined
  /**
    * Number of slides being displayed in the viewport.
    * @defaultValue 1
    */
  var items: js.UndefOr[Double] = js.undefined
  /**
    * Changing slides by dragging them.
    * @defaultValue false
    */
  var mouseDrag: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls the display and functionalities of nav components (dots). If true, display the nav and add all functionalities.
    * @defaultValue true
    */
  var nav: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of slides going on one "click".
    * @defaultValue 1
    */
  var slideBy: js.UndefOr[Double | page] = js.undefined
  /**
    * Speed of the slide animation (in "ms").
    * @defaultValue 300
    */
  var speed: js.UndefOr[Double] = js.undefined
  /**
    * The initial index of the slider.
    * @defaultValue 0
    */
  var startIndex: js.UndefOr[Double] = js.undefined
  /**
    * Activates input detection for touch devices.
    * @defaultValue true
    */
  var touch: js.UndefOr[Boolean] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    arrowKeys: js.UndefOr[Boolean] = js.undefined,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayHoverPause: js.UndefOr[Boolean] = js.undefined,
    autoplayResetOnVisibility: js.UndefOr[Boolean] = js.undefined,
    autoplayText: js.Array[String] = null,
    autoplayTimeout: Int | Double = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    controlsText: js.Array[String] = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    edgePadding: Int | Double = null,
    fixedWidth: Double | `false` = null,
    gutter: Int | Double = null,
    items: Int | Double = null,
    mouseDrag: js.UndefOr[Boolean] = js.undefined,
    nav: js.UndefOr[Boolean] = js.undefined,
    slideBy: Double | page = null,
    speed: Int | Double = null,
    startIndex: Int | Double = null,
    touch: js.UndefOr[Boolean] = js.undefined
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowKeys)) __obj.updateDynamic("arrowKeys")(arrowKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayHoverPause)) __obj.updateDynamic("autoplayHoverPause")(autoplayHoverPause.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayResetOnVisibility)) __obj.updateDynamic("autoplayResetOnVisibility")(autoplayResetOnVisibility.asInstanceOf[js.Any])
    if (autoplayText != null) __obj.updateDynamic("autoplayText")(autoplayText.asInstanceOf[js.Any])
    if (autoplayTimeout != null) __obj.updateDynamic("autoplayTimeout")(autoplayTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (controlsText != null) __obj.updateDynamic("controlsText")(controlsText.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (edgePadding != null) __obj.updateDynamic("edgePadding")(edgePadding.asInstanceOf[js.Any])
    if (fixedWidth != null) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseDrag)) __obj.updateDynamic("mouseDrag")(mouseDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(nav)) __obj.updateDynamic("nav")(nav.asInstanceOf[js.Any])
    if (slideBy != null) __obj.updateDynamic("slideBy")(slideBy.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptions]
  }
}

