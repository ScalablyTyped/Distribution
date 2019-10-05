package typings.winrtDashUwp.Windows

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
    val __obj = js.Dynamic.literal(description = description, message = message, name = name, number = number)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[WinRTError]
  }
}

