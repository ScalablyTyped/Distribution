package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the Live Photo playback starts.
  */
@js.native
trait LivePhotoViewStartEvent extends LivePhotoViewBaseEvent {
  
  /**
    * Returns the `playbackStyle` that was provided to start the playback.
    */
  var playbackStyle: Double = js.native
}
object LivePhotoViewStartEvent {
  
  @scala.inline
  def apply(playbackStyle: Double, source: LivePhotoView): LivePhotoViewStartEvent = {
    val __obj = js.Dynamic.literal(playbackStyle = playbackStyle.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LivePhotoViewStartEvent]
  }
  
  @scala.inline
  implicit class LivePhotoViewStartEventMutableBuilder[Self <: LivePhotoViewStartEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaybackStyle(value: Double): Self = StObject.set(x, "playbackStyle", value.asInstanceOf[js.Any])
  }
}
