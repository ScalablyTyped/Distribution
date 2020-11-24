package typings.winrtUwp.Windows.Data.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Identifies a sub-string of a source text string. Your app can use this structure to obtain the segment of your provided text that is identified by AlternateWordForm , SelectableWordSegment , WordSegment , or SemanticTextQuery . */
@js.native
trait TextSegment extends js.Object {
  
  /** The number of characters in the associated text segment. */
  var length: Double = js.native
  
  /** The zero-based index of the start of the associated text segment. */
  var startPosition: Double = js.native
}
object TextSegment {
  
  @scala.inline
  def apply(length: Double, startPosition: Double): TextSegment = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSegment]
  }
  
  @scala.inline
  implicit class TextSegmentOps[Self <: TextSegment] (val x: Self) extends AnyVal {
    
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPosition(value: Double): Self = this.set("startPosition", value.asInstanceOf[js.Any])
  }
}
