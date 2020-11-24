package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEditorOptionsChangeEvent extends js.Object {
  
  /**
    * The new value for the [text editor's options](#TextEditor.options).
    */
  val options: TextEditorOptions = js.native
  
  /**
    * The [text editor](#TextEditor) for which the options have changed.
    */
  val textEditor: TextEditor = js.native
}
object TextEditorOptionsChangeEvent {
  
  @scala.inline
  def apply(options: TextEditorOptions, textEditor: TextEditor): TextEditorOptionsChangeEvent = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], textEditor = textEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorOptionsChangeEvent]
  }
  
  @scala.inline
  implicit class TextEditorOptionsChangeEventOps[Self <: TextEditorOptionsChangeEvent] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: TextEditorOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEditor(value: TextEditor): Self = this.set("textEditor", value.asInstanceOf[js.Any])
  }
}
