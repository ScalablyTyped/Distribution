package typings.winrt.WindowsNs.GlobalizationNs.NumberFormattingNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICurrencyFormatter
  extends INumberFormatterOptions
     with INumberFormatter
     with INumberFormatter2
     with INumberParser {
  var currency: String
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
    val __obj = js.Dynamic.literal(currency = currency, format = js.Any.fromFunction1(format), formatDouble = js.Any.fromFunction1(formatDouble), formatInt = js.Any.fromFunction1(formatInt), formatUInt = js.Any.fromFunction1(formatUInt), fractionDigits = fractionDigits, geographicRegion = geographicRegion, integerDigits = integerDigits, isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed, isGrouped = isGrouped, languages = languages, numeralSystem = numeralSystem, parseDouble = js.Any.fromFunction1(parseDouble), parseInt = js.Any.fromFunction1(parseInt), parseUInt = js.Any.fromFunction1(parseUInt), resolvedGeographicRegion = resolvedGeographicRegion, resolvedLanguage = resolvedLanguage)
  
    __obj.asInstanceOf[ICurrencyFormatter]
  }
}

