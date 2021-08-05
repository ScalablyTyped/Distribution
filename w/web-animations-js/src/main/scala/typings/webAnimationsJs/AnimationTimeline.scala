package typings.webAnimationsJs

import typings.std.KeyframeEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationTimeline extends StObject {
  
  val currentTime: Double | Null
  
  def getAnimations(): js.Array[Animation]
  
  def play(effect: KeyframeEffect): Animation
}
object AnimationTimeline {
  
  inline def apply(getAnimations: () => js.Array[Animation], play: KeyframeEffect => Animation): AnimationTimeline = {
    val __obj = js.Dynamic.literal(getAnimations = js.Any.fromFunction0(getAnimations), play = js.Any.fromFunction1(play), currentTime = null)
    __obj.asInstanceOf[AnimationTimeline]
  }
  
  extension [Self <: AnimationTimeline](x: Self) {
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeNull: Self = StObject.set(x, "currentTime", null)
    
    inline def setGetAnimations(value: () => js.Array[Animation]): Self = StObject.set(x, "getAnimations", js.Any.fromFunction0(value))
    
    inline def setPlay(value: KeyframeEffect => Animation): Self = StObject.set(x, "play", js.Any.fromFunction1(value))
  }
}
