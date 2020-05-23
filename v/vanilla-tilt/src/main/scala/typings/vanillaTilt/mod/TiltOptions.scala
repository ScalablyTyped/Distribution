package typings.vanillaTilt.mod

import typings.vanillaTilt.vanillaTiltStrings.x
import typings.vanillaTilt.vanillaTiltStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiltOptions extends js.Object {
  /**
    * What axis should be disabled. Can be X or Y.
    */
  var axis: js.UndefOr[Null | x | y] = js.undefined
  /**
    * Easing on enter/exit.
    */
  var easing: js.UndefOr[String] = js.undefined
  // If true, parallax effect will listen to mouse move events on the whole document, not only the selected element
  var `full-page-listening`: js.UndefOr[Boolean] = js.undefined
  /**
    * if it should have a "glare" effect
    */
  var glare: js.UndefOr[Boolean] = js.undefined
  /**
    * false = VanillaTilt creates the glare elements for you, otherwise
    * you need to add .js-tilt-glare>.js-tilt-glare-inner by yourself
    */
  var `glare-prerender`: js.UndefOr[Boolean] = js.undefined
  // Boolean to enable/disable device orientation detection,
  var gyroscope: js.UndefOr[Boolean] = js.undefined
  // This is the top limit of the device angle on X axis,
  // meaning that a device rotated at this angle would tilt the element as if
  // the mouse was on the right border of the element;
  var gyroscopeMaxAngleX: js.UndefOr[Double] = js.undefined
  // This is the top limit of the device angle on Y axis,
  // meaning that a device rotated at this angle would tilt the element as if
  // the mouse was on the bottom border of the element;
  var gyroscopeMaxAngleY: js.UndefOr[Double] = js.undefined
  // This is the bottom limit of the device angle on X axis,
  // meaning that a device rotated at this angle would tilt the element as if
  // the mouse was on the left border of the element;
  var gyroscopeMinAngleX: js.UndefOr[Double] = js.undefined
  // This is the bottom limit of the device angle on Y axis,
  // meaning that a device rotated at this angle would tilt the element as if
  // the mouse was on the top border of the element;
  var gyroscopeMinAngleY: js.UndefOr[Double] = js.undefined
  //How many gyroscope moves to decide the starting position.
  var gyroscopeSamples: js.UndefOr[Double] = js.undefined
  /**
    * Max tilt rotation (degrees)
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * the maximum "glare" opacity
    */
  var `max-glare`: js.UndefOr[Double] = js.undefined
  // css-selector or link to HTML-element what will be listen mouse events
  var `mouse-event-element`: js.UndefOr[String] = js.undefined
  /**
    * Transform perspective, the lower the more extreme the tilt gets.
    */
  var perspective: js.UndefOr[Double] = js.undefined
  /**
    * If the tilt effect has to be reset on exit.
    */
  var reset: js.UndefOr[Boolean] = js.undefined
  /**
    * Reverse the tilt direction
    */
  var reverse: js.UndefOr[Boolean] = js.undefined
  /**
    * 2 = 200%, 1.5 = 150%, etc..
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * Speed of the enter/exit transition
    */
  var speed: js.UndefOr[Double] = js.undefined
  /**
    * Starting X tilt rotation (degrees)
    */
  var startX: js.UndefOr[Double] = js.undefined
  /**
    * Starting Y tilt rotation (degrees)
    */
  var startY: js.UndefOr[Double] = js.undefined
  /**
    * Set a transition on enter/exit.
    */
  var transition: js.UndefOr[Boolean] = js.undefined
}

object TiltOptions {
  @scala.inline
  def apply(
    axis: js.UndefOr[Null | x | y] = js.undefined,
    easing: String = null,
    `full-page-listening`: js.UndefOr[Boolean] = js.undefined,
    glare: js.UndefOr[Boolean] = js.undefined,
    `glare-prerender`: js.UndefOr[Boolean] = js.undefined,
    gyroscope: js.UndefOr[Boolean] = js.undefined,
    gyroscopeMaxAngleX: js.UndefOr[Double] = js.undefined,
    gyroscopeMaxAngleY: js.UndefOr[Double] = js.undefined,
    gyroscopeMinAngleX: js.UndefOr[Double] = js.undefined,
    gyroscopeMinAngleY: js.UndefOr[Double] = js.undefined,
    gyroscopeSamples: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    `max-glare`: js.UndefOr[Double] = js.undefined,
    `mouse-event-element`: String = null,
    perspective: js.UndefOr[Double] = js.undefined,
    reset: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    startX: js.UndefOr[Double] = js.undefined,
    startY: js.UndefOr[Double] = js.undefined,
    transition: js.UndefOr[Boolean] = js.undefined
  ): TiltOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(axis)) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(`full-page-listening`)) __obj.updateDynamic("full-page-listening")(`full-page-listening`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(glare)) __obj.updateDynamic("glare")(glare.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`glare-prerender`)) __obj.updateDynamic("glare-prerender")(`glare-prerender`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gyroscope)) __obj.updateDynamic("gyroscope")(gyroscope.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gyroscopeMaxAngleX)) __obj.updateDynamic("gyroscopeMaxAngleX")(gyroscopeMaxAngleX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gyroscopeMaxAngleY)) __obj.updateDynamic("gyroscopeMaxAngleY")(gyroscopeMaxAngleY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gyroscopeMinAngleX)) __obj.updateDynamic("gyroscopeMinAngleX")(gyroscopeMinAngleX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gyroscopeMinAngleY)) __obj.updateDynamic("gyroscopeMinAngleY")(gyroscopeMinAngleY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gyroscopeSamples)) __obj.updateDynamic("gyroscopeSamples")(gyroscopeSamples.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`max-glare`)) __obj.updateDynamic("max-glare")(`max-glare`.get.asInstanceOf[js.Any])
    if (`mouse-event-element` != null) __obj.updateDynamic("mouse-event-element")(`mouse-event-element`.asInstanceOf[js.Any])
    if (!js.isUndefined(perspective)) __obj.updateDynamic("perspective")(perspective.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startX)) __obj.updateDynamic("startX")(startX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startY)) __obj.updateDynamic("startY")(startY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiltOptions]
  }
}

