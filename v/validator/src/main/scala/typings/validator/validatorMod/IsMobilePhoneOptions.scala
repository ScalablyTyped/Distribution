package typings.validator.validatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsMobilePhoneOptions extends js.Object {
  /**
    * If this is set to `true`, the mobile phone number must be supplied with the country code and therefore must start with `+`.
    *
    * @default false
    */
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

