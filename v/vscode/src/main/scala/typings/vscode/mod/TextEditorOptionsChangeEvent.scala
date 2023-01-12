package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEditorOptionsChangeEvent extends StObject {
  
  /**
    * The new value for the {@link TextEditor.options text editor's options}.
    */
  val options: TextEditorOptions
  
  /**
    * The {@link TextEditor text editor} for which the options have changed.
    */
  val textEditor: TextEditor
}
object TextEditorOptionsChangeEvent {
  
  inline def apply(options: TextEditorOptions, textEditor: TextEditor): TextEditorOptionsChangeEvent = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], textEditor = textEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorOptionsChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextEditorOptionsChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: TextEditorOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setTextEditor(value: TextEditor): Self = StObject.set(x, "textEditor", value.asInstanceOf[js.Any])
  }
}
