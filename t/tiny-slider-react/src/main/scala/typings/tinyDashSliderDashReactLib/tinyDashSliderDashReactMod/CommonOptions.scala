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

