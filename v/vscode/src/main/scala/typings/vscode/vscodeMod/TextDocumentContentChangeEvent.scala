package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentContentChangeEvent extends js.Object {
  /**
  		 * The range that got replaced.
  		 */
  var range: Range
  /**
  		 * The length of the range that got replaced.
  		 */
  var rangeLength: Double
  /**
  		 * The offset of the range that got replaced.
  		 */
  var rangeOffset: Double
  /**
  		 * The new text for the range.
  		 */
  var text: String
}

object TextDocumentContentChangeEvent {
  @scala.inline
  def apply(range: Range, rangeLength: Double, rangeOffset: Double, text: String): TextDocumentContentChangeEvent = {
    val __obj = js.Dynamic.literal(range = range, rangeLength = rangeLength, rangeOffset = rangeOffset, text = text)
  
    __obj.asInstanceOf[TextDocumentContentChangeEvent]
  }
}

