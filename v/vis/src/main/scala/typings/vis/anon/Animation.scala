package typings.vis.anon

import typings.vis.mod.TimelineAnimationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var animation: TimelineAnimationOptions
  var focus: Boolean
}

object Animation {
  @scala.inline
  def apply(animation: TimelineAnimationOptions, focus: Boolean): Animation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
}

