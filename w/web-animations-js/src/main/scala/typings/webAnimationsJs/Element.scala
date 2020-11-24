package typings.webAnimationsJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends js.Object {
  
  def animate(effect: js.Array[AnimationKeyFrame], timing: Double): Animation = js.native
  def animate(effect: js.Array[AnimationKeyFrame], timing: AnimationEffectTiming): Animation = js.native
  def animate(effect: Null, timing: Double): Animation = js.native
  def animate(effect: Null, timing: AnimationEffectTiming): Animation = js.native
  def animate(effect: AnimationKeyFrame, timing: Double): Animation = js.native
  def animate(effect: AnimationKeyFrame, timing: AnimationEffectTiming): Animation = js.native
  
  def getAnimations(): js.Array[Animation] = js.native
}
