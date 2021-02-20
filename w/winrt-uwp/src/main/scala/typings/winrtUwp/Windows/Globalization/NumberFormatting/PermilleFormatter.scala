package typings.winrtUwp.Windows.Globalization.NumberFormatting

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Formats and parses permillages. */
@js.native
trait PermilleFormatter extends StObject {
  
  /**
    * Returns a string representation of a UInt64 permillage.
    * @param value The UInt64 value to be formatted.
    * @return A string that represents the permillage.
    */
  def format(value: Double): String = js.native
  
  /**
    * Returns a string representation of a Double permillage.
    * @param value The Double value to be formatted.
    * @return A string that represents the permillage.
    */
  def formatDouble(value: Double): String = js.native
  
  /**
    * Returns a string representation of an Int64 permillage.
    * @param value The Int64 value to be formatted.
    * @return A string that represents the permillage.
    */
  def formatInt(value: Double): String = js.native
  
  /**
    * Returns a string representation of a UInt64 permillage.
    * @param value The UInt64 value to be formatted.
    * @return A string that represents the permillage.
    */
  def formatUInt(value: Double): String = js.native
  
  /** Gets or sets the minimum number of digits to display for the fraction part of the permillage. */
  var fractionDigits: Double = js.native
  
  /** Gets the region that is used when formatting and parsing permille values. */
  var geographicRegion: String = js.native
  
  /** Gets or sets the minimum number of digits to display for the integer part of the permillage. */
  var integerDigits: Double = js.native
  
  /** Gets or sets whether the decimal point of the permillage should always be displayed. */
  var isDecimalPointAlwaysDisplayed: Boolean = js.native
  
  /** Gets or sets whether the integer part of the permillage should be grouped. */
  var isGrouped: Boolean = js.native
  
  /** Gets or sets whether -0 is formatted as "-0" or "0". */
  var isZeroSigned: Boolean = js.native
  
  /** Gets the priority list of language identifiers that is used when formatting and parsing permille values. */
  var languages: IVectorView[String] = js.native
  
  /** Gets or sets the current rounding strategy to be used when formatting permilles. */
  var numberRounder: INumberRounder = js.native
  
  /** Gets or sets the numbering system that is used to format and parse permille values. */
  var numeralSystem: String = js.native
  
  /**
    * Attempts to parse a string representation of a Double permillage.
    * @param text The text to be parsed.
    * @return If successful, a Double that corresponds to the string representation, and otherwise null.
    */
  def parseDouble(text: String): Double = js.native
  
  /**
    * Attempts to parse a string representation of an integer permillage.
    * @param text The text to be parsed.
    * @return If successful, an Int64 that corresponds to the string representation, and otherwise null.
    */
  def parseInt(text: String): Double = js.native
  
  /**
    * Attempts to parse a string representation of an unsigned integer permillage.
    * @param text The text to be parsed.
    * @return If successful, a UInt64 that corresponds to the string representation, and otherwise null.
    */
  def parseUInt(text: String): Double = js.native
  
  /** Gets the geographic region that was most recently used to format or parse permille values. */
  var resolvedGeographicRegion: String = js.native
  
  /** Gets the language that was most recently used to format or parse permille values. */
  var resolvedLanguage: String = js.native
  
  /** Gets or sets the current padding to significant digits when a permille is formatted. */
  var significantDigits: Double = js.native
}
object PermilleFormatter {
  
  @scala.inline
  def apply(
    format: Double => String,
    formatDouble: Double => String,
    formatInt: Double => String,
    formatUInt: Double => String,
    fractionDigits: Double,
    geographicRegion: String,
    integerDigits: Double,
    isDecimalPointAlwaysDisplayed: Boolean,
    isGrouped: Boolean,
    isZeroSigned: Boolean,
    languages: IVectorView[String],
    numberRounder: INumberRounder,
    numeralSystem: String,
    parseDouble: String => Double,
    parseInt: String => Double,
    parseUInt: String => Double,
    resolvedGeographicRegion: String,
    resolvedLanguage: String,
    significantDigits: Double
  ): PermilleFormatter = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatDouble = js.Any.fromFunction1(formatDouble), formatInt = js.Any.fromFunction1(formatInt), formatUInt = js.Any.fromFunction1(formatUInt), fractionDigits = fractionDigits.asInstanceOf[js.Any], geographicRegion = geographicRegion.asInstanceOf[js.Any], integerDigits = integerDigits.asInstanceOf[js.Any], isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], isZeroSigned = isZeroSigned.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numberRounder = numberRounder.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], parseDouble = js.Any.fromFunction1(parseDouble), parseInt = js.Any.fromFunction1(parseInt), parseUInt = js.Any.fromFunction1(parseUInt), resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any], significantDigits = significantDigits.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermilleFormatter]
  }
  
  @scala.inline
  implicit class PermilleFormatterMutableBuilder[Self <: PermilleFormatter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatDouble(value: Double => String): Self = StObject.set(x, "formatDouble", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatInt(value: Double => String): Self = StObject.set(x, "formatInt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatUInt(value: Double => String): Self = StObject.set(x, "formatUInt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFractionDigits(value: Double): Self = StObject.set(x, "fractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeographicRegion(value: String): Self = StObject.set(x, "geographicRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerDigits(value: Double): Self = StObject.set(x, "integerDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDecimalPointAlwaysDisplayed(value: Boolean): Self = StObject.set(x, "isDecimalPointAlwaysDisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGrouped(value: Boolean): Self = StObject.set(x, "isGrouped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsZeroSigned(value: Boolean): Self = StObject.set(x, "isZeroSigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguages(value: IVectorView[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberRounder(value: INumberRounder): Self = StObject.set(x, "numberRounder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumeralSystem(value: String): Self = StObject.set(x, "numeralSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseDouble(value: String => Double): Self = StObject.set(x, "parseDouble", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseInt(value: String => Double): Self = StObject.set(x, "parseInt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseUInt(value: String => Double): Self = StObject.set(x, "parseUInt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolvedGeographicRegion(value: String): Self = StObject.set(x, "resolvedGeographicRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedLanguage(value: String): Self = StObject.set(x, "resolvedLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignificantDigits(value: Double): Self = StObject.set(x, "significantDigits", value.asInstanceOf[js.Any])
  }
}
