package typings
package verrorLib.verrorMod.VErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Represents a collection of errors for the purpose of consumers that generally
  * only deal with one error.  Callers can extract the individual errors
  * contained in this object, but may also just treat it as a normal single
  * error, in which case a summary message will be printed.
  */
trait MultiError
  extends verrorLib.verrorMod.VError {
  def errors(): js.Array[stdLib.Error]
}

object MultiError {
  @scala.inline
  def apply(
    cause: js.Function0[js.UndefOr[stdLib.Error]],
    errors: js.Function0[js.Array[stdLib.Error]],
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): MultiError = {
    val __obj = js.Dynamic.literal(cause = cause, errors = errors, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[MultiError]
  }
}

