package typings
package termDashImgLib.termDashImgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedTerminalErrorClass
  extends stdLib.Error {
  @JSName("name")
  val name_UnsupportedTerminalErrorClass: termDashImgLib.termDashImgLibStrings.UnsupportedTerminalError
}

object UnsupportedTerminalErrorClass {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: termDashImgLib.termDashImgLibStrings.UnsupportedTerminalError,
    stack: java.lang.String = null
  ): UnsupportedTerminalErrorClass = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[UnsupportedTerminalErrorClass]
  }
}

