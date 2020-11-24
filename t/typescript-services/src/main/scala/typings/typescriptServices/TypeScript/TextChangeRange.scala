package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextChangeRange extends js.Object {
  
  var _newLength: js.Any = js.native
  
  var _span: js.Any = js.native
  
  def isUnchanged(): Boolean = js.native
  
  def newLength(): Double = js.native
  
  def newSpan(): TextSpan = js.native
  
  def span(): TextSpan = js.native
}
object TextChangeRange {
  
  @scala.inline
  def apply(
    _newLength: js.Any,
    _span: js.Any,
    isUnchanged: () => Boolean,
    newLength: () => Double,
    newSpan: () => TextSpan,
    span: () => TextSpan
  ): TextChangeRange = {
    val __obj = js.Dynamic.literal(_newLength = _newLength.asInstanceOf[js.Any], _span = _span.asInstanceOf[js.Any], isUnchanged = js.Any.fromFunction0(isUnchanged), newLength = js.Any.fromFunction0(newLength), newSpan = js.Any.fromFunction0(newSpan), span = js.Any.fromFunction0(span))
    __obj.asInstanceOf[TextChangeRange]
  }
  
  @scala.inline
  implicit class TextChangeRangeOps[Self <: TextChangeRange] (val x: Self) extends AnyVal {
    
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
    def set_newLength(value: js.Any): Self = this.set("_newLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_span(value: js.Any): Self = this.set("_span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUnchanged(value: () => Boolean): Self = this.set("isUnchanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLength(value: () => Double): Self = this.set("newLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSpan(value: () => TextSpan): Self = this.set("newSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSpan(value: () => TextSpan): Self = this.set("span", js.Any.fromFunction0(value))
  }
}
