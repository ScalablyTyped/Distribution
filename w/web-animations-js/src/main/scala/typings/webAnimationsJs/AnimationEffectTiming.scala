package typings.webAnimationsJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationEffectTiming extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var direction: js.UndefOr[AnimationEffectTimingPlaybackDirection] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[String] = js.undefined
  
  var endDelay: js.UndefOr[Double] = js.undefined
  
  var fill: js.UndefOr[AnimationEffectTimingFillMode] = js.undefined
  
  var iterationStart: js.UndefOr[Double] = js.undefined
  
  var iterations: js.UndefOr[Double] = js.undefined
  
  var playbackRate: js.UndefOr[Double] = js.undefined
}
object AnimationEffectTiming {
  
  @scala.inline
  def apply(): AnimationEffectTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationEffectTiming]
  }
  
  @scala.inline
  implicit class AnimationEffectTimingMutableBuilder[Self <: AnimationEffectTiming] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDirection(value: AnimationEffectTimingPlaybackDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setEndDelay(value: Double): Self = StObject.set(x, "endDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDelayUndefined: Self = StObject.set(x, "endDelay", js.undefined)
    
    @scala.inline
    def setFill(value: AnimationEffectTimingFillMode): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setIterationStart(value: Double): Self = StObject.set(x, "iterationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationStartUndefined: Self = StObject.set(x, "iterationStart", js.undefined)
    
    @scala.inline
    def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
  }
}
