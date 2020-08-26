package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationActionOption extends js.Object {
  var transformOrigin: String = js.native
  var transition: AnimationTransition = js.native
}

object AnimationActionOption {
  @scala.inline
  def apply(transformOrigin: String, transition: AnimationTransition): AnimationActionOption = {
    val __obj = js.Dynamic.literal(transformOrigin = transformOrigin.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationActionOption]
  }
  @scala.inline
  implicit class AnimationActionOptionOps[Self <: AnimationActionOption] (val x: Self) extends AnyVal {
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
    def setTransformOrigin(value: String): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(value: AnimationTransition): Self = this.set("transition", value.asInstanceOf[js.Any])
  }
  
}

