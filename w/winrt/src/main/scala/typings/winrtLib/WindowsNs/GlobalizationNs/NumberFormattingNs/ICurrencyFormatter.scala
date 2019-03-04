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
    format: js.Function1[scala.Double, java.lang.String],
    formatDouble: js.Function1[scala.Double, java.lang.String],
    formatInt: js.Function1[scala.Double, java.lang.String],
    formatUInt: js.Function1[scala.Double, java.lang.String],
    fractionDigits: scala.Double,
    geographicRegion: java.lang.String,
    integerDigits: scala.Double,
    isDecimalPointAlwaysDisplayed: scala.Boolean,
    isGrouped: scala.Boolean,
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    numeralSystem: java.lang.String,
    parseDouble: js.Function1[java.lang.String, scala.Double],
    parseInt: js.Function1[java.lang.String, scala.Double],
    parseUInt: js.Function1[java.lang.String, scala.Double],
    resolvedGeographicRegion: java.lang.String,
    resolvedLanguage: java.lang.String
  ): ICurrencyFormatter = {
    val __obj = js.Dynamic.literal(currency = currency, format = format, formatDouble = formatDouble, formatInt = formatInt, formatUInt = formatUInt, fractionDigits = fractionDigits, geographicRegion = geographicRegion, integerDigits = integerDigits, isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed, isGrouped = isGrouped, languages = languages, numeralSystem = numeralSystem, parseDouble = parseDouble, parseInt = parseInt, parseUInt = parseUInt, resolvedGeographicRegion = resolvedGeographicRegion, resolvedLanguage = resolvedLanguage)
  
    __obj.asInstanceOf[ICurrencyFormatter]
  }
}

