package typings.xmldom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorHandlerObject extends js.Object {
  var error: js.UndefOr[js.Function1[/* msg */ js.Any, _]] = js.undefined
  var fatalError: js.UndefOr[js.Function1[/* msg */ js.Any, _]] = js.undefined
  var warning: js.UndefOr[js.Function1[/* msg */ js.Any, _]] = js.undefined
}

object ErrorHandlerObject {
  @scala.inline
  def apply(
    error: /* msg */ js.Any => _ = null,
    fatalError: /* msg */ js.Any => _ = null,
    warning: /* msg */ js.Any => _ = null
  ): ErrorHandlerObject = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (fatalError != null) __obj.updateDynamic("fatalError")(js.Any.fromFunction1(fatalError))
    if (warning != null) __obj.updateDynamic("warning")(js.Any.fromFunction1(warning))
    __obj.asInstanceOf[ErrorHandlerObject]
  }
}

