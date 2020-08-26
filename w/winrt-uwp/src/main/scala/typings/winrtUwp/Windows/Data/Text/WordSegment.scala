package typings.winrtUwp.Windows.Data.Text

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a word from your provided text. */
@js.native
trait WordSegment extends js.Object {
  /** Gets the alternate forms (if any) associated with the current word. */
  var alternateForms: IVectorView[AlternateWordForm] = js.native
  /** Gets the TextSegment that identifies the source text's sub-string that is a word. */
  var sourceTextSegment: TextSegment = js.native
  /** Gets the text of the word identified by this WordSegment object. */
  var text: String = js.native
}

object WordSegment {
  @scala.inline
  def apply(alternateForms: IVectorView[AlternateWordForm], sourceTextSegment: TextSegment, text: String): WordSegment = {
    val __obj = js.Dynamic.literal(alternateForms = alternateForms.asInstanceOf[js.Any], sourceTextSegment = sourceTextSegment.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordSegment]
  }
  @scala.inline
  implicit class WordSegmentOps[Self <: WordSegment] (val x: Self) extends AnyVal {
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
    def setAlternateForms(value: IVectorView[AlternateWordForm]): Self = this.set("alternateForms", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceTextSegment(value: TextSegment): Self = this.set("sourceTextSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

