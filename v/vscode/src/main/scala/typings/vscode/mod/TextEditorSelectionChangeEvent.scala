package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditorSelectionChangeEvent extends js.Object {
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
  @scala.inline
  def apply(
    selections: js.Array[Selection],
    textEditor: TextEditor,
    kind: TextEditorSelectionChangeKind = null
  ): TextEditorSelectionChangeEvent = {
    val __obj = js.Dynamic.literal(selections = selections.asInstanceOf[js.Any], textEditor = textEditor.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorSelectionChangeEvent]
  }
}

