package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data for the SampleRequested event. */
@js.native
trait MediaStreamSourceSampleRequestedEventArgs extends js.Object {
  /** Gets the object that represents the request for a MediaStreamSample . */
  var request: MediaStreamSourceSampleRequest = js.native
}

object MediaStreamSourceSampleRequestedEventArgs {
  @scala.inline
  def apply(request: MediaStreamSourceSampleRequest): MediaStreamSourceSampleRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceSampleRequestedEventArgs]
  }
  @scala.inline
  implicit class MediaStreamSourceSampleRequestedEventArgsOps[Self <: MediaStreamSourceSampleRequestedEventArgs] (val x: Self) extends AnyVal {
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
    def setRequest(value: MediaStreamSourceSampleRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

