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

