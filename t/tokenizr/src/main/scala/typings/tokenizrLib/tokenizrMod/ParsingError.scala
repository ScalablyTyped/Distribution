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
    toString: js.Function0[java.lang.String],
    stack: java.lang.String = null
  ): ParsingError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("toString")(toString)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ParsingError]
  }
}

