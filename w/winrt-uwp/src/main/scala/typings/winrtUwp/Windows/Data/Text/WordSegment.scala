package typings.winrtUwp.Windows.Data.Text

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a word from your provided text. */
trait WordSegment extends js.Object {
  /** Gets the alternate forms (if any) associated with the current word. */
  var alternateForms: IVectorView[AlternateWordForm]
  /** Gets the TextSegment that identifies the source text's sub-string that is a word. */
  var sourceTextSegment: TextSegment
  /** Gets the text of the word identified by this WordSegment object. */
  var text: String
}

object WordSegment {
  @scala.inline
  def apply(alternateForms: IVectorView[AlternateWordForm], sourceTextSegment: TextSegment, text: String): WordSegment = {
    val __obj = js.Dynamic.literal(alternateForms = alternateForms.asInstanceOf[js.Any], sourceTextSegment = sourceTextSegment.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordSegment]
  }
}

