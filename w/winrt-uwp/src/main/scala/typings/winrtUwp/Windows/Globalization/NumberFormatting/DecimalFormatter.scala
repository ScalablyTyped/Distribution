package typings.winrtUwp.Windows.Globalization.NumberFormatting

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Formats and parses decimal numbers. */
@js.native
trait DecimalFormatter extends js.Object {
  /** Gets or sets the minimum number of digits to display for the fraction part of the number. */
  var fractionDigits: Double = js.native
  /** Gets the region that is used when formatting and parsing decimal numbers. */
  var geographicRegion: String = js.native
  /** Gets or sets the minimum number of digits to display for the integer part of the number. */
  var integerDigits: Double = js.native
  /** Gets or sets whether the decimal point of the number should always be displayed. */
  var isDecimalPointAlwaysDisplayed: Boolean = js.native
  /** Gets or sets whether the integer part of the number should be grouped. */
  var isGrouped: Boolean = js.native
  /** Gets or sets whether -0 is formatted as "-0" or "0". */
  var isZeroSigned: Boolean = js.native
  /** Gets the priority list of language identifiers that is used when formatting and parsing decimal numbers. */
  var languages: IVectorView[String] = js.native
  /** Gets or sets the current rounding strategy to be used when formatting numbers. */
  var numberRounder: INumberRounder = js.native
  /** Gets or sets the numbering system that is used to format and parse decimal numbers. */
  var numeralSystem: String = js.native
  /** Gets the geographic region that was most recently used to format or parse decimal values. */
  var resolvedGeographicRegion: String = js.native
  /** Gets the language that was most recently used to format or parse decimal values. */
  var resolvedLanguage: String = js.native
  /** Gets or sets the current padding to significant digits when a decimal number is formatted. */
  var significantDigits: Double = js.native
  /**
    * Returns a string representation of a Double number.
    * @param value The Double value to be formatted.
    * @return A string that represents the number.
    */
  def format(value: Double): String = js.native
  /**
    * Returns a string representation of a Double number.
    * @param value The Double value to be formatted.
    * @return A string that represents the number.
    */
  def formatDouble(value: Double): String = js.native
  /**
    * Returns a string representation of an Int64 number.
    * @param value The Int64 value to be formatted.
    * @return A string that represents the number.
    */
  def formatInt(value: Double): String = js.native
  /**
    * Returns a string representation of a UInt64 number.
    * @param value The UInt64 value to be formatted.
    * @return A string that represents the number.
    */
  def formatUInt(value: Double): String = js.native
  /**
    * Attempts to parse a string representation of a Double number.
    * @param text The text to be parsed.
    * @return If successful, a Double that corresponds to the string representation, and otherwise null.
    */
  def parseDouble(text: String): Double = js.native
  /**
    * Attempts to parse a string representation of an integer.
    * @param text The text to be parsed.
    * @return If successful, an Int64 that corresponds to the string representation, and otherwise null.
    */
  def parseInt(text: String): Double = js.native
  /**
    * Attempts to parse a string representation of an unsigned integer.
    * @param text The text to be parsed.
    * @return If successful, a UInt64 that corresponds to the string representation, and otherwise null.
    */
  def parseUInt(text: String): Double = js.native
}

object DecimalFormatter {
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
  ): DecimalFormatter = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatDouble = js.Any.fromFunction1(formatDouble), formatInt = js.Any.fromFunction1(formatInt), formatUInt = js.Any.fromFunction1(formatUInt), fractionDigits = fractionDigits.asInstanceOf[js.Any], geographicRegion = geographicRegion.asInstanceOf[js.Any], integerDigits = integerDigits.asInstanceOf[js.Any], isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], isZeroSigned = isZeroSigned.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numberRounder = numberRounder.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], parseDouble = js.Any.fromFunction1(parseDouble), parseInt = js.Any.fromFunction1(parseInt), parseUInt = js.Any.fromFunction1(parseUInt), resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any], significantDigits = significantDigits.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalFormatter]
  }
  @scala.inline
  implicit class DecimalFormatterOps[Self <: DecimalFormatter] (val x: Self) extends AnyVal {
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
    def setFormat(value: Double => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setFormatDouble(value: Double => String): Self = this.set("formatDouble", js.Any.fromFunction1(value))
    @scala.inline
    def setFormatInt(value: Double => String): Self = this.set("formatInt", js.Any.fromFunction1(value))
    @scala.inline
    def setFormatUInt(value: Double => String): Self = this.set("formatUInt", js.Any.fromFunction1(value))
    @scala.inline
    def setFractionDigits(value: Double): Self = this.set("fractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeographicRegion(value: String): Self = this.set("geographicRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntegerDigits(value: Double): Self = this.set("integerDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDecimalPointAlwaysDisplayed(value: Boolean): Self = this.set("isDecimalPointAlwaysDisplayed", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGrouped(value: Boolean): Self = this.set("isGrouped", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsZeroSigned(value: Boolean): Self = this.set("isZeroSigned", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguages(value: IVectorView[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberRounder(value: INumberRounder): Self = this.set("numberRounder", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumeralSystem(value: String): Self = this.set("numeralSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setParseDouble(value: String => Double): Self = this.set("parseDouble", js.Any.fromFunction1(value))
    @scala.inline
    def setParseInt(value: String => Double): Self = this.set("parseInt", js.Any.fromFunction1(value))
    @scala.inline
    def setParseUInt(value: String => Double): Self = this.set("parseUInt", js.Any.fromFunction1(value))
    @scala.inline
    def setResolvedGeographicRegion(value: String): Self = this.set("resolvedGeographicRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolvedLanguage(value: String): Self = this.set("resolvedLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignificantDigits(value: Double): Self = this.set("significantDigits", value.asInstanceOf[js.Any])
  }
  
}

