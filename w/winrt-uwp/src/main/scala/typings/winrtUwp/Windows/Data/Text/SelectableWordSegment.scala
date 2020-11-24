package typings.winrtUwp.Windows.Data.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a segment from your provided text that includes a word and any trailing whitespace and/or punctuation after this word. */
@js.native
trait SelectableWordSegment extends js.Object {
  
  /** Gets the TextSegment that identifies the source text's sub-string that is the selected word. */
  var sourceTextSegment: TextSegment = js.native
  
  /** Gets the text of the selected word identified by this SelectableWordSegment object. */
  var text: String = js.native
}
object SelectableWordSegment {
  
  @scala.inline
  def apply(sourceTextSegment: TextSegment, text: String): SelectableWordSegment = {
    val __obj = js.Dynamic.literal(sourceTextSegment = sourceTextSegment.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectableWordSegment]
  }
  
  @scala.inline
  implicit class SelectableWordSegmentOps[Self <: SelectableWordSegment] (val x: Self) extends AnyVal {
    
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
    def setSourceTextSegment(value: TextSegment): Self = this.set("sourceTextSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
