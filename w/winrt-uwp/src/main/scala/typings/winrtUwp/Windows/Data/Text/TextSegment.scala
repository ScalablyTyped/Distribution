package typings.winrtUwp.Windows.Data.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identifies a sub-string of a source text string. Your app can use this structure to obtain the segment of your provided text that is identified by AlternateWordForm , SelectableWordSegment , WordSegment , or SemanticTextQuery . */
trait TextSegment extends js.Object {
  /** The number of characters in the associated text segment. */
  var length: Double
  /** The zero-based index of the start of the associated text segment. */
  var startPosition: Double
}

object TextSegment {
  @scala.inline
  def apply(length: Double, startPosition: Double): TextSegment = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextSegment]
  }
}

