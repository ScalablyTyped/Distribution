package typings.validator.ValidatorJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// options for isEmail
trait IsEmailOptions extends js.Object {
  var allow_display_name: js.UndefOr[Boolean] = js.undefined
  var allow_utf8_local_part: js.UndefOr[Boolean] = js.undefined
  var require_display_name: js.UndefOr[Boolean] = js.undefined
  var require_tld: js.UndefOr[Boolean] = js.undefined
}

object IsEmailOptions {
  @scala.inline
  def apply(
    allow_display_name: js.UndefOr[Boolean] = js.undefined,
    allow_utf8_local_part: js.UndefOr[Boolean] = js.undefined,
    require_display_name: js.UndefOr[Boolean] = js.undefined,
    require_tld: js.UndefOr[Boolean] = js.undefined
  ): IsEmailOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_display_name)) __obj.updateDynamic("allow_display_name")(allow_display_name)
    if (!js.isUndefined(allow_utf8_local_part)) __obj.updateDynamic("allow_utf8_local_part")(allow_utf8_local_part)
    if (!js.isUndefined(require_display_name)) __obj.updateDynamic("require_display_name")(require_display_name)
    if (!js.isUndefined(require_tld)) __obj.updateDynamic("require_tld")(require_tld)
    __obj.asInstanceOf[IsEmailOptions]
  }
}

