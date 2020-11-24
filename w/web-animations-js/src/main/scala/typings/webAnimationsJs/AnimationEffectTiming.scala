package typings.webAnimationsJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationEffectTiming extends js.Object {
  
  var delay: js.UndefOr[Double] = js.native
  
  var direction: js.UndefOr[AnimationEffectTimingPlaybackDirection] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[String] = js.native
  
  var endDelay: js.UndefOr[Double] = js.native
  
  var fill: js.UndefOr[AnimationEffectTimingFillMode] = js.native
  
  var iterationStart: js.UndefOr[Double] = js.native
  
  var iterations: js.UndefOr[Double] = js.native
  
  var playbackRate: js.UndefOr[Double] = js.native
}
object AnimationEffectTiming {
  
  @scala.inline
  def apply(): AnimationEffectTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationEffectTiming]
  }
  
  @scala.inline
  implicit class AnimationEffectTimingOps[Self <: AnimationEffectTiming] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDirection(value: AnimationEffectTimingPlaybackDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setEndDelay(value: Double): Self = this.set("endDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDelay: Self = this.set("endDelay", js.undefined)
    
    @scala.inline
    def setFill(value: AnimationEffectTimingFillMode): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setIterationStart(value: Double): Self = this.set("iterationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterationStart: Self = this.set("iterationStart", js.undefined)
    
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = this.set("playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaybackRate: Self = this.set("playbackRate", js.undefined)
  }
}
