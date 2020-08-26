package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndoStopAfter extends js.Object {
  var undoStopAfter: Boolean = js.native
  var undoStopBefore: Boolean = js.native
}

object UndoStopAfter {
  @scala.inline
  def apply(undoStopAfter: Boolean, undoStopBefore: Boolean): UndoStopAfter = {
    val __obj = js.Dynamic.literal(undoStopAfter = undoStopAfter.asInstanceOf[js.Any], undoStopBefore = undoStopBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndoStopAfter]
  }
  @scala.inline
  implicit class UndoStopAfterOps[Self <: UndoStopAfter] (val x: Self) extends AnyVal {
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
    def setUndoStopAfter(value: Boolean): Self = this.set("undoStopAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def setUndoStopBefore(value: Boolean): Self = this.set("undoStopBefore", value.asInstanceOf[js.Any])
  }
  
}

