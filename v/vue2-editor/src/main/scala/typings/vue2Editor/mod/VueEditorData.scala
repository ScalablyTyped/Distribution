package typings.vue2Editor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueEditorData extends js.Object {
  
  var quill: js.Any = js.native
}
object VueEditorData {
  
  @scala.inline
  def apply(quill: js.Any): VueEditorData = {
    val __obj = js.Dynamic.literal(quill = quill.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueEditorData]
  }
  
  @scala.inline
  implicit class VueEditorDataOps[Self <: VueEditorData] (val x: Self) extends AnyVal {
    
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
    def setQuill(value: js.Any): Self = this.set("quill", value.asInstanceOf[js.Any])
  }
}
