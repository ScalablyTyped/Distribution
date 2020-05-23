package typings.vueI18n.mod.VueI18n

import typings.vueI18n.vueI18nStrings.decimal
import typings.vueI18n.vueI18nStrings.percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecificNumberFormatOptions
  extends typings.std.Intl.NumberFormatOptions
     with _NumberFormatOptions {
  @JSName("currencyDisplay")
  var currencyDisplay_SpecificNumberFormatOptions: js.UndefOr[CurrencyDisplay] = js.undefined
  var formatMatcher: js.UndefOr[FormatMatcher] = js.undefined
  @JSName("localeMatcher")
  var localeMatcher_SpecificNumberFormatOptions: js.UndefOr[LocaleMatcher] = js.undefined
  @JSName("style")
  var style_SpecificNumberFormatOptions: js.UndefOr[decimal | percent] = js.undefined
}

object SpecificNumberFormatOptions {
  @scala.inline
  def apply(
    currency: String = null,
    currencyDisplay: CurrencyDisplay = null,
    formatMatcher: FormatMatcher = null,
    localeMatcher: LocaleMatcher = null,
    maximumFractionDigits: js.UndefOr[Double] = js.undefined,
    maximumSignificantDigits: js.UndefOr[Double] = js.undefined,
    minimumFractionDigits: js.UndefOr[Double] = js.undefined,
    minimumIntegerDigits: js.UndefOr[Double] = js.undefined,
    minimumSignificantDigits: js.UndefOr[Double] = js.undefined,
    style: decimal | percent = null,
    useGrouping: js.UndefOr[Boolean] = js.undefined
  ): SpecificNumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay.asInstanceOf[js.Any])
    if (formatMatcher != null) __obj.updateDynamic("formatMatcher")(formatMatcher.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumFractionDigits)) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumSignificantDigits)) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumFractionDigits)) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumIntegerDigits)) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumSignificantDigits)) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecificNumberFormatOptions]
  }
}

