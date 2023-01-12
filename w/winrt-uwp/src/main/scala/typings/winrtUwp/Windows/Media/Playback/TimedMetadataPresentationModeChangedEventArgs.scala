package typings.winrtUwp.Windows.Media.Playback

import typings.winrtUwp.Windows.Media.Core.TimedMetadataTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaPlaybackTimedMetadataTrackList::PresentationModeChanged event. */
trait TimedMetadataPresentationModeChangedEventArgs extends StObject {
  
  /** Gets the new presentation mode. */
  var newPresentationMode: TimedMetadataTrackPresentationMode
  
  /** Gets the old presentation mode. */
  var oldPresentationMode: TimedMetadataTrackPresentationMode
  
  /** Gets the TimedMetadataTrack associated with the presentation mode change. */
  var track: TimedMetadataTrack
}
object TimedMetadataPresentationModeChangedEventArgs {
  
  inline def apply(
    newPresentationMode: TimedMetadataTrackPresentationMode,
    oldPresentationMode: TimedMetadataTrackPresentationMode,
    track: TimedMetadataTrack
  ): TimedMetadataPresentationModeChangedEventArgs = {
    val __obj = js.Dynamic.literal(newPresentationMode = newPresentationMode.asInstanceOf[js.Any], oldPresentationMode = oldPresentationMode.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedMetadataPresentationModeChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimedMetadataPresentationModeChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setNewPresentationMode(value: TimedMetadataTrackPresentationMode): Self = StObject.set(x, "newPresentationMode", value.asInstanceOf[js.Any])
    
    inline def setOldPresentationMode(value: TimedMetadataTrackPresentationMode): Self = StObject.set(x, "oldPresentationMode", value.asInstanceOf[js.Any])
    
    inline def setTrack(value: TimedMetadataTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
