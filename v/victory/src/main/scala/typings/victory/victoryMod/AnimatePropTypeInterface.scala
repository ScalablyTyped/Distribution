package typings.victory.victoryMod

import typings.victory.Anon_After
import typings.victory.Anon_Before
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatePropTypeInterface extends js.Object {
  /**
    * Animation duration
    */
  var duration: Double
  /**
    * The easing prop specifies an easing function name to use for tweening.
    * @default "quadInOut"
    */
  var easing: js.UndefOr[AnimationEasing] = js.undefined
  /**
    * Animation end callback
    */
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Animation enter transition configuration
    */
  var onEnter: js.UndefOr[Anon_After] = js.undefined
  /**
    * Animation exit transition configuration
    */
  var onExit: js.UndefOr[Anon_Before] = js.undefined
  /**
    * Animation load transition configuration
    */
  var onLoad: js.UndefOr[Anon_After] = js.undefined
}

object AnimatePropTypeInterface {
  @scala.inline
  def apply(
    duration: Double,
    easing: AnimationEasing = null,
    onEnd: () => Unit = null,
    onEnter: Anon_After = null,
    onExit: Anon_Before = null,
    onLoad: Anon_After = null
  ): AnimatePropTypeInterface = {
    val __obj = js.Dynamic.literal(duration = duration)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction0(onEnd))
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    __obj.asInstanceOf[AnimatePropTypeInterface]
  }
}

