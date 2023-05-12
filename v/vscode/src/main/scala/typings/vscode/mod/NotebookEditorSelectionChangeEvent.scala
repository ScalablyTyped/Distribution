package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookEditorSelectionChangeEvent extends StObject {
  
  /**
  		 * The {@link NotebookEditor notebook editor} for which the selections have changed.
  		 */
  val notebookEditor: NotebookEditor
  
  /**
  		 * The new value for the {@link NotebookEditor.selections notebook editor's selections}.
  		 */
  val selections: js.Array[NotebookRange]
}
object NotebookEditorSelectionChangeEvent {
  
  inline def apply(notebookEditor: NotebookEditor, selections: js.Array[NotebookRange]): NotebookEditorSelectionChangeEvent = {
    val __obj = js.Dynamic.literal(notebookEditor = notebookEditor.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookEditorSelectionChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookEditorSelectionChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setNotebookEditor(value: NotebookEditor): Self = StObject.set(x, "notebookEditor", value.asInstanceOf[js.Any])
    
    inline def setSelections(value: js.Array[NotebookRange]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsVarargs(value: NotebookRange*): Self = StObject.set(x, "selections", js.Array(value*))
  }
}
