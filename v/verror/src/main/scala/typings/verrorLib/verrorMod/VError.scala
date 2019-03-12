package typings
package verrorLib.verrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VError
  extends stdLib.Error {
  def cause(): js.UndefOr[stdLib.Error]
}

object VError {
  @scala.inline
  def apply(
    cause: () => js.UndefOr[stdLib.Error],
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): VError = {
    val __obj = js.Dynamic.literal(cause = js.Any.fromFunction0(cause), message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[VError]
  }
}

