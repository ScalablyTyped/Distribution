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

