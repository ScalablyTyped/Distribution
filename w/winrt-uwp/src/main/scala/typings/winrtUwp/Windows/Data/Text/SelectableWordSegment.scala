package typings.winrtUwp.Windows.Data.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a segment from your provided text that includes a word and any trailing whitespace and/or punctuation after this word. */
trait SelectableWordSegment extends js.Object {
  /** Gets the TextSegment that identifies the source text's sub-string that is the selected word. */
  var sourceTextSegment: TextSegment
  /** Gets the text of the selected word identified by this SelectableWordSegment object. */
  var text: String
}

object SelectableWordSegment {
  @scala.inline
  def apply(sourceTextSegment: TextSegment, text: String): SelectableWordSegment = {
    val __obj = js.Dynamic.literal(sourceTextSegment = sourceTextSegment.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectableWordSegment]
  }
}

