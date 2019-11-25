package typings.validator.validatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsISSNOptions extends js.Object {
  /**
    * If `case_sensitive` is `true`, ISSNs with a lowercase `x` as the check digit are rejected.
    *
    * @default false
    */
  var case_sensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var require_hyphen: js.UndefOr[Boolean] = js.undefined
}

object IsISSNOptions {
  @scala.inline
  def apply(
    case_sensitive: js.UndefOr[Boolean] = js.undefined,
    require_hyphen: js.UndefOr[Boolean] = js.undefined
  ): IsISSNOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(case_sensitive)) __obj.updateDynamic("case_sensitive")(case_sensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(require_hyphen)) __obj.updateDynamic("require_hyphen")(require_hyphen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsISSNOptions]
  }
}

