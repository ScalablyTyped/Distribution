package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndoStopAfter extends js.Object {
  var undoStopAfter: Boolean
  var undoStopBefore: Boolean
}

object UndoStopAfter {
  @scala.inline
  def apply(undoStopAfter: Boolean, undoStopBefore: Boolean): UndoStopAfter = {
    val __obj = js.Dynamic.literal(undoStopAfter = undoStopAfter.asInstanceOf[js.Any], undoStopBefore = undoStopBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndoStopAfter]
  }
}

