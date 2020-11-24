package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextLine extends js.Object {
  
  /**
    * The offset of the first character which is not a whitespace character as defined
    * by `/\s/`. **Note** that if a line is all whitespace the length of the line is returned.
    */
  val firstNonWhitespaceCharacterIndex: Double = js.native
  
  /**
    * Whether this line is whitespace only, shorthand
    * for [TextLine.firstNonWhitespaceCharacterIndex](#TextLine.firstNonWhitespaceCharacterIndex) === [TextLine.text.length](#TextLine.text).
    */
  val isEmptyOrWhitespace: Boolean = js.native
  
  /**
    * The zero-based line number.
    */
  val lineNumber: Double = js.native
  
  /**
    * The range this line covers without the line separator characters.
    */
  val range: Range = js.native
  
  /**
    * The range this line covers with the line separator characters.
    */
  val rangeIncludingLineBreak: Range = js.native
  
  /**
    * The text of this line without the line separator characters.
    */
  val text: String = js.native
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
  
  @scala.inline
  implicit class TextLineOps[Self <: TextLine] (val x: Self) extends AnyVal {
    
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
    def setFirstNonWhitespaceCharacterIndex(value: Double): Self = this.set("firstNonWhitespaceCharacterIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmptyOrWhitespace(value: Boolean): Self = this.set("isEmptyOrWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeIncludingLineBreak(value: Range): Self = this.set("rangeIncludingLineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
