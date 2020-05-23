package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data for the SampleRequested event. */
trait MediaStreamSourceSampleRequestedEventArgs extends js.Object {
  /** Gets the object that represents the request for a MediaStreamSample . */
  var request: MediaStreamSourceSampleRequest
}

object MediaStreamSourceSampleRequestedEventArgs {
  @scala.inline
  def apply(request: MediaStreamSourceSampleRequest): MediaStreamSourceSampleRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceSampleRequestedEventArgs]
  }
}

