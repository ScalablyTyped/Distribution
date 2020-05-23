package typings.winrtUwp.Windows.Media.Playback

import typings.winrtUwp.Windows.Media.Core.TimedMetadataTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaPlaybackTimedMetadataTrackList::PresentationModeChanged event. */
trait TimedMetadataPresentationModeChangedEventArgs extends js.Object {
  /** Gets the new presentation mode. */
  var newPresentationMode: TimedMetadataTrackPresentationMode
  /** Gets the old presentation mode. */
  var oldPresentationMode: TimedMetadataTrackPresentationMode
  /** Gets the TimedMetadataTrack associated with the presentation mode change. */
  var track: TimedMetadataTrack
}

object TimedMetadataPresentationModeChangedEventArgs {
  @scala.inline
  def apply(
    newPresentationMode: TimedMetadataTrackPresentationMode,
    oldPresentationMode: TimedMetadataTrackPresentationMode,
    track: TimedMetadataTrack
  ): TimedMetadataPresentationModeChangedEventArgs = {
    val __obj = js.Dynamic.literal(newPresentationMode = newPresentationMode.asInstanceOf[js.Any], oldPresentationMode = oldPresentationMode.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedMetadataPresentationModeChangedEventArgs]
  }
}

