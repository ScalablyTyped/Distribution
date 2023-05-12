package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookEditorVisibleRangesChangeEvent extends StObject {
  
  /**
  		 * The {@link NotebookEditor notebook editor} for which the visible ranges have changed.
  		 */
  val notebookEditor: NotebookEditor
  
  /**
  		 * The new value for the {@link NotebookEditor.visibleRanges notebook editor's visibleRanges}.
  		 */
  val visibleRanges: js.Array[NotebookRange]
}
object NotebookEditorVisibleRangesChangeEvent {
  
  inline def apply(notebookEditor: NotebookEditor, visibleRanges: js.Array[NotebookRange]): NotebookEditorVisibleRangesChangeEvent = {
    val __obj = js.Dynamic.literal(notebookEditor = notebookEditor.asInstanceOf[js.Any], visibleRanges = visibleRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookEditorVisibleRangesChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookEditorVisibleRangesChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setNotebookEditor(value: NotebookEditor): Self = StObject.set(x, "notebookEditor", value.asInstanceOf[js.Any])
    
    inline def setVisibleRanges(value: js.Array[NotebookRange]): Self = StObject.set(x, "visibleRanges", value.asInstanceOf[js.Any])
    
    inline def setVisibleRangesVarargs(value: NotebookRange*): Self = StObject.set(x, "visibleRanges", js.Array(value*))
  }
}
