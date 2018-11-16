package typings
package webDashAnimationsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  def animate(effect: js.Array[AnimationKeyFrame], timing: scala.Double): Animation = js.native
  def animate(effect: js.Array[AnimationKeyFrame], timing: AnimationEffectTiming): Animation = js.native
  def animate(effect: AnimationKeyFrame, timing: scala.Double): Animation = js.native
  def animate(effect: AnimationKeyFrame, timing: AnimationEffectTiming): Animation = js.native
  def getAnimations(): js.Array[Animation] = js.native
}

