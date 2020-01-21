package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TimedMetadataTrack::TrackFailed event. */
@JSGlobal("Windows.Media.Core.TimedMetadataTrackFailedEventArgs")
@js.native
abstract class TimedMetadataTrackFailedEventArgs () extends js.Object {
  /** Gets an object representing the error that occurred with the timed metadata track. */
  var error: TimedMetadataTrackError = js.native
}

