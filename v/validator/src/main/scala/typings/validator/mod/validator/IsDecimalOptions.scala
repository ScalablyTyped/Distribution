package typings.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsDecimalOptions extends js.Object {
  /**
    * `decimal_digits` is given as a range like `'1,3'`,
    * a specific value like `'3'` or min like `'1,'`
    *
    * @default '1,'
    */
  var decimal_digits: js.UndefOr[String] = js.undefined
  /**
    * @default false
    */
  var force_decimal: js.UndefOr[Boolean] = js.undefined
  /**
    * DecimalLocale
    *
    * @default 'en-US'
    */
  var locale: js.UndefOr[DecimalLocale] = js.undefined
}

object IsDecimalOptions {
  @scala.inline
  def apply(
    decimal_digits: String = null,
    force_decimal: js.UndefOr[Boolean] = js.undefined,
    locale: DecimalLocale = null
  ): IsDecimalOptions = {
    val __obj = js.Dynamic.literal()
    if (decimal_digits != null) __obj.updateDynamic("decimal_digits")(decimal_digits.asInstanceOf[js.Any])
    if (!js.isUndefined(force_decimal)) __obj.updateDynamic("force_decimal")(force_decimal.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDecimalOptions]
  }
}

