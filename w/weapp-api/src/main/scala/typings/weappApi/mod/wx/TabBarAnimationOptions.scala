package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBarAnimationOptions extends CommonCallbackOptions {
  //  是否需要动画效果
  var animation: Boolean = js.native
}

object TabBarAnimationOptions {
  @scala.inline
  def apply(animation: Boolean): TabBarAnimationOptions = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarAnimationOptions]
  }
  @scala.inline
  implicit class TabBarAnimationOptionsOps[Self <: TabBarAnimationOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
  }
  
}

