package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEditorSelectionChangeEvent extends StObject {
  
  /**
    * The [change kind](#TextEditorSelectionChangeKind) which has triggered this
    * event. Can be `undefined`.
    */
  val kind: js.UndefOr[TextEditorSelectionChangeKind] = js.native
  
  /**
    * The new value for the [text editor's selections](#TextEditor.selections).
    */
  val selections: js.Array[Selection] = js.native
  
  /**
    * The [text editor](#TextEditor) for which the selections have changed.
    */
  val textEditor: TextEditor = js.native
}
object TextEditorSelectionChangeEvent {
  
  @scala.inline
  def apply(selections: js.Array[Selection], textEditor: TextEditor): TextEditorSelectionChangeEvent = {
    val __obj = js.Dynamic.literal(selections = selections.asInstanceOf[js.Any], textEditor = textEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorSelectionChangeEvent]
  }
  
  @scala.inline
  implicit class TextEditorSelectionChangeEventMutableBuilder[Self <: TextEditorSelectionChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: TextEditorSelectionChangeKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSelections(value: js.Array[Selection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: Selection*): Self = StObject.set(x, "selections", js.Array(value :_*))
    
    @scala.inline
    def setTextEditor(value: TextEditor): Self = StObject.set(x, "textEditor", value.asInstanceOf[js.Any])
  }
}
