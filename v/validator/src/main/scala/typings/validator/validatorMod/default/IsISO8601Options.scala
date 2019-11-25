package typings.validator.validatorMod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsISO8601Options extends js.Object {
  /**
    * If `strict` is `true`, performs additional checks for valid dates,
    * e.g. invalidates dates like `2009-02-29`.
    *
    * @default false
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object IsISO8601Options {
  @scala.inline
  def apply(strict: js.UndefOr[Boolean] = js.undefined): IsISO8601Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsISO8601Options]
  }
}

