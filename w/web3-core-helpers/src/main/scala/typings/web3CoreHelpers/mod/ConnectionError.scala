package typings.web3CoreHelpers.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionError extends Error {
  var code: js.UndefOr[String] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
}

object ConnectionError {
  @scala.inline
  def apply(message: String, name: String, code: String = null, reason: String = null, stack: String = null): ConnectionError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionError]
  }
}

