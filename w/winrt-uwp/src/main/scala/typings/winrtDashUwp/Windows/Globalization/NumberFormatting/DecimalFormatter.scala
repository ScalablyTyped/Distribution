package typings.winrtDashUwp.Windows.Globalization.NumberFormatting

import typings.winrtDashUwp.Windows.Foundation.Collections.IIterable
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Formats and parses decimal numbers. */
@JSGlobal("Windows.Globalization.NumberFormatting.DecimalFormatter")
@js.native
/** Creates a DecimalFormatter object and initializes it to default values. */
class DecimalFormatter () extends js.Object {
  /**
    * Creates a DecimalFormatter object initialized by a language list and a geographic region.
    * @param languages The list of language identifiers, in priority order, representing the choice of languages. See Remarks.
    * @param geographicRegion The identifier for the geographic region.
    */
  def this(languages: IIterable[String], geographicRegion: String) = this()
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

