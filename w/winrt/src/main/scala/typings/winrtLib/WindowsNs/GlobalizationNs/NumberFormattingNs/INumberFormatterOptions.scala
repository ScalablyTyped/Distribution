package typings
package winrtLib.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumberFormatterOptions extends js.Object {
  var fractionDigits: scala.Double
  var geographicRegion: java.lang.String
  var integerDigits: scala.Double
  var isDecimalPointAlwaysDisplayed: scala.Boolean
  var isGrouped: scala.Boolean
  var languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var numeralSystem: java.lang.String
  var resolvedGeographicRegion: java.lang.String
  var resolvedLanguage: java.lang.String
}

object INumberFormatterOptions {
  @scala.inline
  def apply(
    fractionDigits: scala.Double,
    geographicRegion: java.lang.String,
    integerDigits: scala.Double,
    isDecimalPointAlwaysDisplayed: scala.Boolean,
    isGrouped: scala.Boolean,
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    numeralSystem: java.lang.String,
    resolvedGeographicRegion: java.lang.String,
    resolvedLanguage: java.lang.String
  ): INumberFormatterOptions = {
    val __obj = js.Dynamic.literal(fractionDigits = fractionDigits, geographicRegion = geographicRegion, integerDigits = integerDigits, isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed, isGrouped = isGrouped, languages = languages, numeralSystem = numeralSystem, resolvedGeographicRegion = resolvedGeographicRegion, resolvedLanguage = resolvedLanguage)
  
    __obj.asInstanceOf[INumberFormatterOptions]
  }
}

