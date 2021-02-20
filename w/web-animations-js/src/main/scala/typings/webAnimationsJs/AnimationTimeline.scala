package typings.webAnimationsJs

import typings.std.KeyframeEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationTimeline extends StObject {
  
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
  implicit class AnimationTimelineMutableBuilder[Self <: AnimationTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeNull: Self = StObject.set(x, "currentTime", null)
    
    @scala.inline
    def setGetAnimations(value: () => js.Array[Animation]): Self = StObject.set(x, "getAnimations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlay(value: KeyframeEffect => Animation): Self = StObject.set(x, "play", js.Any.fromFunction1(value))
  }
}
