package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  /**
    * The duration (in milliseconds).
    */
  var duration: Double
  /**
    * The easing function.
    *
    * Available are:
    * linear, easeInQuad, easeOutQuad, easeInOutQuad, easeInCubic,
    * easeOutCubic, easeInOutCubic, easeInQuart, easeOutQuart, easeInOutQuart,
    * easeInQuint, easeOutQuint, easeInOutQuint.
    */
  var easingFunction: EasingFunction
}

object AnimationOptions {
  @scala.inline
  def apply(duration: Double, easingFunction: EasingFunction): AnimationOptions = {
    val __obj = js.Dynamic.literal(duration = duration, easingFunction = easingFunction)
  
    __obj.asInstanceOf[AnimationOptions]
  }
}

