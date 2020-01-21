package typings.victory.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryAnimationProps extends js.Object {
  /**
    * The child of should be a function that takes an object of tweened values and returns a component to render.
    * @param style
    */
  var children: js.UndefOr[js.Function1[/* style */ AnimationStyle, ReactElement]] = js.undefined
  /**
    * The data prop specifies the latest set of values to tween to.
    * When this prop changes, VictoryAnimation will begin animating from the current value to the new value.
    * When given an array of values, VictoryAnimation will use it as an animation queue.
    * @default {}
    */
  var data: js.UndefOr[AnimationData] = js.undefined
  /**
    * The delay prop specifies a delay in milliseconds before the animation begins.
    * If multiple values are in the animation queue, it is the delay between each animation.
    * @default 0
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * The number of milliseconds the animation should take to complete.
    * @default 1000
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The easing prop specifies an easing function name to use for tweening.
    * @default "quadInOut"
    */
  var easing: js.UndefOr[AnimationEasing] = js.undefined
  /**
    * The onEnd prop specifies a function to run when the animation ends. If multiple animations are in the queue, it is called after the last animation.
    */
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object VictoryAnimationProps {
  @scala.inline
  def apply(
    children: /* style */ AnimationStyle => ReactElement = null,
    data: AnimationData = null,
    delay: Int | Double = null,
    duration: Int | Double = null,
    easing: AnimationEasing = null,
    onEnd: () => Unit = null
  ): VictoryAnimationProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction0(onEnd))
    __obj.asInstanceOf[VictoryAnimationProps]
  }
}

