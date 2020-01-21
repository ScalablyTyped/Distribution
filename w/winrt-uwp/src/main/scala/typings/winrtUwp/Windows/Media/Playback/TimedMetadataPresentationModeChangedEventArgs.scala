package typings.winrtUwp.Windows.Media.Playback

import typings.winrtUwp.Windows.Media.Core.TimedMetadataTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaPlaybackTimedMetadataTrackList::PresentationModeChanged event. */
@JSGlobal("Windows.Media.Playback.TimedMetadataPresentationModeChangedEventArgs")
@js.native
abstract class TimedMetadataPresentationModeChangedEventArgs () extends js.Object {
  /** Gets the new presentation mode. */
  var newPresentationMode: TimedMetadataTrackPresentationMode = js.native
  /** Gets the old presentation mode. */
  var oldPresentationMode: TimedMetadataTrackPresentationMode = js.native
  /** Gets the TimedMetadataTrack associated with the presentation mode change. */
  var track: TimedMetadataTrack = js.native
}

