package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditorVisibleRangesChangeEvent extends js.Object {
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
    val __obj = js.Dynamic.literal(textEditor = textEditor, visibleRanges = visibleRanges)
  
    __obj.asInstanceOf[TextEditorVisibleRangesChangeEvent]
  }
}

