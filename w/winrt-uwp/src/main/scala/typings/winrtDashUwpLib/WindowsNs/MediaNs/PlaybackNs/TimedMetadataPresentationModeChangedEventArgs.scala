package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

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
  var track: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataTrack = js.native
}

