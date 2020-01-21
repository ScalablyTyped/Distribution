package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationTransition extends js.Object {
  var delay: Double
  var duration: Double
  var timingFunction: TimingFunction
}

object AnimationTransition {
  @scala.inline
  def apply(delay: Double, duration: Double, timingFunction: TimingFunction): AnimationTransition = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timingFunction = timingFunction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnimationTransition]
  }
}

