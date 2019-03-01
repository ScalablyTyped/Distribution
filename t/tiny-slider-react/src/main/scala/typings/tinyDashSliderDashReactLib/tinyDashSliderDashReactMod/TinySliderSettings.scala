package typings
package tinyDashSliderDashReactLib.tinyDashSliderDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinySliderSettings extends CommonOptions {
  /**
    * Time between each gallery animation (in "ms").
    * @defaultValue false
    */
  var animateDelay: js.UndefOr[
    scala.Double | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false`
  ] = js.undefined
  /**
    * Name of intro animation class.
    * @defaultValue "tns-fadeIn"
    */
  var animateIn: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of default animation class.
    * @defaultValue "tns-normal"
    */
  var animateNormal: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of outro animation class.
    * @defaultValue "tns-fadeOut"
    */
  var animateOut: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The customized autoplay start/stop button or selector.
    * @defaultValue false
    */
  var autoplayButton: js.UndefOr[
    reactLib.HTMLElement | java.lang.String | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false`
  ] = js.undefined
  /**
    * Output autoplayButton markup when autoplay is true but a customized autoplayButton is not provided.
    * @defaultValue true
    */
  var autoplayButtonOutput: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Direction of slide movement (ascending/descending the slide index).
    * @defaultValue "forward"
    */
  var autoplayDirection: js.UndefOr[
    tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.forward | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.backward
  ] = js.undefined
  /**
    * The axis of the slider.
    * @defaultValue "horizontal"
    */
  var axis: js.UndefOr[
    tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.horizontal | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.vertical
  ] = js.undefined
  /**
    * The container element/selector around the prev/next buttons.
    * controlsContainer must have at least 2 child elements.
    * @defaultValue false
    */
  var controlsContainer: js.UndefOr[
    reactLib.HTMLElement | java.lang.String | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false`
  ] = js.undefined
  /**
    * Indicate whether the slider will be frozen (controls, nav, autoplay and other functions will stop work) when all slides can be displayed in one page.
    * @defaultValue true
    */
  var freezable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables lazyloading images that are currently not viewed, thus saving bandwidth
    * @defaultValue false
    */
  var lazyload: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Moves throughout all the slides seamlessly.
    * @defaultValue true
    */
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls animation behaviour.
    * With carousel everything slides to the side, while gallery uses fade animations and changes all slides at once.
    * @defaultValue "carousel"
    */
  var mode: js.UndefOr[
    tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.carousel | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.gallery
  ] = js.undefined
  /**
    * Indecate if the dots are thurbnails. If true, they will always be visible even when more than 1 slides displayed in the viewport.
    * @defaultValue false
    */
  var navAsThumbnails: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The container element/selector around the dots.
    * navContainer must have at least same number of children as the slides.
    * @defaultValue false
    */
  var navContainer: js.UndefOr[
    reactLib.HTMLElement | java.lang.String | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false`
  ] = js.undefined
  /**
    * Difine the relationship between nested sliders.
    * Make sure you run the inner slider first, otherwise the height of the inner slider container will be wrong.
    * @defaultValue false
    */
  var nested: js.UndefOr[
    tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.inner | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.outer | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false`
  ] = js.undefined
  /**
    * Callback to be run on initialization.
    * @defaultValue false
    */
  var onInit: js.UndefOr[
    js.Function0[
      scala.Unit | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false`
    ]
  ] = js.undefined
  /**
    * Breakpoint: Integer.
    * Defines options for different viewport widths
    * @defaultValue false
    */
  var responsive: js.UndefOr[
    ResponsiveOptions | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false`
  ] = js.undefined
  /**
    * Moves to the opposite edge when reaching the first or last slide.
    * @defaultValue false
    */
  var rewind: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Swipe or drag will not be triggered if the angle is not inside the range when set.
    * @defaultValue 15
    */
  var swipeAngle: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
}

object TinySliderSettings {
  @scala.inline
  def apply(
    animateDelay: scala.Double | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false` = null,
    animateIn: java.lang.String = null,
    animateNormal: java.lang.String = null,
    animateOut: java.lang.String = null,
    arrowKeys: js.UndefOr[scala.Boolean] = js.undefined,
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayButton: reactLib.HTMLElement | java.lang.String | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false` = null,
    autoplayButtonOutput: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayDirection: tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.forward | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.backward = null,
    autoplayHoverPause: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayResetOnVisibility: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayText: js.Array[java.lang.String] = null,
    autoplayTimeout: scala.Int | scala.Double = null,
    axis: tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.horizontal | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.vertical = null,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    controlsContainer: reactLib.HTMLElement | java.lang.String | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false` = null,
    controlsText: js.Array[java.lang.String] = null,
    disable: js.UndefOr[scala.Boolean] = js.undefined,
    edgePadding: scala.Int | scala.Double = null,
    fixedWidth: scala.Double | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false` = null,
    freezable: js.UndefOr[scala.Boolean] = js.undefined,
    gutter: scala.Int | scala.Double = null,
    items: scala.Int | scala.Double = null,
    lazyload: js.UndefOr[scala.Boolean] = js.undefined,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    mode: tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.carousel | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.gallery = null,
    mouseDrag: js.UndefOr[scala.Boolean] = js.undefined,
    nav: js.UndefOr[scala.Boolean] = js.undefined,
    navAsThumbnails: js.UndefOr[scala.Boolean] = js.undefined,
    navContainer: reactLib.HTMLElement | java.lang.String | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false` = null,
    nested: tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.inner | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.outer | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false` = null,
    onInit: js.Function0[
      scala.Unit | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false`
    ] = null,
    responsive: ResponsiveOptions | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibNumbers.`false` = null,
    rewind: js.UndefOr[scala.Boolean] = js.undefined,
    slideBy: scala.Double | tinyDashSliderDashReactLib.tinyDashSliderDashReactLibStrings.page = null,
    speed: scala.Int | scala.Double = null,
    startIndex: scala.Int | scala.Double = null,
    swipeAngle: scala.Double | scala.Boolean = null,
    touch: js.UndefOr[scala.Boolean] = js.undefined
  ): TinySliderSettings = {
    val __obj = js.Dynamic.literal()
    if (animateDelay != null) __obj.updateDynamic("animateDelay")(animateDelay.asInstanceOf[js.Any])
    if (animateIn != null) __obj.updateDynamic("animateIn")(animateIn)
    if (animateNormal != null) __obj.updateDynamic("animateNormal")(animateNormal)
    if (animateOut != null) __obj.updateDynamic("animateOut")(animateOut)
    if (!js.isUndefined(arrowKeys)) __obj.updateDynamic("arrowKeys")(arrowKeys)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (autoplayButton != null) __obj.updateDynamic("autoplayButton")(autoplayButton.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayButtonOutput)) __obj.updateDynamic("autoplayButtonOutput")(autoplayButtonOutput)
    if (autoplayDirection != null) __obj.updateDynamic("autoplayDirection")(autoplayDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayHoverPause)) __obj.updateDynamic("autoplayHoverPause")(autoplayHoverPause)
    if (!js.isUndefined(autoplayResetOnVisibility)) __obj.updateDynamic("autoplayResetOnVisibility")(autoplayResetOnVisibility)
    if (autoplayText != null) __obj.updateDynamic("autoplayText")(autoplayText)
    if (autoplayTimeout != null) __obj.updateDynamic("autoplayTimeout")(autoplayTimeout.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (controlsContainer != null) __obj.updateDynamic("controlsContainer")(controlsContainer.asInstanceOf[js.Any])
    if (controlsText != null) __obj.updateDynamic("controlsText")(controlsText)
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (edgePadding != null) __obj.updateDynamic("edgePadding")(edgePadding.asInstanceOf[js.Any])
    if (fixedWidth != null) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(freezable)) __obj.updateDynamic("freezable")(freezable)
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyload)) __obj.updateDynamic("lazyload")(lazyload)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseDrag)) __obj.updateDynamic("mouseDrag")(mouseDrag)
    if (!js.isUndefined(nav)) __obj.updateDynamic("nav")(nav)
    if (!js.isUndefined(navAsThumbnails)) __obj.updateDynamic("navAsThumbnails")(navAsThumbnails)
    if (navContainer != null) __obj.updateDynamic("navContainer")(navContainer.asInstanceOf[js.Any])
    if (nested != null) __obj.updateDynamic("nested")(nested.asInstanceOf[js.Any])
    if (onInit != null) __obj.updateDynamic("onInit")(onInit)
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(rewind)) __obj.updateDynamic("rewind")(rewind)
    if (slideBy != null) __obj.updateDynamic("slideBy")(slideBy.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (swipeAngle != null) __obj.updateDynamic("swipeAngle")(swipeAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch)
    __obj.asInstanceOf[TinySliderSettings]
  }
}

