package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an object to be used by the MediaStreamSource.closed event to provide information to the application. */
trait MediaStreamSourceClosedRequest extends js.Object {
  /** Gets the reason why the media stream source was closed. */
  var reason: MediaStreamSourceClosedReason
}

object MediaStreamSourceClosedRequest {
  @scala.inline
  def apply(reason: MediaStreamSourceClosedReason): MediaStreamSourceClosedRequest = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceClosedRequest]
  }
}

