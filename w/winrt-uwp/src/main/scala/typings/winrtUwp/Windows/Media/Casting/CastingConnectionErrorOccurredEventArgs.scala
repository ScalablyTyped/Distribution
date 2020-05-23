package typings.winrtUwp.Windows.Media.Casting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents arguments for the ErrorOccurred event from the CastingConnection */
trait CastingConnectionErrorOccurredEventArgs extends js.Object {
  /** Gets the particular error that triggered the casting error event, ErrorOccurred . */
  var errorStatus: CastingConnectionErrorStatus
  /** Gets human-readable message to accompany the error status code, ErrorStatus . */
  var message: String
}

object CastingConnectionErrorOccurredEventArgs {
  @scala.inline
  def apply(errorStatus: CastingConnectionErrorStatus, message: String): CastingConnectionErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(errorStatus = errorStatus.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastingConnectionErrorOccurredEventArgs]
  }
}

