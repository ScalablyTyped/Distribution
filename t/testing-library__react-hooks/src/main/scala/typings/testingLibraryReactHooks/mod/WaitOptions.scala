package typings.testingLibraryReactHooks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitOptions extends js.Object {
  var suppressErrors: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object WaitOptions {
  @scala.inline
  def apply(suppressErrors: js.UndefOr[Boolean] = js.undefined, timeout: Int | Double = null): WaitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitOptions]
  }
}

