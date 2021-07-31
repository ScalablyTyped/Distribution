package typings.webAnimationsJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends StObject {
  
  def animate(effect: js.Array[AnimationKeyFrame], timing: Double): Animation = js.native
  def animate(effect: js.Array[AnimationKeyFrame], timing: AnimationEffectTiming): Animation = js.native
  def animate(effect: Null, timing: Double): Animation = js.native
  def animate(effect: Null, timing: AnimationEffectTiming): Animation = js.native
  def animate(effect: AnimationKeyFrame, timing: Double): Animation = js.native
  def animate(effect: AnimationKeyFrame, timing: AnimationEffectTiming): Animation = js.native
  
  def getAnimations(): js.Array[Animation] = js.native
}
