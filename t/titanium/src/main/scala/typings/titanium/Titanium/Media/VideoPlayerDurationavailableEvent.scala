package typings.titanium.Titanium.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the video duration is available.
  */
@js.native
trait VideoPlayerDurationavailableEvent extends VideoPlayerBaseEvent {
  
  /**
    * Video duration, in milliseconds.
    */
  var duration: Double = js.native
}
object VideoPlayerDurationavailableEvent {
  
  @scala.inline
  def apply(duration: Double, source: VideoPlayer): VideoPlayerDurationavailableEvent = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerDurationavailableEvent]
  }
  
  @scala.inline
  implicit class VideoPlayerDurationavailableEventMutableBuilder[Self <: VideoPlayerDurationavailableEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
  }
}
