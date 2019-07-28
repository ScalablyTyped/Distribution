package typings.winrtDashUwp.WindowsNs.DataNs.TextNs

import typings.winrtDashUwp.Anon_HighSurrogate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way for apps to get information about Unicode characters. */
@JSGlobal("Windows.Data.Text.UnicodeCharacters")
@js.native
abstract class UnicodeCharacters () extends js.Object

/* static members */
@JSGlobal("Windows.Data.Text.UnicodeCharacters")
@js.native
object UnicodeCharacters extends js.Object {
  /**
    * Returns the supplementary Unicode character for the specified high and low surrogate pair.
    * @param highSurrogate The high surrogate value. This must be in the proper range: 0xD800 <= highSurrogate <= 0xDBFF.
    * @param lowSurrogate The low surrogate value. This must be in the proper range: 0xDC00 <= lowSurrogate <= 0xDFFF.
    * @return The supplementary Unicode character.
    */
  def getCodepointFromSurrogatePair(highSurrogate: Double, lowSurrogate: Double): Double = js.native
  /**
    * Returns the UnicodeGeneralCategory of the specified Unicode character.
    * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
    * @return The Unicode general category for codepoint.
    */
  def getGeneralCategory(codepoint: Double): UnicodeGeneralCategory = js.native
  /**
    * Returns the UnicodeNumericType of the specified Unicode character.
    * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
    * @return The Unicode numeric type for codepoint.
    */
  def getNumericType(codepoint: Double): UnicodeNumericType = js.native
  /**
    * Returns the high and low surrogate pair values for the specified supplementary Unicode character.
    * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
    */
  def getSurrogatePairFromCodepoint(codepoint: Double): Anon_HighSurrogate = js.native
  /**
    * Determines if a specified Unicode character can be considered alphabetic.
    * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
    * @return TRUE if codepoint is alphabetic; otherwise FALSE.
    */
  def isAlphabetic(codepoint: Double): Boolean = js.native
  /**
    * Determines if a specified Unicode character can be considered cased (uppercase, lowercase or titlecase).
    * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
    * @return TRUE if codepoint is cased; otherwise FALSE.
    */
  def isCased(codepoint: Double): Boolean = js.native
  /**
    * Determines if a specified Unicode character can be considered the beginning of a grapheme.
    * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
    * @return TRUE if codepoint is the beginning of a grapheme; otherwise FALSE.
    */
  def isGraphemeBase(codepoint: Double): Boolean = js.native
  /**
    * Determines if a specified Unicode character can be considered to continue a previous grapheme.
    * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
    * @return TRUE if codepoint continues the previous grapheme; otherwise FALSE.
    */
  def isGraphemeExtend(codepoint: Double): Boolean = js.native
  /**
    * Determines if a specified Unicode character is a high surrogate.
    * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
    * @return TRUE if codepoint is a high surrogate; otherwise FALSE.
    */
  def isHighSurrogate(codepoint: Double): Boolean = js.native
  /**
    * Determines if a specified Unicode character can be considered a continuation character of an identifier in programming.
    * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
    * @return TRUE if codepoint is a continuation character of an identifier in programming; otherwise FALSE.
    */
  def isIdContinue(codepoint: Double): Boolean = js.native
  /**
    * Determines if a specified Unicode character can be considered the start character of an identifier in programming.
    * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
    * @return TRUE if codepoint is the start character of an identifier in programming; otherwise FALSE.
    */
  def isIdStart(codepoint: Double): Boolean = js.native
  /**
    * Determines if a specified Unicode character is a low surrogate.
    * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
    * @return TRUE if codepoint is a low surrogate; otherwise FALSE.
    */
  def isLowSurrogate(codepoint: Double): Boolean = js.native
  /**
    * Determines if a specified Unicode character can be considered a lower case character.
    * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
    * @return TRUE if codepoint is a lower case character; otherwise FALSE.
    */
  def isLowercase(codepoint: Double): Boolean = js.native
  /**
    * Determines if a specified codepoint is a non-character.
    * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
    * @return TRUE if codepoint is a non-character; otherwise FALSE.
    */
  def isNoncharacter(codepoint: Double): Boolean = js.native
  /**
    * Determines if a specified Unicode character is a supplementary character.
    * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
    * @return TRUE if codepoint is a supplementary character; otherwise FALSE.
    */
  def isSupplementary(codepoint: Double): Boolean = js.native
  /**
    * Determines if a specified Unicode character can be considered an upper case character.
    * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
    * @return TRUE if codepoint is an upper case character; otherwise FALSE.
    */
  def isUppercase(codepoint: Double): Boolean = js.native
  /**
    * Determines if a specified Unicode character can be considered whitespace.
    * @param codepoint A Unicode character. This must be in the proper range: 0 <= codepoint <= 0x10FFFF.
    * @return TRUE if codepoint is whitespace; otherwise FALSE.
    */
  def isWhitespace(codepoint: Double): Boolean = js.native
}

