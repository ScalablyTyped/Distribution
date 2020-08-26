package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditorSelectionChangeEvent extends js.Object {
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
  implicit class TextEditorSelectionChangeEventOps[Self <: TextEditorSelectionChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSelectionsVarargs(value: Selection*): Self = this.set("selections", js.Array(value :_*))
    @scala.inline
    def setSelections(value: js.Array[Selection]): Self = this.set("selections", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextEditor(value: TextEditor): Self = this.set("textEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: TextEditorSelectionChangeKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

