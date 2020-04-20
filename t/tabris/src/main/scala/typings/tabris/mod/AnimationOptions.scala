package typings.tabris.mod

import typings.tabris.tabrisStrings.`ease-in-out`
import typings.tabris.tabrisStrings.`ease-in`
import typings.tabris.tabrisStrings.`ease-out`
import typings.tabris.tabrisStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  /**
    * Time until the animation starts in ms, defaults to 0.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Duration of the animation in ms.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    *  Easing function applied to the animation.
    */
  var easing: js.UndefOr[linear | `ease-in` | `ease-out` | `ease-in-out`] = js.undefined
  /**
    * no effect, but will be given in animation events.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *  Number of times to repeat the animation, defaults to 0.
    */
  var repeat: js.UndefOr[Double] = js.undefined
  /**
    *  If true, alternates the direction of the animation on every repeat.
    */
  var reverse: js.UndefOr[Boolean] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    duration: Int | Double = null,
    easing: linear | `ease-in` | `ease-out` | `ease-in-out` = null,
    name: String = null,
    repeat: Int | Double = null,
    reverse: js.UndefOr[Boolean] = js.undefined
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions]
  }
}

