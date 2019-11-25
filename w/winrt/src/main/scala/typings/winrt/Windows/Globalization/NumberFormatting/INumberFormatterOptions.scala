package typings.winrt.Windows.Globalization.NumberFormatting

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumberFormatterOptions extends js.Object {
  var fractionDigits: Double
  var geographicRegion: String
  var integerDigits: Double
  var isDecimalPointAlwaysDisplayed: Boolean
  var isGrouped: Boolean
  var languages: IVectorView[String]
  var numeralSystem: String
  var resolvedGeographicRegion: String
  var resolvedLanguage: String
}

object INumberFormatterOptions {
  @scala.inline
  def apply(
    fractionDigits: Double,
    geographicRegion: String,
    integerDigits: Double,
    isDecimalPointAlwaysDisplayed: Boolean,
    isGrouped: Boolean,
    languages: IVectorView[String],
    numeralSystem: String,
    resolvedGeographicRegion: String,
    resolvedLanguage: String
  ): INumberFormatterOptions = {
    val __obj = js.Dynamic.literal(fractionDigits = fractionDigits.asInstanceOf[js.Any], geographicRegion = geographicRegion.asInstanceOf[js.Any], integerDigits = integerDigits.asInstanceOf[js.Any], isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INumberFormatterOptions]
  }
}

