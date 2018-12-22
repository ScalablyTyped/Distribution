package typings
package webDashAnimationsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  def animate(): Animation = js.native
  def animate(effect: js.Array[AnimationKeyFrame | stdLib.Keyframe], timing: scala.Double): Animation = js.native
  def animate(effect: js.Array[AnimationKeyFrame], timing: AnimationEffectTiming): Animation = js.native
  def animate(effect: scala.Null, timing: scala.Double): Animation = js.native
  def animate(effect: scala.Null, timing: AnimationEffectTiming): Animation = js.native
  def animate(effect: AnimationKeyFrame, timing: scala.Double): Animation = js.native
  def animate(effect: AnimationKeyFrame, timing: AnimationEffectTiming): Animation = js.native
  def animate(keyframes: js.Array[stdLib.Keyframe]): Animation = js.native
  def animate(keyframes: js.Array[stdLib.Keyframe], options: stdLib.KeyframeAnimationOptions): Animation = js.native
  def animate(keyframes: scala.Null, options: stdLib.KeyframeAnimationOptions): Animation = js.native
  def animate(keyframes: stdLib.PropertyIndexedKeyframes): Animation = js.native
  def animate(keyframes: stdLib.PropertyIndexedKeyframes, options: scala.Double): Animation = js.native
  def animate(keyframes: stdLib.PropertyIndexedKeyframes, options: stdLib.KeyframeAnimationOptions): Animation = js.native
  def getAnimations(): js.Array[Animation] = js.native
}

