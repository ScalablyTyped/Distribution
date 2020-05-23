package typings.tinySliderReact.mod

import typings.tinySliderReact.tinySliderReactBooleans.`false`
import typings.tinySliderReact.tinySliderReactStrings.page
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
    autoplayTimeout: js.UndefOr[Double] = js.undefined,
    controls: js.UndefOr[Boolean] = js.undefined,
    controlsText: js.Array[String] = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    edgePadding: js.UndefOr[Double] = js.undefined,
    fixedWidth: Double | `false` = null,
    gutter: js.UndefOr[Double] = js.undefined,
    items: js.UndefOr[Double] = js.undefined,
    mouseDrag: js.UndefOr[Boolean] = js.undefined,
    nav: js.UndefOr[Boolean] = js.undefined,
    slideBy: Double | page = null,
    speed: js.UndefOr[Double] = js.undefined,
    startIndex: js.UndefOr[Double] = js.undefined,
    touch: js.UndefOr[Boolean] = js.undefined
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowKeys)) __obj.updateDynamic("arrowKeys")(arrowKeys.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayHoverPause)) __obj.updateDynamic("autoplayHoverPause")(autoplayHoverPause.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayResetOnVisibility)) __obj.updateDynamic("autoplayResetOnVisibility")(autoplayResetOnVisibility.get.asInstanceOf[js.Any])
    if (autoplayText != null) __obj.updateDynamic("autoplayText")(autoplayText.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayTimeout)) __obj.updateDynamic("autoplayTimeout")(autoplayTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.get.asInstanceOf[js.Any])
    if (controlsText != null) __obj.updateDynamic("controlsText")(controlsText.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(edgePadding)) __obj.updateDynamic("edgePadding")(edgePadding.get.asInstanceOf[js.Any])
    if (fixedWidth != null) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(gutter)) __obj.updateDynamic("gutter")(gutter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(items)) __obj.updateDynamic("items")(items.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseDrag)) __obj.updateDynamic("mouseDrag")(mouseDrag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nav)) __obj.updateDynamic("nav")(nav.get.asInstanceOf[js.Any])
    if (slideBy != null) __obj.updateDynamic("slideBy")(slideBy.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptions]
  }
}

