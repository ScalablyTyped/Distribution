package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaStreamSource.Closed event. */
trait MediaStreamSourceClosedEventArgs extends js.Object {
  /** Gets the object that represents the notification that the MediaStreamSource has been closed. */
  var request: MediaStreamSourceClosedRequest
}

object MediaStreamSourceClosedEventArgs {
  @scala.inline
  def apply(request: MediaStreamSourceClosedRequest): MediaStreamSourceClosedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceClosedEventArgs]
  }
}

