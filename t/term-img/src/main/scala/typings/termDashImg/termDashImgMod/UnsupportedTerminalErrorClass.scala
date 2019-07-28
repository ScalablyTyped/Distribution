package typings.termDashImg.termDashImgMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedTerminalErrorClass extends Error {
  @JSName("name")
  val name_UnsupportedTerminalErrorClass: typings.termDashImg.termDashImgStrings.UnsupportedTerminalError
}

object UnsupportedTerminalErrorClass {
  @scala.inline
  def apply(
    message: String,
    name: typings.termDashImg.termDashImgStrings.UnsupportedTerminalError,
    stack: String = null
  ): UnsupportedTerminalErrorClass = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[UnsupportedTerminalErrorClass]
  }
}

