package typings.titanium.Titanium.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the [playbackState](Titanium.Media.VideoPlayer.playbackState) changes.
  */
@js.native
trait VideoPlayerPlaybackstateEvent extends VideoPlayerBaseEvent {
  
  /**
    * Current value of the [playbackState](Titanium.Media.VideoPlayer.playbackState) property.
    */
  var playbackState: Double = js.native
}
object VideoPlayerPlaybackstateEvent {
  
  @scala.inline
  def apply(playbackState: Double, source: VideoPlayer): VideoPlayerPlaybackstateEvent = {
    val __obj = js.Dynamic.literal(playbackState = playbackState.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerPlaybackstateEvent]
  }
  
  @scala.inline
  implicit class VideoPlayerPlaybackstateEventMutableBuilder[Self <: VideoPlayerPlaybackstateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaybackState(value: Double): Self = StObject.set(x, "playbackState", value.asInstanceOf[js.Any])
  }
}
