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

