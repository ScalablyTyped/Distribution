package typings
package vanillaDashTiltLib.vanillaDashTiltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiltOptions extends js.Object {
  /**
    * What axis should be disabled. Can be X or Y.
    */
  var axis: js.UndefOr[
    scala.Null | vanillaDashTiltLib.vanillaDashTiltLibStrings.x | vanillaDashTiltLib.vanillaDashTiltLibStrings.y
  ] = js.undefined
  /**
    * Easing on enter/exit.
    */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * if it should have a "glare" effect
    */
  var glare: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * false = VanillaTilt creates the glare elements for you, otherwise
    * you need to add .js-tilt-glare>.js-tilt-glare-inner by yourself
    */
  var `glare-prerender`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Max tilt rotation (degrees)
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * the maximum "glare" opacity
    */
  var `max-glare`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Transform perspective, the lower the more extreme the tilt gets.
    */
  var perspective: js.UndefOr[scala.Double] = js.undefined
  /**
    * If the tilt effect has to be reset on exit.
    */
  var reset: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Reverse the tilt direction
    */
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 2 = 200%, 1.5 = 150%, etc..
    */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /**
    * Speed of the enter/exit transition
    */
  var speed: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set a transition on enter/exit.
    */
  var transition: js.UndefOr[scala.Boolean] = js.undefined
}

object TiltOptions {
  @scala.inline
  def apply(
    axis: vanillaDashTiltLib.vanillaDashTiltLibStrings.x | vanillaDashTiltLib.vanillaDashTiltLibStrings.y = null,
    easing: java.lang.String = null,
    glare: js.UndefOr[scala.Boolean] = js.undefined,
    `glare-prerender`: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    `max-glare`: scala.Int | scala.Double = null,
    perspective: scala.Int | scala.Double = null,
    reset: js.UndefOr[scala.Boolean] = js.undefined,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    scale: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null,
    transition: js.UndefOr[scala.Boolean] = js.undefined
  ): TiltOptions = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(glare)) __obj.updateDynamic("glare")(glare)
    if (!js.isUndefined(`glare-prerender`)) __obj.updateDynamic("glare-prerender")(`glare-prerender`)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (`max-glare` != null) __obj.updateDynamic("max-glare")(`max-glare`.asInstanceOf[js.Any])
    if (perspective != null) __obj.updateDynamic("perspective")(perspective.asInstanceOf[js.Any])
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[TiltOptions]
  }
}

