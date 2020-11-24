package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextChange extends js.Object {
  
  var newText: java.lang.String = js.native
  
  var span: TextSpan = js.native
}
object TextChange {
  
  @scala.inline
  def apply(newText: java.lang.String, span: TextSpan): TextChange = {
    val __obj = js.Dynamic.literal(newText = newText.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextChange]
  }
  
  @scala.inline
  implicit class TextChangeOps[Self <: TextChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNewText(value: java.lang.String): Self = this.set("newText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpan(value: TextSpan): Self = this.set("span", value.asInstanceOf[js.Any])
  }
}
