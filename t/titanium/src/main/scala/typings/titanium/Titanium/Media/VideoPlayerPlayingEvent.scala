package typings.titanium.Titanium.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the currently playing movie changes.
  */
@js.native
trait VideoPlayerPlayingEvent extends VideoPlayerBaseEvent {
  
  /**
    * URL of the media.
    */
  var url: String = js.native
}
object VideoPlayerPlayingEvent {
  
  @scala.inline
  def apply(source: VideoPlayer, url: String): VideoPlayerPlayingEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerPlayingEvent]
  }
  
  @scala.inline
  implicit class VideoPlayerPlayingEventMutableBuilder[Self <: VideoPlayerPlayingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
