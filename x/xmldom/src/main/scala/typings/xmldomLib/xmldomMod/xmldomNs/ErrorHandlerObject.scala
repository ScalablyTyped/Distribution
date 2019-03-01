package typings
package xmldomLib.xmldomMod.xmldomNs

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
    error: js.Function1[/* msg */ js.Any, _] = null,
    fatalError: js.Function1[/* msg */ js.Any, _] = null,
    warning: js.Function1[/* msg */ js.Any, _] = null
  ): ErrorHandlerObject = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (fatalError != null) __obj.updateDynamic("fatalError")(fatalError)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[ErrorHandlerObject]
  }
}

