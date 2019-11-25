package typings.vis

import typings.vis.visMod.TimelineAnimationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animation extends js.Object {
  var animation: TimelineAnimationOptions
  var focus: Boolean
}

object Anon_Animation {
  @scala.inline
  def apply(animation: TimelineAnimationOptions, focus: Boolean): Anon_Animation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Animation]
  }
}

