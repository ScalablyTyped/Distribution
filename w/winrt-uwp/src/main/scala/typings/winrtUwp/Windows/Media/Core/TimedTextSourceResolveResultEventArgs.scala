package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TimedTextSource::Resolved event. */
trait TimedTextSourceResolveResultEventArgs extends js.Object {
  /** Gets an object representing the asynchronous error that occurred when the TimedTextSource was resolved. */
  var error: TimedMetadataTrackError
  /** Gets the list of TimedMetadataTrack objects resulting from resolving the TimedTextSource . */
  var tracks: IVectorView[TimedMetadataTrack]
}

object TimedTextSourceResolveResultEventArgs {
  @scala.inline
  def apply(error: TimedMetadataTrackError, tracks: IVectorView[TimedMetadataTrack]): TimedTextSourceResolveResultEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextSourceResolveResultEventArgs]
  }
}

