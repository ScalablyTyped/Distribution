package typings.subscriptionsTransportWs.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  originalError ? :any} */
trait FormatedError extends js.Object {
  var message: String
  var name: String
  var originalError: js.UndefOr[js.Any] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
}

object FormatedError {
  @scala.inline
  def apply(message: String, name: String, originalError: js.Any = null, stack: String = null): FormatedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (originalError != null) __obj.updateDynamic("originalError")(originalError.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatedError]
  }
}

