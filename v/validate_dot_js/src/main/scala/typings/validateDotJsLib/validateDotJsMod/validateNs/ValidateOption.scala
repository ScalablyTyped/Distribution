package typings
package validateDotJsLib.validateDotJsMod.validateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateOption extends js.Object {
  var format: js.UndefOr[java.lang.String] = js.undefined
  var fullMessages: js.UndefOr[scala.Boolean] = js.undefined
  var prettify: js.UndefOr[js.Function] = js.undefined
}

object ValidateOption {
  @scala.inline
  def apply(
    format: java.lang.String = null,
    fullMessages: js.UndefOr[scala.Boolean] = js.undefined,
    prettify: js.Function = null
  ): ValidateOption = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(fullMessages)) __obj.updateDynamic("fullMessages")(fullMessages)
    if (prettify != null) __obj.updateDynamic("prettify")(prettify)
    __obj.asInstanceOf[ValidateOption]
  }
}

