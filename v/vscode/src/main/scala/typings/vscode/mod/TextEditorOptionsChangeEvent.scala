package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEditorOptionsChangeEvent extends StObject {
  
  /**
    * The new value for the [text editor's options](#TextEditor.options).
    */
  val options: TextEditorOptions
  
  /**
    * The [text editor](#TextEditor) for which the options have changed.
    */
  val textEditor: TextEditor
}
object TextEditorOptionsChangeEvent {
  
  @scala.inline
  def apply(options: TextEditorOptions, textEditor: TextEditor): TextEditorOptionsChangeEvent = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], textEditor = textEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorOptionsChangeEvent]
  }
  
  @scala.inline
  implicit class TextEditorOptionsChangeEventMutableBuilder[Self <: TextEditorOptionsChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: TextEditorOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEditor(value: TextEditor): Self = StObject.set(x, "textEditor", value.asInstanceOf[js.Any])
  }
}
