package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaStreamSource.Starting event. */
trait MediaStreamSourceStartingEventArgs extends js.Object {
  /** Gets the object that represents the request to start accumulating MediaStreamSample data. */
  var request: MediaStreamSourceStartingRequest
}

object MediaStreamSourceStartingEventArgs {
  @scala.inline
  def apply(request: MediaStreamSourceStartingRequest): MediaStreamSourceStartingEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceStartingEventArgs]
  }
}

