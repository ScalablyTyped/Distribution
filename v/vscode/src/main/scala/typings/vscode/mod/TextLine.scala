package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextLine extends StObject {
  
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
  implicit class TextLineMutableBuilder[Self <: TextLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstNonWhitespaceCharacterIndex(value: Double): Self = StObject.set(x, "firstNonWhitespaceCharacterIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmptyOrWhitespace(value: Boolean): Self = StObject.set(x, "isEmptyOrWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeIncludingLineBreak(value: Range): Self = StObject.set(x, "rangeIncludingLineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
