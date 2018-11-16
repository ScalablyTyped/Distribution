package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Formats and parses decimal numbers. */
@JSGlobal("Windows.Globalization.NumberFormatting.DecimalFormatter")
@js.native
class DecimalFormatter () extends js.Object {
  /**
                   * Creates a DecimalFormatter object initialized by a language list and a geographic region.
                   * @param languages The list of language identifiers, in priority order, representing the choice of languages. See Remarks.
                   * @param geographicRegion The identifier for the geographic region.
                   */
  def this(languages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], geographicRegion: java.lang.String) = this()
  /** Gets or sets the minimum number of digits to display for the fraction part of the number. */
  var fractionDigits: scala.Double = js.native
  /** Gets the region that is used when formatting and parsing decimal numbers. */
  var geographicRegion: java.lang.String = js.native
  /** Gets or sets the minimum number of digits to display for the integer part of the number. */
  var integerDigits: scala.Double = js.native
  /** Gets or sets whether the decimal point of the number should always be displayed. */
  var isDecimalPointAlwaysDisplayed: scala.Boolean = js.native
  /** Gets or sets whether the integer part of the number should be grouped. */
  var isGrouped: scala.Boolean = js.native
  /** Gets or sets whether -0 is formatted as "-0" or "0". */
  var isZeroSigned: scala.Boolean = js.native
  /** Gets the priority list of language identifiers that is used when formatting and parsing decimal numbers. */
  var languages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets or sets the current rounding strategy to be used when formatting numbers. */
  var numberRounder: INumberRounder = js.native
  /** Gets or sets the numbering system that is used to format and parse decimal numbers. */
  var numeralSystem: java.lang.String = js.native
  /** Gets the geographic region that was most recently used to format or parse decimal values. */
  var resolvedGeographicRegion: java.lang.String = js.native
  /** Gets the language that was most recently used to format or parse decimal values. */
  var resolvedLanguage: java.lang.String = js.native
  /** Gets or sets the current padding to significant digits when a decimal number is formatted. */
  var significantDigits: scala.Double = js.native
  /**
                   * Returns a string representation of a Double number.
                   * @param value The Double value to be formatted.
                   * @return A string that represents the number.
                   */
  def format(value: scala.Double): java.lang.String = js.native
  /**
                   * Returns a string representation of a Double number.
                   * @param value The Double value to be formatted.
                   * @return A string that represents the number.
                   */
  def formatDouble(value: scala.Double): java.lang.String = js.native
  /**
                   * Returns a string representation of an Int64 number.
                   * @param value The Int64 value to be formatted.
                   * @return A string that represents the number.
                   */
  def formatInt(value: scala.Double): java.lang.String = js.native
  /**
                   * Returns a string representation of a UInt64 number.
                   * @param value The UInt64 value to be formatted.
                   * @return A string that represents the number.
                   */
  def formatUInt(value: scala.Double): java.lang.String = js.native
  /**
                   * Attempts to parse a string representation of a Double number.
                   * @param text The text to be parsed.
                   * @return If successful, a Double that corresponds to the string representation, and otherwise null.
                   */
  def parseDouble(text: java.lang.String): scala.Double = js.native
  /**
                   * Attempts to parse a string representation of an integer.
                   * @param text The text to be parsed.
                   * @return If successful, an Int64 that corresponds to the string representation, and otherwise null.
                   */
  def parseInt(text: java.lang.String): scala.Double = js.native
  /**
                   * Attempts to parse a string representation of an unsigned integer.
                   * @param text The text to be parsed.
                   * @return If successful, a UInt64 that corresponds to the string representation, and otherwise null.
                   */
  def parseUInt(text: java.lang.String): scala.Double = js.native
}

