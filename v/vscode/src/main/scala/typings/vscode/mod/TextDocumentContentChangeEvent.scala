package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentContentChangeEvent extends js.Object {
  
  /**
    * The range that got replaced.
    */
  val range: Range = js.native
  
  /**
    * The length of the range that got replaced.
    */
  val rangeLength: Double = js.native
  
  /**
    * The offset of the range that got replaced.
    */
  val rangeOffset: Double = js.native
  
  /**
    * The new text for the range.
    */
  val text: String = js.native
}
object TextDocumentContentChangeEvent {
  
  @scala.inline
  def apply(range: Range, rangeLength: Double, rangeOffset: Double, text: String): TextDocumentContentChangeEvent = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], rangeLength = rangeLength.asInstanceOf[js.Any], rangeOffset = rangeOffset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentContentChangeEvent]
  }
  
  @scala.inline
  implicit class TextDocumentContentChangeEventOps[Self <: TextDocumentContentChangeEvent] (val x: Self) extends AnyVal {
    
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
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeLength(value: Double): Self = this.set("rangeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeOffset(value: Double): Self = this.set("rangeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
