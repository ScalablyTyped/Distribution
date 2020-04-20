package typings.vis

import typings.vis.mod.TimelineAnimationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimation extends js.Object {
  var animation: TimelineAnimationOptions
  var focus: Boolean
}

object AnonAnimation {
  @scala.inline
  def apply(animation: TimelineAnimationOptions, focus: Boolean): AnonAnimation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimation]
  }
}

