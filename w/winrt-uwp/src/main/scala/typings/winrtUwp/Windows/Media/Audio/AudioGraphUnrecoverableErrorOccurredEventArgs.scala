package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents arguments for an UnrecoverableErrorOccurred event. */
trait AudioGraphUnrecoverableErrorOccurredEventArgs extends js.Object {
  /** Gets the error associated with the event. */
  var error: AudioGraphUnrecoverableError
}

object AudioGraphUnrecoverableErrorOccurredEventArgs {
  @scala.inline
  def apply(error: AudioGraphUnrecoverableError): AudioGraphUnrecoverableErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioGraphUnrecoverableErrorOccurredEventArgs]
  }
}

