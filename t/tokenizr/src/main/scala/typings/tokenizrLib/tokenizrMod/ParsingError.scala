package typings
package tokenizrLib.tokenizrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsingError
  extends stdLib.Error

object ParsingError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    toString: () => java.lang.String,
    stack: java.lang.String = null
  ): ParsingError = {
    val __obj = js.Dynamic.literal(message = message, name = name, toString = js.Any.fromFunction0(toString))
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ParsingError]
  }
}

