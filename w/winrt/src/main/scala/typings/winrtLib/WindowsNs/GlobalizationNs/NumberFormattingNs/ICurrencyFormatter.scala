package typings
package winrtLib.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICurrencyFormatter
  extends INumberFormatterOptions
     with INumberFormatter
     with INumberFormatter2
     with INumberParser {
  var currency: java.lang.String
}

object ICurrencyFormatter {
  @scala.inline
  def apply(
    currency: java.lang.String,
    format: scala.Double => java.lang.String,
    formatDouble: scala.Double => java.lang.String,
    formatInt: scala.Double => java.lang.String,
    formatUInt: scala.Double => java.lang.String,
    fractionDigits: scala.Double,
    geographicRegion: java.lang.String,
    integerDigits: scala.Double,
    isDecimalPointAlwaysDisplayed: scala.Boolean,
    isGrouped: scala.Boolean,
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    numeralSystem: java.lang.String,
    parseDouble: java.lang.String => scala.Double,
    parseInt: java.lang.String => scala.Double,
    parseUInt: java.lang.String => scala.Double,
    resolvedGeographicRegion: java.lang.String,
    resolvedLanguage: java.lang.String
  ): ICurrencyFormatter = {
    val __obj = js.Dynamic.literal(currency = currency, format = js.Any.fromFunction1(format), formatDouble = js.Any.fromFunction1(formatDouble), formatInt = js.Any.fromFunction1(formatInt), formatUInt = js.Any.fromFunction1(formatUInt), fractionDigits = fractionDigits, geographicRegion = geographicRegion, integerDigits = integerDigits, isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed, isGrouped = isGrouped, languages = languages, numeralSystem = numeralSystem, parseDouble = js.Any.fromFunction1(parseDouble), parseInt = js.Any.fromFunction1(parseInt), parseUInt = js.Any.fromFunction1(parseUInt), resolvedGeographicRegion = resolvedGeographicRegion, resolvedLanguage = resolvedLanguage)
  
    __obj.asInstanceOf[ICurrencyFormatter]
  }
}

