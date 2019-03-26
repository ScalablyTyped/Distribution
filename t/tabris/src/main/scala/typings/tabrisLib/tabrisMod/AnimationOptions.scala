package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  /**
    * Time until the animation starts in ms, defaults to 0.
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Duration of the animation in ms.
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    *  Easing function applied to the animation.
    */
  var easing: js.UndefOr[
    tabrisLib.tabrisLibStrings.linear | tabrisLib.tabrisLibStrings.`ease-in` | tabrisLib.tabrisLibStrings.`ease-out` | tabrisLib.tabrisLibStrings.`ease-in-out`
  ] = js.undefined
  /**
    * no effect, but will be given in animation events.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  Number of times to repeat the animation, defaults to 0.
    */
  var repeat: js.UndefOr[scala.Double] = js.undefined
  /**
    *  If true, alternates the direction of the animation on every repeat.
    */
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    easing: tabrisLib.tabrisLibStrings.linear | tabrisLib.tabrisLibStrings.`ease-in` | tabrisLib.tabrisLibStrings.`ease-out` | tabrisLib.tabrisLibStrings.`ease-in-out` = null,
    name: java.lang.String = null,
    repeat: scala.Int | scala.Double = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    __obj.asInstanceOf[AnimationOptions]
  }
}

