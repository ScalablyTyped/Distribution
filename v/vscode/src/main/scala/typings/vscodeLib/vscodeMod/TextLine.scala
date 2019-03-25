package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextLine extends js.Object {
  /**
  		 * The offset of the first character which is not a whitespace character as defined
  		 * by `/\s/`. **Note** that if a line is all whitespace the length of the line is returned.
  		 */
  val firstNonWhitespaceCharacterIndex: scala.Double
  /**
  		 * Whether this line is whitespace only, shorthand
  		 * for [TextLine.firstNonWhitespaceCharacterIndex](#TextLine.firstNonWhitespaceCharacterIndex) === [TextLine.text.length](#TextLine.text).
  		 */
  val isEmptyOrWhitespace: scala.Boolean
  /**
  		 * The zero-based line number.
  		 */
  val lineNumber: scala.Double
  /**
  		 * The range this line covers without the line separator characters.
  		 */
  val range: Range
  /**
  		 * The range this line covers with the line separator characters.
  		 */
  val rangeIncludingLineBreak: Range
  /**
  		 * The text of this line without the line separator characters.
  		 */
  val text: java.lang.String
}

object TextLine {
  @scala.inline
  def apply(
    firstNonWhitespaceCharacterIndex: scala.Double,
    isEmptyOrWhitespace: scala.Boolean,
    lineNumber: scala.Double,
    range: Range,
    rangeIncludingLineBreak: Range,
    text: java.lang.String
  ): TextLine = {
    val __obj = js.Dynamic.literal(firstNonWhitespaceCharacterIndex = firstNonWhitespaceCharacterIndex, isEmptyOrWhitespace = isEmptyOrWhitespace, lineNumber = lineNumber, range = range, rangeIncludingLineBreak = rangeIncludingLineBreak, text = text)
  
    __obj.asInstanceOf[TextLine]
  }
}

