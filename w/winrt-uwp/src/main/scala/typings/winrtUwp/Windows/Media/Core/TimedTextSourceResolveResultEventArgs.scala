package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TimedTextSource::Resolved event. */
@js.native
trait TimedTextSourceResolveResultEventArgs extends js.Object {
  /** Gets an object representing the asynchronous error that occurred when the TimedTextSource was resolved. */
  var error: TimedMetadataTrackError = js.native
  /** Gets the list of TimedMetadataTrack objects resulting from resolving the TimedTextSource . */
  var tracks: IVectorView[TimedMetadataTrack] = js.native
}

object TimedTextSourceResolveResultEventArgs {
  @scala.inline
  def apply(error: TimedMetadataTrackError, tracks: IVectorView[TimedMetadataTrack]): TimedTextSourceResolveResultEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextSourceResolveResultEventArgs]
  }
  @scala.inline
  implicit class TimedTextSourceResolveResultEventArgsOps[Self <: TimedTextSourceResolveResultEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: TimedMetadataTrackError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracks(value: IVectorView[TimedMetadataTrack]): Self = this.set("tracks", value.asInstanceOf[js.Any])
  }
  
}

