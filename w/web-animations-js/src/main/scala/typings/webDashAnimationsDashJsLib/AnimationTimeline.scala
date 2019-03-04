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
    getAnimations: js.Function0[js.Array[Animation]],
    play: js.Function1[stdLib.KeyframeEffect, Animation],
    currentTime: scala.Int | scala.Double = null
  ): AnimationTimeline = {
    val __obj = js.Dynamic.literal(getAnimations = getAnimations, play = play)
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTimeline]
  }
}

