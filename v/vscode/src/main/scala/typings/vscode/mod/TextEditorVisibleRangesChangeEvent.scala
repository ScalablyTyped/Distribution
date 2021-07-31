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
  
  @scala.inline
  def apply(textEditor: TextEditor, visibleRanges: js.Array[Range]): TextEditorVisibleRangesChangeEvent = {
    val __obj = js.Dynamic.literal(textEditor = textEditor.asInstanceOf[js.Any], visibleRanges = visibleRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorVisibleRangesChangeEvent]
  }
  
  @scala.inline
  implicit class TextEditorVisibleRangesChangeEventMutableBuilder[Self <: TextEditorVisibleRangesChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextEditor(value: TextEditor): Self = StObject.set(x, "textEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleRanges(value: js.Array[Range]): Self = StObject.set(x, "visibleRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleRangesVarargs(value: Range*): Self = StObject.set(x, "visibleRanges", js.Array(value :_*))
  }
}
