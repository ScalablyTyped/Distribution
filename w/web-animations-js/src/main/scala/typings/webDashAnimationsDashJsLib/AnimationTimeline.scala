package typings
package webDashAnimationsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationTimeline extends js.Object {
  val currentTime: scala.Double | scala.Null
  def getAnimations(): js.Array[Animation]
  def play(effect: stdLib.KeyframeEffect): Animation
}

object AnimationTimeline {
  @scala.inline
  def apply(
    getAnimations: () => js.Array[Animation],
    play: stdLib.KeyframeEffect => Animation,
    currentTime: scala.Int | scala.Double = null
  ): AnimationTimeline = {
    val __obj = js.Dynamic.literal(getAnimations = js.Any.fromFunction0(getAnimations), play = js.Any.fromFunction1(play))
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTimeline]
  }
}

