package typings.vueI18n.mod.VueI18n

import typings.vueI18n.vueI18nStrings.currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencyNumberFormatOptions
  extends typings.std.Intl.NumberFormatOptions
     with _NumberFormatOptions {
   // Obligatory if style is 'currency'
  @JSName("currencyDisplay")
  var currencyDisplay_CurrencyNumberFormatOptions: js.UndefOr[CurrencyDisplay] = js.undefined
  @JSName("currency")
  var currency_CurrencyNumberFormatOptions: String
  var formatMatcher: js.UndefOr[FormatMatcher] = js.undefined
  @JSName("localeMatcher")
  var localeMatcher_CurrencyNumberFormatOptions: js.UndefOr[LocaleMatcher] = js.undefined
  @JSName("style")
  var style_CurrencyNumberFormatOptions: currency
}

object CurrencyNumberFormatOptions {
  @scala.inline
  def apply(
    currency: String,
    style: currency,
    currencyDisplay: CurrencyDisplay = null,
    formatMatcher: FormatMatcher = null,
    localeMatcher: LocaleMatcher = null,
    maximumFractionDigits: js.UndefOr[Double] = js.undefined,
    maximumSignificantDigits: js.UndefOr[Double] = js.undefined,
    minimumFractionDigits: js.UndefOr[Double] = js.undefined,
    minimumIntegerDigits: js.UndefOr[Double] = js.undefined,
    minimumSignificantDigits: js.UndefOr[Double] = js.undefined,
    useGrouping: js.UndefOr[Boolean] = js.undefined
  ): CurrencyNumberFormatOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay.asInstanceOf[js.Any])
    if (formatMatcher != null) __obj.updateDynamic("formatMatcher")(formatMatcher.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumFractionDigits)) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumSignificantDigits)) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumFractionDigits)) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumIntegerDigits)) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumSignificantDigits)) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyNumberFormatOptions]
  }
}

