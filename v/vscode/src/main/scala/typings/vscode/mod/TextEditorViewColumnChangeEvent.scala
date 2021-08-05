package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEditorViewColumnChangeEvent extends StObject {
  
  /**
    * The [text editor](#TextEditor) for which the view column has changed.
    */
  val textEditor: TextEditor
  
  /**
    * The new value for the [text editor's view column](#TextEditor.viewColumn).
    */
  val viewColumn: ViewColumn
}
object TextEditorViewColumnChangeEvent {
  
  inline def apply(textEditor: TextEditor, viewColumn: ViewColumn): TextEditorViewColumnChangeEvent = {
    val __obj = js.Dynamic.literal(textEditor = textEditor.asInstanceOf[js.Any], viewColumn = viewColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorViewColumnChangeEvent]
  }
  
  extension [Self <: TextEditorViewColumnChangeEvent](x: Self) {
    
    inline def setTextEditor(value: TextEditor): Self = StObject.set(x, "textEditor", value.asInstanceOf[js.Any])
    
    inline def setViewColumn(value: ViewColumn): Self = StObject.set(x, "viewColumn", value.asInstanceOf[js.Any])
  }
}
