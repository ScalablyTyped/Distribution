package typings.webAnimationsJs

import typings.std.KeyframeEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationTimeline extends js.Object {
  val currentTime: Double | Null = js.native
  def getAnimations(): js.Array[Animation] = js.native
  def play(effect: KeyframeEffect): Animation = js.native
}

object AnimationTimeline {
  @scala.inline
  def apply(getAnimations: () => js.Array[Animation], play: KeyframeEffect => Animation): AnimationTimeline = {
    val __obj = js.Dynamic.literal(getAnimations = js.Any.fromFunction0(getAnimations), play = js.Any.fromFunction1(play))
    __obj.asInstanceOf[AnimationTimeline]
  }
  @scala.inline
  implicit class AnimationTimelineOps[Self <: AnimationTimeline] (val x: Self) extends AnyVal {
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
    def setGetAnimations(value: () => js.Array[Animation]): Self = this.set("getAnimations", js.Any.fromFunction0(value))
    @scala.inline
    def setPlay(value: KeyframeEffect => Animation): Self = this.set("play", js.Any.fromFunction1(value))
    @scala.inline
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTimeNull: Self = this.set("currentTime", null)
  }
  
}

