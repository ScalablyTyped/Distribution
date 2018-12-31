package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryAnimationProps extends js.Object {
  /**
    * The child of should be a function that takes an object of tweened values and returns a component to render.
    * @param style
    */
  var children: js.UndefOr[
    js.Function1[/* style */ AnimationStyle, reactLib.reactMod.ReactNs.ReactElement[_]]
  ] = js.undefined
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
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of milliseconds the animation should take to complete.
    * @default 1000
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * The easing prop specifies an easing function name to use for tweening.
    * @default "quadInOut"
    */
  var easing: js.UndefOr[AnimationEasing] = js.undefined
  /**
    * The onEnd prop specifies a function to run when the animation ends. If multiple animations are in the queue, it is called after the last animation.
    */
  var onEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

