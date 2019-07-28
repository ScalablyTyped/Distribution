package typings.winrtDashUwp.WindowsNs.GlobalizationNs.NumberFormattingNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Formats and parses percentages. */
@JSGlobal("Windows.Globalization.NumberFormatting.PercentFormatter")
@js.native
/** Creates a PercentFormatter object and initializes it to default values. */
class PercentFormatter () extends js.Object {
  /**
    * Creates a PercentFormatter object initialized by a language list and a geographic region.
    * @param languages The list of language identifiers, in priority order, representing the choice of languages. See Remarks.
    * @param geographicRegion The identifier for the geographic region.
    */
  def this(languages: IIterable[String], geographicRegion: String) = this()
  /** Gets or sets the minimum number of digits to display for the fraction part of the percentage. */
  var fractionDigits: Double = js.native
  /** Gets the region that is used when formatting and parsing percentages. */
  var geographicRegion: String = js.native
  /** Gets or sets the minimum number of digits to display for the integer part of the percentage. */
  var integerDigits: Double = js.native
  /** Gets or sets whether the decimal point of the percentage should always be displayed. */
  var isDecimalPointAlwaysDisplayed: Boolean = js.native
  /** Gets or sets whether the integer part of the percentage should be grouped. */
  var isGrouped: Boolean = js.native
  /** Gets or sets whether -0 is formatted as "-0" or "0". */
  var isZeroSigned: Boolean = js.native
  /** Gets the priority list of language identifiers that is used when formatting and parsing percentages. */
  var languages: IVectorView[String] = js.native
  /** Gets or sets the current rounding strategy to be used when formatting percents. */
  var numberRounder: INumberRounder = js.native
  /** Gets or sets the numbering system that is used to format and parse percentages. */
  var numeralSystem: String = js.native
  /** Gets the geographic region that was most recently used to format or parse percent values. */
  var resolvedGeographicRegion: String = js.native
  /** Gets the language that was most recently used to format or parse percent values. */
  var resolvedLanguage: String = js.native
  /** Gets or sets the current padding to significant digits when a percent is formatted. */
  var significantDigits: Double = js.native
  /**
    * Returns a string representation of a UInt64 percentage.
    * @param value The UInt64 value to be formatted.
    * @return A string that represents the percentage.
    */
  def format(value: Double): String = js.native
  /**
    * Returns a string representation of a Double percentage.
    * @param value The Double value to be formatted.
    * @return A string that represents the percentage.
    */
  def formatDouble(value: Double): String = js.native
  /**
    * Returns a string representation of an Int64 percentage.
    * @param value The Int64 value to be formatted.
    * @return A string that represents the percentage.
    */
  def formatInt(value: Double): String = js.native
  /**
    * Returns a string representation of a UInt64 percentage.
    * @param value The UInt64 value to be formatted.
    * @return A string that represents the percentage.
    */
  def formatUInt(value: Double): String = js.native
  /**
    * Attempts to parse a string representation of a Double percentage.
    * @param text The text to be parsed.
    * @return If successful, a Double that corresponds to the string representation, and otherwise null.
    */
  def parseDouble(text: String): Double = js.native
  /**
    * Attempts to parse a string representation of an integer percentage.
    * @param text The text to be parsed.
    * @return If successful, an Int64 that corresponds to the string representation, and otherwise null.
    */
  def parseInt(text: String): Double = js.native
  /**
    * Attempts to parse a string representation of an unsigned integer percentage.
    * @param text The text to be parsed.
    * @return If successful, a UInt64 that corresponds to the string representation, and otherwise null.
    */
  def parseUInt(text: String): Double = js.native
}

