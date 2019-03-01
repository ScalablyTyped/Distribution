package typings
package vueDashI18nLib.vueDashI18nMod.VueI18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecificNumberFormatOptions
  extends stdLib.IntlNs.NumberFormatOptions
     with _NumberFormatOptions {
  @JSName("currencyDisplay")
  var currencyDisplay_SpecificNumberFormatOptions: js.UndefOr[CurrencyDisplay] = js.undefined
  var formatMatcher: js.UndefOr[FormatMatcher] = js.undefined
  @JSName("localeMatcher")
  var localeMatcher_SpecificNumberFormatOptions: js.UndefOr[LocaleMatcher] = js.undefined
  @JSName("style")
  var style_SpecificNumberFormatOptions: js.UndefOr[
    vueDashI18nLib.vueDashI18nLibStrings.decimal | vueDashI18nLib.vueDashI18nLibStrings.percent
  ] = js.undefined
}

object SpecificNumberFormatOptions {
  @scala.inline
  def apply(
    currency: java.lang.String = null,
    currencyDisplay: CurrencyDisplay = null,
    formatMatcher: FormatMatcher = null,
    localeMatcher: LocaleMatcher = null,
    maximumFractionDigits: scala.Int | scala.Double = null,
    maximumSignificantDigits: scala.Int | scala.Double = null,
    minimumFractionDigits: scala.Int | scala.Double = null,
    minimumIntegerDigits: scala.Int | scala.Double = null,
    minimumSignificantDigits: scala.Int | scala.Double = null,
    style: vueDashI18nLib.vueDashI18nLibStrings.decimal | vueDashI18nLib.vueDashI18nLibStrings.percent = null,
    useGrouping: js.UndefOr[scala.Boolean] = js.undefined
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

