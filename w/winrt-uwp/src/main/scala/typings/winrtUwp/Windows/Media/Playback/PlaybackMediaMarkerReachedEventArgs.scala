package typings.winrtUwp.Windows.Media.Playback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for PlaybackMediaMarkerReached events. */
trait PlaybackMediaMarkerReachedEventArgs extends StObject {
  
  /** Gets the PlaybackMediaMarker that was reached. */
  var playbackMediaMarker: PlaybackMediaMarker
}
object PlaybackMediaMarkerReachedEventArgs {
  
  inline def apply(playbackMediaMarker: PlaybackMediaMarker): PlaybackMediaMarkerReachedEventArgs = {
    val __obj = js.Dynamic.literal(playbackMediaMarker = playbackMediaMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackMediaMarkerReachedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaybackMediaMarkerReachedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setPlaybackMediaMarker(value: PlaybackMediaMarker): Self = StObject.set(x, "playbackMediaMarker", value.asInstanceOf[js.Any])
  }
}
