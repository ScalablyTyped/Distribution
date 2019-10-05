package typings.validator.ValidatorJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// options for isMobilePhone
trait IsMobilePhoneOptions extends js.Object {
  var strictMode: js.UndefOr[Boolean] = js.undefined
}

object IsMobilePhoneOptions {
  @scala.inline
  def apply(strictMode: js.UndefOr[Boolean] = js.undefined): IsMobilePhoneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strictMode)) __obj.updateDynamic("strictMode")(strictMode)
    __obj.asInstanceOf[IsMobilePhoneOptions]
  }
}

