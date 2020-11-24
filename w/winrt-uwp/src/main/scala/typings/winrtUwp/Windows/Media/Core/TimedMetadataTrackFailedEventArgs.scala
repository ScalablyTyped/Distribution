package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TimedMetadataTrack::TrackFailed event. */
@js.native
trait TimedMetadataTrackFailedEventArgs extends js.Object {
  
  /** Gets an object representing the error that occurred with the timed metadata track. */
  var error: TimedMetadataTrackError = js.native
}
object TimedMetadataTrackFailedEventArgs {
  
  @scala.inline
  def apply(error: TimedMetadataTrackError): TimedMetadataTrackFailedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedMetadataTrackFailedEventArgs]
  }
  
  @scala.inline
  implicit class TimedMetadataTrackFailedEventArgsOps[Self <: TimedMetadataTrackFailedEventArgs] (val x: Self) extends AnyVal {
    
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
  }
}
