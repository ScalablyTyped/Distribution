package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEditorViewColumnChangeEvent extends StObject {
  
  /**
    * The [text editor](#TextEditor) for which the view column has changed.
    */
  val textEditor: TextEditor = js.native
  
  /**
    * The new value for the [text editor's view column](#TextEditor.viewColumn).
    */
  val viewColumn: ViewColumn = js.native
}
object TextEditorViewColumnChangeEvent {
  
  @scala.inline
  def apply(textEditor: TextEditor, viewColumn: ViewColumn): TextEditorViewColumnChangeEvent = {
    val __obj = js.Dynamic.literal(textEditor = textEditor.asInstanceOf[js.Any], viewColumn = viewColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorViewColumnChangeEvent]
  }
  
  @scala.inline
  implicit class TextEditorViewColumnChangeEventMutableBuilder[Self <: TextEditorViewColumnChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextEditor(value: TextEditor): Self = StObject.set(x, "textEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewColumn(value: ViewColumn): Self = StObject.set(x, "viewColumn", value.asInstanceOf[js.Any])
  }
}
