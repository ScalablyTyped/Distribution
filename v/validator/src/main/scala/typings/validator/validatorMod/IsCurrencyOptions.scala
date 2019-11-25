package typings.validator.validatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsCurrencyOptions extends js.Object {
  /**
    * @default true
    */
  var allow_decimal: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var allow_negative_sign_placeholder: js.UndefOr[Boolean] = js.undefined
  /**
    * @default true
    */
  var allow_negatives: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var allow_space_after_digits: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var allow_space_after_symbol: js.UndefOr[Boolean] = js.undefined
  /**
    * @default '.'
    */
  var decimal_separator: js.UndefOr[String] = js.undefined
  /**
    * The array `digits_after_decimal` is filled with the exact number of digits allowed not a range, for example a range `1` to `3` will be given as `[1, 2, 3]`.
    *
    * @default [2]
    */
  var digits_after_decimal: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * @default false
    */
  var negative_sign_after_digits: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var negative_sign_before_digits: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var parens_for_negatives: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var require_decimal: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var require_symbol: js.UndefOr[Boolean] = js.undefined
  /**
    * @default '$'
    */
  var symbol: js.UndefOr[String] = js.undefined
  /**
    * @default false
    */
  var symbol_after_digits: js.UndefOr[Boolean] = js.undefined
  /**
    * @default ','
    */
  var thousands_separator: js.UndefOr[String] = js.undefined
}

object IsCurrencyOptions {
  @scala.inline
  def apply(
    allow_decimal: js.UndefOr[Boolean] = js.undefined,
    allow_negative_sign_placeholder: js.UndefOr[Boolean] = js.undefined,
    allow_negatives: js.UndefOr[Boolean] = js.undefined,
    allow_space_after_digits: js.UndefOr[Boolean] = js.undefined,
    allow_space_after_symbol: js.UndefOr[Boolean] = js.undefined,
    decimal_separator: String = null,
    digits_after_decimal: js.Array[Double] = null,
    negative_sign_after_digits: js.UndefOr[Boolean] = js.undefined,
    negative_sign_before_digits: js.UndefOr[Boolean] = js.undefined,
    parens_for_negatives: js.UndefOr[Boolean] = js.undefined,
    require_decimal: js.UndefOr[Boolean] = js.undefined,
    require_symbol: js.UndefOr[Boolean] = js.undefined,
    symbol: String = null,
    symbol_after_digits: js.UndefOr[Boolean] = js.undefined,
    thousands_separator: String = null
  ): IsCurrencyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_decimal)) __obj.updateDynamic("allow_decimal")(allow_decimal.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_negative_sign_placeholder)) __obj.updateDynamic("allow_negative_sign_placeholder")(allow_negative_sign_placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_negatives)) __obj.updateDynamic("allow_negatives")(allow_negatives.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_space_after_digits)) __obj.updateDynamic("allow_space_after_digits")(allow_space_after_digits.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_space_after_symbol)) __obj.updateDynamic("allow_space_after_symbol")(allow_space_after_symbol.asInstanceOf[js.Any])
    if (decimal_separator != null) __obj.updateDynamic("decimal_separator")(decimal_separator.asInstanceOf[js.Any])
    if (digits_after_decimal != null) __obj.updateDynamic("digits_after_decimal")(digits_after_decimal.asInstanceOf[js.Any])
    if (!js.isUndefined(negative_sign_after_digits)) __obj.updateDynamic("negative_sign_after_digits")(negative_sign_after_digits.asInstanceOf[js.Any])
    if (!js.isUndefined(negative_sign_before_digits)) __obj.updateDynamic("negative_sign_before_digits")(negative_sign_before_digits.asInstanceOf[js.Any])
    if (!js.isUndefined(parens_for_negatives)) __obj.updateDynamic("parens_for_negatives")(parens_for_negatives.asInstanceOf[js.Any])
    if (!js.isUndefined(require_decimal)) __obj.updateDynamic("require_decimal")(require_decimal.asInstanceOf[js.Any])
    if (!js.isUndefined(require_symbol)) __obj.updateDynamic("require_symbol")(require_symbol.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(symbol_after_digits)) __obj.updateDynamic("symbol_after_digits")(symbol_after_digits.asInstanceOf[js.Any])
    if (thousands_separator != null) __obj.updateDynamic("thousands_separator")(thousands_separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsCurrencyOptions]
  }
}

