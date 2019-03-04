package typings
package winrtDashUwpLib.WindowsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WinRTError
  extends stdLib.Error {
  var description: java.lang.String
  var number: scala.Double
}

object WinRTError {
  @scala.inline
  def apply(
    description: java.lang.String,
    message: java.lang.String,
    name: java.lang.String,
    number: scala.Double,
    stack: java.lang.String = null
  ): WinRTError = {
    val __obj = js.Dynamic.literal(description = description, message = message, name = name, number = number)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[WinRTError]
  }
}

