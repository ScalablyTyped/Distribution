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
  def apply(suppressErrors: js.UndefOr[Boolean] = js.undefined, timeout: js.UndefOr[Double] = js.undefined): WaitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitOptions]
  }
}

