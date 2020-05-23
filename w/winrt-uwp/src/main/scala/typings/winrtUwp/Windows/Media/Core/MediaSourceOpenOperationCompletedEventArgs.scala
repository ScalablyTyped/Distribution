package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaSource::MediaSourceOpenOperationCompleted event. */
trait MediaSourceOpenOperationCompletedEventArgs extends js.Object {
  /** Represents the error that occurred while asynchronously opening the MediaSource . */
  var error: MediaSourceError
}

object MediaSourceOpenOperationCompletedEventArgs {
  @scala.inline
  def apply(error: MediaSourceError): MediaSourceOpenOperationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceOpenOperationCompletedEventArgs]
  }
}

