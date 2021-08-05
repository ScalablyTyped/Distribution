package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEditorSelectionChangeEvent extends StObject {
  
  /**
    * The [change kind](#TextEditorSelectionChangeKind) which has triggered this
    * event. Can be `undefined`.
    */
  val kind: js.UndefOr[TextEditorSelectionChangeKind] = js.undefined
  
  /**
    * The new value for the [text editor's selections](#TextEditor.selections).
    */
  val selections: js.Array[Selection]
  
  /**
    * The [text editor](#TextEditor) for which the selections have changed.
    */
  val textEditor: TextEditor
}
object TextEditorSelectionChangeEvent {
  
  inline def apply(selections: js.Array[Selection], textEditor: TextEditor): TextEditorSelectionChangeEvent = {
    val __obj = js.Dynamic.literal(selections = selections.asInstanceOf[js.Any], textEditor = textEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorSelectionChangeEvent]
  }
  
  extension [Self <: TextEditorSelectionChangeEvent](x: Self) {
    
    inline def setKind(value: TextEditorSelectionChangeKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSelections(value: js.Array[Selection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsVarargs(value: Selection*): Self = StObject.set(x, "selections", js.Array(value :_*))
    
    inline def setTextEditor(value: TextEditor): Self = StObject.set(x, "textEditor", value.asInstanceOf[js.Any])
  }
}
