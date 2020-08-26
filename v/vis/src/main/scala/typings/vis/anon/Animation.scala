package typings.vis.anon

import typings.vis.mod.TimelineAnimationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  var animation: TimelineAnimationOptions = js.native
  var focus: Boolean = js.native
}

object Animation {
  @scala.inline
  def apply(animation: TimelineAnimationOptions, focus: Boolean): Animation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimation(value: TimelineAnimationOptions): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
  }
  
}

