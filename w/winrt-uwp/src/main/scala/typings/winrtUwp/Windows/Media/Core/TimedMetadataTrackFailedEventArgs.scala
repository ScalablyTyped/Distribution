package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TimedMetadataTrack::TrackFailed event. */
trait TimedMetadataTrackFailedEventArgs extends js.Object {
  /** Gets an object representing the error that occurred with the timed metadata track. */
  var error: TimedMetadataTrackError
}

object TimedMetadataTrackFailedEventArgs {
  @scala.inline
  def apply(error: TimedMetadataTrackError): TimedMetadataTrackFailedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedMetadataTrackFailedEventArgs]
  }
}

