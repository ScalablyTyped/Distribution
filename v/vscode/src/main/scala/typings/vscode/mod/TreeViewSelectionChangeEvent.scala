package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeViewSelectionChangeEvent[T] extends js.Object {
  /**
    * Selected elements.
    */
  val selection: js.Array[T] = js.native
}

object TreeViewSelectionChangeEvent {
  @scala.inline
  def apply[T](selection: js.Array[T]): TreeViewSelectionChangeEvent[T] = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewSelectionChangeEvent[T]]
  }
  @scala.inline
  implicit class TreeViewSelectionChangeEventOps[Self <: TreeViewSelectionChangeEvent[_], T] (val x: Self with TreeViewSelectionChangeEvent[T]) extends AnyVal {
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
    def setSelectionVarargs(value: T*): Self = this.set("selection", js.Array(value :_*))
    @scala.inline
    def setSelection(value: js.Array[T]): Self = this.set("selection", value.asInstanceOf[js.Any])
  }
  
}

