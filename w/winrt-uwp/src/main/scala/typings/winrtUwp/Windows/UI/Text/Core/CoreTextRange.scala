package typings.winrtUwp.Windows.UI.Text.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a range of text inside a text input control. */
@js.native
trait CoreTextRange extends js.Object {
  
  /** The end position of a range in Application Character Position (ACP) terms. */
  var endCaretPosition: Double = js.native
  
  /** The start position of a range in Application Character Position (ACP) terms. */
  var startCaretPosition: Double = js.native
}
object CoreTextRange {
  
  @scala.inline
  def apply(endCaretPosition: Double, startCaretPosition: Double): CoreTextRange = {
    val __obj = js.Dynamic.literal(endCaretPosition = endCaretPosition.asInstanceOf[js.Any], startCaretPosition = startCaretPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextRange]
  }
  
  @scala.inline
  implicit class CoreTextRangeOps[Self <: CoreTextRange] (val x: Self) extends AnyVal {
    
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
    def setEndCaretPosition(value: Double): Self = this.set("endCaretPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartCaretPosition(value: Double): Self = this.set("startCaretPosition", value.asInstanceOf[js.Any])
  }
}
