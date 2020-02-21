package typings.web3CoreHelpers.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionError extends Error {
  var receipt: js.Object
}

object TransactionError {
  @scala.inline
  def apply(message: String, name: String, receipt: js.Object, stack: String = null): TransactionError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], receipt = receipt.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionError]
  }
}

