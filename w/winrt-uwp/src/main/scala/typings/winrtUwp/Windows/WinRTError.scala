package typings.winrtUwp.Windows

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WinRTError extends Error {
  var description: String
  var number: Double
}

object WinRTError {
  @scala.inline
  def apply(description: String, message: String, name: String, number: Double, stack: String = null): WinRTError = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[WinRTError]
  }
}

