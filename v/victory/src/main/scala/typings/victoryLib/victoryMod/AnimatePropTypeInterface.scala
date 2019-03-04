package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatePropTypeInterface extends js.Object {
  /**
    * Animation duration
    */
  var duration: scala.Double
  /**
    * The easing prop specifies an easing function name to use for tweening.
    * @default "quadInOut"
    */
  var easing: js.UndefOr[AnimationEasing] = js.undefined
  /**
    * Animation end callback
    */
  var onEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Animation enter transition configuration
    */
  var onEnter: js.UndefOr[victoryLib.Anon_After] = js.undefined
  /**
    * Animation exit transition configuration
    */
  var onExit: js.UndefOr[victoryLib.Anon_Before] = js.undefined
  /**
    * Animation load transition configuration
    */
  var onLoad: js.UndefOr[victoryLib.Anon_After] = js.undefined
}

object AnimatePropTypeInterface {
  @scala.inline
  def apply(
    duration: scala.Double,
    easing: AnimationEasing = null,
    onEnd: js.Function0[scala.Unit] = null,
    onEnter: victoryLib.Anon_After = null,
    onExit: victoryLib.Anon_Before = null,
    onLoad: victoryLib.Anon_After = null
  ): AnimatePropTypeInterface = {
    val __obj = js.Dynamic.literal(duration = duration)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (onEnd != null) __obj.updateDynamic("onEnd")(onEnd)
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    __obj.asInstanceOf[AnimatePropTypeInterface]
  }
}

