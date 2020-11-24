package typings.webAnimationsJs

import typings.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationPlaybackEventInit extends EventInit {
  
  var currentTime: js.UndefOr[Double | Null] = js.native
  
  var timelineTime: js.UndefOr[Double | Null] = js.native
}
object AnimationPlaybackEventInit {
  
  @scala.inline
  def apply(): AnimationPlaybackEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationPlaybackEventInit]
  }
  
  @scala.inline
  implicit class AnimationPlaybackEventInitOps[Self <: AnimationPlaybackEventInit] (val x: Self) extends AnyVal {
    
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
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTime: Self = this.set("currentTime", js.undefined)
    
    @scala.inline
    def setCurrentTimeNull: Self = this.set("currentTime", null)
    
    @scala.inline
    def setTimelineTime(value: Double): Self = this.set("timelineTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimelineTime: Self = this.set("timelineTime", js.undefined)
    
    @scala.inline
    def setTimelineTimeNull: Self = this.set("timelineTime", null)
  }
}
