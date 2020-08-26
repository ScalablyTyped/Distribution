package typings.webAnimationsJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationEffectReadOnly extends js.Object {
  val timing: Double = js.native
  def getComputedTiming(): ComputedTimingProperties = js.native
}

object AnimationEffectReadOnly {
  @scala.inline
  def apply(getComputedTiming: () => ComputedTimingProperties, timing: Double): AnimationEffectReadOnly = {
    val __obj = js.Dynamic.literal(getComputedTiming = js.Any.fromFunction0(getComputedTiming), timing = timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEffectReadOnly]
  }
  @scala.inline
  implicit class AnimationEffectReadOnlyOps[Self <: AnimationEffectReadOnly] (val x: Self) extends AnyVal {
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
    def setGetComputedTiming(value: () => ComputedTimingProperties): Self = this.set("getComputedTiming", js.Any.fromFunction0(value))
    @scala.inline
    def setTiming(value: Double): Self = this.set("timing", value.asInstanceOf[js.Any])
  }
  
}

