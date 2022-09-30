package typings.victoryCore.anon

import typings.victoryCore.mod.Timer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionTimer extends StObject {
  
  var animationTimer: Timer
  
  var transitionTimer: Timer
}
object TransitionTimer {
  
  inline def apply(animationTimer: Timer, transitionTimer: Timer): TransitionTimer = {
    val __obj = js.Dynamic.literal(animationTimer = animationTimer.asInstanceOf[js.Any], transitionTimer = transitionTimer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionTimer]
  }
  
  extension [Self <: TransitionTimer](x: Self) {
    
    inline def setAnimationTimer(value: Timer): Self = StObject.set(x, "animationTimer", value.asInstanceOf[js.Any])
    
    inline def setTransitionTimer(value: Timer): Self = StObject.set(x, "transitionTimer", value.asInstanceOf[js.Any])
  }
}
