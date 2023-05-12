package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEditorSelectionChangeEvent extends StObject {
  
  /**
  		 * The {@link TextEditorSelectionChangeKind change kind} which has triggered this
  		 * event. Can be `undefined`.
  		 */
  val kind: js.UndefOr[TextEditorSelectionChangeKind] = js.undefined
  
  /**
  		 * The new value for the {@link TextEditor.selections text editor's selections}.
  		 */
  val selections: js.Array[Selection]
  
  /**
  		 * The {@link TextEditor text editor} for which the selections have changed.
  		 */
  val textEditor: TextEditor
}
object TextEditorSelectionChangeEvent {
  
  inline def apply(selections: js.Array[Selection], textEditor: TextEditor): TextEditorSelectionChangeEvent = {
    val __obj = js.Dynamic.literal(selections = selections.asInstanceOf[js.Any], textEditor = textEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorSelectionChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextEditorSelectionChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setKind(value: TextEditorSelectionChangeKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSelections(value: js.Array[Selection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsVarargs(value: Selection*): Self = StObject.set(x, "selections", js.Array(value*))
    
    inline def setTextEditor(value: TextEditor): Self = StObject.set(x, "textEditor", value.asInstanceOf[js.Any])
  }
}
