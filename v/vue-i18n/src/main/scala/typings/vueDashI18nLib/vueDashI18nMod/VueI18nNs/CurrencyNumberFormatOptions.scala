package typings
package vueDashI18nLib.vueDashI18nMod.VueI18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencyNumberFormatOptions
  extends stdLib.IntlNs.NumberFormatOptions
     with _NumberFormatOptions {
   // Obligatory if style is 'currency'
  @JSName("currencyDisplay")
  var currencyDisplay_CurrencyNumberFormatOptions: js.UndefOr[CurrencyDisplay] = js.undefined
  @JSName("currency")
  var currency_CurrencyNumberFormatOptions: java.lang.String
  var formatMatcher: js.UndefOr[FormatMatcher] = js.undefined
  @JSName("localeMatcher")
  var localeMatcher_CurrencyNumberFormatOptions: js.UndefOr[LocaleMatcher] = js.undefined
  @JSName("style")
  var style_CurrencyNumberFormatOptions: vueDashI18nLib.vueDashI18nLibStrings.currency
}

object CurrencyNumberFormatOptions {
  @scala.inline
  def apply(
    currency: java.lang.String,
    style: vueDashI18nLib.vueDashI18nLibStrings.currency,
    currencyDisplay: CurrencyDisplay = null,
    formatMatcher: FormatMatcher = null,
    localeMatcher: LocaleMatcher = null,
    maximumFractionDigits: scala.Int | scala.Double = null,
    maximumSignificantDigits: scala.Int | scala.Double = null,
    minimumFractionDigits: scala.Int | scala.Double = null,
    minimumIntegerDigits: scala.Int | scala.Double = null,
    minimumSignificantDigits: scala.Int | scala.Double = null,
    useGrouping: js.UndefOr[scala.Boolean] = js.undefined
  ): CurrencyNumberFormatOptions = {
    val __obj = js.Dynamic.literal(currency = currency, style = style)
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay)
    if (formatMatcher != null) __obj.updateDynamic("formatMatcher")(formatMatcher)
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher)
    if (maximumFractionDigits != null) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.asInstanceOf[js.Any])
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumFractionDigits != null) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.asInstanceOf[js.Any])
    if (minimumIntegerDigits != null) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping)
    __obj.asInstanceOf[CurrencyNumberFormatOptions]
  }
}

