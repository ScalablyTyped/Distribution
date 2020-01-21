package typings.validateJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateOption extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var fullMessages: js.UndefOr[Boolean] = js.undefined
  var prettify: js.UndefOr[js.Function] = js.undefined
}

object ValidateOption {
  @scala.inline
  def apply(
    format: String = null,
    fullMessages: js.UndefOr[Boolean] = js.undefined,
    prettify: js.Function = null
  ): ValidateOption = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(fullMessages)) __obj.updateDynamic("fullMessages")(fullMessages.asInstanceOf[js.Any])
    if (prettify != null) __obj.updateDynamic("prettify")(prettify.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateOption]
  }
}

