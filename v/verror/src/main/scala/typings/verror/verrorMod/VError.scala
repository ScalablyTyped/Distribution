package typings.verror.verrorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VError extends Error {
  def cause(): js.UndefOr[Error]
}

object VError {
  @scala.inline
  def apply(cause: () => js.UndefOr[Error], message: String, name: String, stack: String = null): VError = {
    val __obj = js.Dynamic.literal(cause = js.Any.fromFunction0(cause), message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[VError]
  }
}

