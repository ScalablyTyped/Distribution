package typings.victoryCore.anon

import typings.victoryCore.libVictoryUtilTimerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationTimer extends StObject {
  
  var animationTimer: default
  
  var transitionTimer: default
}
object AnimationTimer {
  
  inline def apply(animationTimer: default, transitionTimer: default): AnimationTimer = {
    val __obj = js.Dynamic.literal(animationTimer = animationTimer.asInstanceOf[js.Any], transitionTimer = transitionTimer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTimer]
  }
  
  extension [Self <: AnimationTimer](x: Self) {
    
    inline def setAnimationTimer(value: default): Self = StObject.set(x, "animationTimer", value.asInstanceOf[js.Any])
    
    inline def setTransitionTimer(value: default): Self = StObject.set(x, "transitionTimer", value.asInstanceOf[js.Any])
  }
}
