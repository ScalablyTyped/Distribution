package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineAnimationOptions extends js.Object {
  var animation: js.UndefOr[TimelineAnimationType] = js.native
}

object TimelineAnimationOptions {
  @scala.inline
  def apply(): TimelineAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineAnimationOptions]
  }
  @scala.inline
  implicit class TimelineAnimationOptionsOps[Self <: TimelineAnimationOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: TimelineAnimationType): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
  }
  
}

