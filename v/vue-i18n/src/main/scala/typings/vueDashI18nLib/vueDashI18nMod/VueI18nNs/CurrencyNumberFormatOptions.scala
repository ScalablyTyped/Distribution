package typings
package vueDashI18nLib.vueDashI18nMod.VueI18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CurrencyNumberFormatOptions
  extends stdLib.IntlNs.NumberFormatOptions {
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

