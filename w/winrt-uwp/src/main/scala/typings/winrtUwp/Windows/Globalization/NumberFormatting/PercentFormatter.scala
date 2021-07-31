package typings.winrtUwp.Windows.Globalization.NumberFormatting

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Formats and parses percentages. */
trait PercentFormatter extends StObject {
  
  /**
    * Returns a string representation of a UInt64 percentage.
    * @param value The UInt64 value to be formatted.
    * @return A string that represents the percentage.
    */
  def format(value: Double): String
  
  /**
    * Returns a string representation of a Double percentage.
    * @param value The Double value to be formatted.
    * @return A string that represents the percentage.
    */
  def formatDouble(value: Double): String
  
  /**
    * Returns a string representation of an Int64 percentage.
    * @param value The Int64 value to be formatted.
    * @return A string that represents the percentage.
    */
  def formatInt(value: Double): String
  
  /**
    * Returns a string representation of a UInt64 percentage.
    * @param value The UInt64 value to be formatted.
    * @return A string that represents the percentage.
    */
  def formatUInt(value: Double): String
  
  /** Gets or sets the minimum number of digits to display for the fraction part of the percentage. */
  var fractionDigits: Double
  
  /** Gets the region that is used when formatting and parsing percentages. */
  var geographicRegion: String
  
  /** Gets or sets the minimum number of digits to display for the integer part of the percentage. */
  var integerDigits: Double
  
  /** Gets or sets whether the decimal point of the percentage should always be displayed. */
  var isDecimalPointAlwaysDisplayed: Boolean
  
  /** Gets or sets whether the integer part of the percentage should be grouped. */
  var isGrouped: Boolean
  
  /** Gets or sets whether -0 is formatted as "-0" or "0". */
  var isZeroSigned: Boolean
  
  /** Gets the priority list of language identifiers that is used when formatting and parsing percentages. */
  var languages: IVectorView[String]
  
  /** Gets or sets the current rounding strategy to be used when formatting percents. */
  var numberRounder: INumberRounder
  
  /** Gets or sets the numbering system that is used to format and parse percentages. */
  var numeralSystem: String
  
  /**
    * Attempts to parse a string representation of a Double percentage.
    * @param text The text to be parsed.
    * @return If successful, a Double that corresponds to the string representation, and otherwise null.
    */
  def parseDouble(text: String): Double
  
  /**
    * Attempts to parse a string representation of an integer percentage.
    * @param text The text to be parsed.
    * @return If successful, an Int64 that corresponds to the string representation, and otherwise null.
    */
  def parseInt(text: String): Double
  
  /**
    * Attempts to parse a string representation of an unsigned integer percentage.
    * @param text The text to be parsed.
    * @return If successful, a UInt64 that corresponds to the string representation, and otherwise null.
    */
  def parseUInt(text: String): Double
  
  /** Gets the geographic region that was most recently used to format or parse percent values. */
  var resolvedGeographicRegion: String
  
  /** Gets the language that was most recently used to format or parse percent values. */
  var resolvedLanguage: String
  
  /** Gets or sets the current padding to significant digits when a percent is formatted. */
  var significantDigits: Double
}
object PercentFormatter {
  
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
  ): PercentFormatter = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatDouble = js.Any.fromFunction1(formatDouble), formatInt = js.Any.fromFunction1(formatInt), formatUInt = js.Any.fromFunction1(formatUInt), fractionDigits = fractionDigits.asInstanceOf[js.Any], geographicRegion = geographicRegion.asInstanceOf[js.Any], integerDigits = integerDigits.asInstanceOf[js.Any], isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], isZeroSigned = isZeroSigned.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numberRounder = numberRounder.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], parseDouble = js.Any.fromFunction1(parseDouble), parseInt = js.Any.fromFunction1(parseInt), parseUInt = js.Any.fromFunction1(parseUInt), resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any], significantDigits = significantDigits.asInstanceOf[js.Any])
    __obj.asInstanceOf[PercentFormatter]
  }
  
  @scala.inline
  implicit class PercentFormatterMutableBuilder[Self <: PercentFormatter] (val x: Self) extends AnyVal {
    
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
