package typings.webAnimationsJs

import typings.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationPlaybackEventInit
  extends StObject
     with EventInit {
  
  var currentTime: js.UndefOr[Double | Null] = js.undefined
  
  var timelineTime: js.UndefOr[Double | Null] = js.undefined
}
object AnimationPlaybackEventInit {
  
  @scala.inline
  def apply(): AnimationPlaybackEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationPlaybackEventInit]
  }
  
  @scala.inline
  implicit class AnimationPlaybackEventInitMutableBuilder[Self <: AnimationPlaybackEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeNull: Self = StObject.set(x, "currentTime", null)
    
    @scala.inline
    def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    @scala.inline
    def setTimelineTime(value: Double): Self = StObject.set(x, "timelineTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineTimeNull: Self = StObject.set(x, "timelineTime", null)
    
    @scala.inline
    def setTimelineTimeUndefined: Self = StObject.set(x, "timelineTime", js.undefined)
  }
}
