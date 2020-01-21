package typings.validateJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncValidateOption extends js.Object {
  var cleanAttributes: js.UndefOr[Boolean] = js.undefined
  var prettify: js.UndefOr[js.Function] = js.undefined
  var wrapErrors: js.UndefOr[js.Function] = js.undefined
}

object AsyncValidateOption {
  @scala.inline
  def apply(
    cleanAttributes: js.UndefOr[Boolean] = js.undefined,
    prettify: js.Function = null,
    wrapErrors: js.Function = null
  ): AsyncValidateOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cleanAttributes)) __obj.updateDynamic("cleanAttributes")(cleanAttributes.asInstanceOf[js.Any])
    if (prettify != null) __obj.updateDynamic("prettify")(prettify.asInstanceOf[js.Any])
    if (wrapErrors != null) __obj.updateDynamic("wrapErrors")(wrapErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncValidateOption]
  }
}

