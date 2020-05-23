package typings.winrtUwp.global.Windows.Media.Playback

import typings.winrtUwp.Windows.Media.Core.TimedMetadataTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaPlaybackTimedMetadataTrackList::PresentationModeChanged event. */
@JSGlobal("Windows.Media.Playback.TimedMetadataPresentationModeChangedEventArgs")
@js.native
abstract class TimedMetadataPresentationModeChangedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Playback.TimedMetadataPresentationModeChangedEventArgs {
  /** Gets the new presentation mode. */
  /* CompleteClass */
  override var newPresentationMode: typings.winrtUwp.Windows.Media.Playback.TimedMetadataTrackPresentationMode = js.native
  /** Gets the old presentation mode. */
  /* CompleteClass */
  override var oldPresentationMode: typings.winrtUwp.Windows.Media.Playback.TimedMetadataTrackPresentationMode = js.native
  /** Gets the TimedMetadataTrack associated with the presentation mode change. */
  /* CompleteClass */
  override var track: TimedMetadataTrack = js.native
}

