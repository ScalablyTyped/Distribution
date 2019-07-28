package typings.xmldom.xmldomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var errorHandler: js.UndefOr[ErrorHandlerFunction | ErrorHandlerObject] = js.undefined
  var locator: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(errorHandler: ErrorHandlerFunction | ErrorHandlerObject = null, locator: js.Any = null): Options = {
    val __obj = js.Dynamic.literal()
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(errorHandler.asInstanceOf[js.Any])
    if (locator != null) __obj.updateDynamic("locator")(locator)
    __obj.asInstanceOf[Options]
  }
}

