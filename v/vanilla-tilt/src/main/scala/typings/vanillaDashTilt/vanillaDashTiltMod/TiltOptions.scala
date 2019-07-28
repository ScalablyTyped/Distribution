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
  /**
    * if it should have a "glare" effect
    */
  var glare: js.UndefOr[Boolean] = js.undefined
  /**
    * false = VanillaTilt creates the glare elements for you, otherwise
    * you need to add .js-tilt-glare>.js-tilt-glare-inner by yourself
    */
  var `glare-prerender`: js.UndefOr[Boolean] = js.undefined
  /**
    * Max tilt rotation (degrees)
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * the maximum "glare" opacity
    */
  var `max-glare`: js.UndefOr[Double] = js.undefined
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
    * Set a transition on enter/exit.
    */
  var transition: js.UndefOr[Boolean] = js.undefined
}

object TiltOptions {
  @scala.inline
  def apply(
    axis: x | y = null,
    easing: String = null,
    glare: js.UndefOr[Boolean] = js.undefined,
    `glare-prerender`: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    `max-glare`: Int | Double = null,
    perspective: Int | Double = null,
    reset: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    scale: Int | Double = null,
    speed: Int | Double = null,
    transition: js.UndefOr[Boolean] = js.undefined
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

