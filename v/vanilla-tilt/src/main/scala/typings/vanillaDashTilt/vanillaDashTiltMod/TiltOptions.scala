package typings.vanillaDashTilt.vanillaDashTiltMod

import typings.vanillaDashTilt.vanillaDashTiltStrings.x
import typings.vanillaDashTilt.vanillaDashTiltStrings.y
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
    axis: x | y = null,
    easing: String = null,
    `full-page-listening`: js.UndefOr[Boolean] = js.undefined,
    glare: js.UndefOr[Boolean] = js.undefined,
    `glare-prerender`: js.UndefOr[Boolean] = js.undefined,
    gyroscope: js.UndefOr[Boolean] = js.undefined,
    gyroscopeMaxAngleX: Int | Double = null,
    gyroscopeMaxAngleY: Int | Double = null,
    gyroscopeMinAngleX: Int | Double = null,
    gyroscopeMinAngleY: Int | Double = null,
    gyroscopeSamples: Int | Double = null,
    max: Int | Double = null,
    `max-glare`: Int | Double = null,
    `mouse-event-element`: String = null,
    perspective: Int | Double = null,
    reset: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    scale: Int | Double = null,
    speed: Int | Double = null,
    startX: Int | Double = null,
    startY: Int | Double = null,
    transition: js.UndefOr[Boolean] = js.undefined
  ): TiltOptions = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(`full-page-listening`)) __obj.updateDynamic("full-page-listening")(`full-page-listening`)
    if (!js.isUndefined(glare)) __obj.updateDynamic("glare")(glare)
    if (!js.isUndefined(`glare-prerender`)) __obj.updateDynamic("glare-prerender")(`glare-prerender`)
    if (!js.isUndefined(gyroscope)) __obj.updateDynamic("gyroscope")(gyroscope)
    if (gyroscopeMaxAngleX != null) __obj.updateDynamic("gyroscopeMaxAngleX")(gyroscopeMaxAngleX.asInstanceOf[js.Any])
    if (gyroscopeMaxAngleY != null) __obj.updateDynamic("gyroscopeMaxAngleY")(gyroscopeMaxAngleY.asInstanceOf[js.Any])
    if (gyroscopeMinAngleX != null) __obj.updateDynamic("gyroscopeMinAngleX")(gyroscopeMinAngleX.asInstanceOf[js.Any])
    if (gyroscopeMinAngleY != null) __obj.updateDynamic("gyroscopeMinAngleY")(gyroscopeMinAngleY.asInstanceOf[js.Any])
    if (gyroscopeSamples != null) __obj.updateDynamic("gyroscopeSamples")(gyroscopeSamples.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (`max-glare` != null) __obj.updateDynamic("max-glare")(`max-glare`.asInstanceOf[js.Any])
    if (`mouse-event-element` != null) __obj.updateDynamic("mouse-event-element")(`mouse-event-element`)
    if (perspective != null) __obj.updateDynamic("perspective")(perspective.asInstanceOf[js.Any])
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (startX != null) __obj.updateDynamic("startX")(startX.asInstanceOf[js.Any])
    if (startY != null) __obj.updateDynamic("startY")(startY.asInstanceOf[js.Any])
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[TiltOptions]
  }
}

