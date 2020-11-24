package typings.textBuffer.mod.global.TextBuffer.Events

import typings.textBuffer.mod.global.TextBuffer.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferChanged extends js.Object {
  
  /** Range of the new text. */
  var newRange: Range = js.native
  
  /** String containing the text that was inserted. */
  var newText: String = js.native
  
  /** Range of the old text. */
  var oldRange: Range = js.native
  
  /** String containing the text that was replaced. */
  var oldText: String = js.native
}
object BufferChanged {
  
  @scala.inline
  def apply(newRange: Range, newText: String, oldRange: Range, oldText: String): BufferChanged = {
    val __obj = js.Dynamic.literal(newRange = newRange.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferChanged]
  }
  
  @scala.inline
  implicit class BufferChangedOps[Self <: BufferChanged] (val x: Self) extends AnyVal {
    
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
    def setNewRange(value: Range): Self = this.set("newRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewText(value: String): Self = this.set("newText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldRange(value: Range): Self = this.set("oldRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldText(value: String): Self = this.set("oldText", value.asInstanceOf[js.Any])
  }
}
