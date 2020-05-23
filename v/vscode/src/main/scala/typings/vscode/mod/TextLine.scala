package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextLine extends js.Object {
  /**
    * The offset of the first character which is not a whitespace character as defined
    * by `/\s/`. **Note** that if a line is all whitespace the length of the line is returned.
    */
  val firstNonWhitespaceCharacterIndex: Double
  /**
    * Whether this line is whitespace only, shorthand
    * for [TextLine.firstNonWhitespaceCharacterIndex](#TextLine.firstNonWhitespaceCharacterIndex) === [TextLine.text.length](#TextLine.text).
    */
  val isEmptyOrWhitespace: Boolean
  /**
    * The zero-based line number.
    */
  val lineNumber: Double
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
  val text: String
}

object TextLine {
  @scala.inline
  def apply(
    firstNonWhitespaceCharacterIndex: Double,
    isEmptyOrWhitespace: Boolean,
    lineNumber: Double,
    range: Range,
    rangeIncludingLineBreak: Range,
    text: String
  ): TextLine = {
    val __obj = js.Dynamic.literal(firstNonWhitespaceCharacterIndex = firstNonWhitespaceCharacterIndex.asInstanceOf[js.Any], isEmptyOrWhitespace = isEmptyOrWhitespace.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangeIncludingLineBreak = rangeIncludingLineBreak.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextLine]
  }
}

