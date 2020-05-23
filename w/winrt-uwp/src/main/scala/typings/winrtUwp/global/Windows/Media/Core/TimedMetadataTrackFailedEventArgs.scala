package typings.winrtUwp.global.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TimedMetadataTrack::TrackFailed event. */
@JSGlobal("Windows.Media.Core.TimedMetadataTrackFailedEventArgs")
@js.native
abstract class TimedMetadataTrackFailedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Core.TimedMetadataTrackFailedEventArgs {
  /** Gets an object representing the error that occurred with the timed metadata track. */
  /* CompleteClass */
  override var error: typings.winrtUwp.Windows.Media.Core.TimedMetadataTrackError = js.native
}

