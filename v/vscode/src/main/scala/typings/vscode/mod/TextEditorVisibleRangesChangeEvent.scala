package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEditorVisibleRangesChangeEvent extends StObject {
  
  /**
    * The [text editor](#TextEditor) for which the visible ranges have changed.
    */
  val textEditor: TextEditor
  
  /**
    * The new value for the [text editor's visible ranges](#TextEditor.visibleRanges).
    */
  val visibleRanges: js.Array[Range]
}
object TextEditorVisibleRangesChangeEvent {
  
  inline def apply(textEditor: TextEditor, visibleRanges: js.Array[Range]): TextEditorVisibleRangesChangeEvent = {
    val __obj = js.Dynamic.literal(textEditor = textEditor.asInstanceOf[js.Any], visibleRanges = visibleRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorVisibleRangesChangeEvent]
  }
  
  extension [Self <: TextEditorVisibleRangesChangeEvent](x: Self) {
    
    inline def setTextEditor(value: TextEditor): Self = StObject.set(x, "textEditor", value.asInstanceOf[js.Any])
    
    inline def setVisibleRanges(value: js.Array[Range]): Self = StObject.set(x, "visibleRanges", value.asInstanceOf[js.Any])
    
    inline def setVisibleRangesVarargs(value: Range*): Self = StObject.set(x, "visibleRanges", js.Array(value :_*))
  }
}
