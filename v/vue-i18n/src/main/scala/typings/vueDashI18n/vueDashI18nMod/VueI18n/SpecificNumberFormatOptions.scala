package typings.vueDashI18n.vueDashI18nMod.VueI18n

import typings.vueDashI18n.vueDashI18nStrings.decimal
import typings.vueDashI18n.vueDashI18nStrings.percent
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
    maximumFractionDigits: Int | Double = null,
    maximumSignificantDigits: Int | Double = null,
    minimumFractionDigits: Int | Double = null,
    minimumIntegerDigits: Int | Double = null,
    minimumSignificantDigits: Int | Double = null,
    style: decimal | percent = null,
    useGrouping: js.UndefOr[Boolean] = js.undefined
  ): SpecificNumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay)
    if (formatMatcher != null) __obj.updateDynamic("formatMatcher")(formatMatcher)
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher)
    if (maximumFractionDigits != null) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.asInstanceOf[js.Any])
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumFractionDigits != null) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.asInstanceOf[js.Any])
    if (minimumIntegerDigits != null) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping)
    __obj.asInstanceOf[SpecificNumberFormatOptions]
  }
}

