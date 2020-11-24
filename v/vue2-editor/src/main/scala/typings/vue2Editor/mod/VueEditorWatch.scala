package typings.vue2Editor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueEditorWatch extends js.Object {
  
  def disabled(status: Boolean): Unit = js.native
  
  def value(`val`: js.Any): Unit = js.native
}
object VueEditorWatch {
  
  @scala.inline
  def apply(disabled: Boolean => Unit, value: js.Any => Unit): VueEditorWatch = {
    val __obj = js.Dynamic.literal(disabled = js.Any.fromFunction1(disabled), value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[VueEditorWatch]
  }
  
  @scala.inline
  implicit class VueEditorWatchOps[Self <: VueEditorWatch] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean => Unit): Self = this.set("disabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: js.Any => Unit): Self = this.set("value", js.Any.fromFunction1(value))
  }
}
