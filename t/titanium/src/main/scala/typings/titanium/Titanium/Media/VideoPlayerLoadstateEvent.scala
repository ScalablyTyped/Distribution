package typings.titanium.Titanium.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the network [loadState](Titanium.Media.VideoPlayer.loadState) changes.
  */
@js.native
trait VideoPlayerLoadstateEvent extends VideoPlayerBaseEvent {
  
  /**
    * Current value of the [loadState](Titanium.Media.VideoPlayer.loadState) property.
    */
  var loadState: Double = js.native
}
object VideoPlayerLoadstateEvent {
  
  @scala.inline
  def apply(loadState: Double, source: VideoPlayer): VideoPlayerLoadstateEvent = {
    val __obj = js.Dynamic.literal(loadState = loadState.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerLoadstateEvent]
  }
  
  @scala.inline
  implicit class VideoPlayerLoadstateEventMutableBuilder[Self <: VideoPlayerLoadstateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadState(value: Double): Self = StObject.set(x, "loadState", value.asInstanceOf[js.Any])
  }
}
