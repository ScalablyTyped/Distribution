package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationTransition extends js.Object {
  var delay: scala.Double
  var duration: scala.Double
  var timingFunction: TimingFunction
}

object AnimationTransition {
  @scala.inline
  def apply(delay: scala.Double, duration: scala.Double, timingFunction: TimingFunction): AnimationTransition = {
    val __obj = js.Dynamic.literal(delay = delay, duration = duration, timingFunction = timingFunction)
  
    __obj.asInstanceOf[AnimationTransition]
  }
}

