package typings.titanium.Titanium.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the natural size of the current movie is determined.
  */
@js.native
trait VideoPlayerNaturalsizeavailableEvent extends VideoPlayerBaseEvent {
  
  /**
    * Current value of the [naturalSize](Titanium.Media.VideoPlayer.naturalSize) property.
    */
  var naturalSize: Double = js.native
}
object VideoPlayerNaturalsizeavailableEvent {
  
  @scala.inline
  def apply(naturalSize: Double, source: VideoPlayer): VideoPlayerNaturalsizeavailableEvent = {
    val __obj = js.Dynamic.literal(naturalSize = naturalSize.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerNaturalsizeavailableEvent]
  }
  
  @scala.inline
  implicit class VideoPlayerNaturalsizeavailableEventMutableBuilder[Self <: VideoPlayerNaturalsizeavailableEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNaturalSize(value: Double): Self = StObject.set(x, "naturalSize", value.asInstanceOf[js.Any])
  }
}
