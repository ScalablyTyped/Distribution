package typings.winrt.Windows.Globalization.NumberFormatting

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICurrencyFormatter
  extends INumberFormatterOptions
     with INumberFormatter
     with INumberFormatter2
     with INumberParser {
  var currency: String = js.native
}

object ICurrencyFormatter {
  @scala.inline
  def apply(
    currency: String,
    format: Double => String,
    formatDouble: Double => String,
    formatInt: Double => String,
    formatUInt: Double => String,
    fractionDigits: Double,
    geographicRegion: String,
    integerDigits: Double,
    isDecimalPointAlwaysDisplayed: Boolean,
    isGrouped: Boolean,
    languages: IVectorView[String],
    numeralSystem: String,
    parseDouble: String => Double,
    parseInt: String => Double,
    parseUInt: String => Double,
    resolvedGeographicRegion: String,
    resolvedLanguage: String
  ): ICurrencyFormatter = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), formatDouble = js.Any.fromFunction1(formatDouble), formatInt = js.Any.fromFunction1(formatInt), formatUInt = js.Any.fromFunction1(formatUInt), fractionDigits = fractionDigits.asInstanceOf[js.Any], geographicRegion = geographicRegion.asInstanceOf[js.Any], integerDigits = integerDigits.asInstanceOf[js.Any], isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], parseDouble = js.Any.fromFunction1(parseDouble), parseInt = js.Any.fromFunction1(parseInt), parseUInt = js.Any.fromFunction1(parseUInt), resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrencyFormatter]
  }
  @scala.inline
  implicit class ICurrencyFormatterOps[Self <: ICurrencyFormatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
  }
  
}

