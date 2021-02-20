package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PlaybackPositionChangeRequested event. */
@js.native
trait PlaybackPositionChangeRequestedEventArgs extends StObject {
  
  /** Gets a value indicating the requested offset into the media item. */
  var requestedPlaybackPosition: Double = js.native
}
object PlaybackPositionChangeRequestedEventArgs {
  
  @scala.inline
  def apply(requestedPlaybackPosition: Double): PlaybackPositionChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(requestedPlaybackPosition = requestedPlaybackPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackPositionChangeRequestedEventArgs]
  }
  
  @scala.inline
  implicit class PlaybackPositionChangeRequestedEventArgsMutableBuilder[Self <: PlaybackPositionChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestedPlaybackPosition(value: Double): Self = StObject.set(x, "requestedPlaybackPosition", value.asInstanceOf[js.Any])
  }
}
