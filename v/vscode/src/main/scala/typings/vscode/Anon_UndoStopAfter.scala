package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UndoStopAfter extends js.Object {
  var undoStopAfter: Boolean
  var undoStopBefore: Boolean
}

object Anon_UndoStopAfter {
  @scala.inline
  def apply(undoStopAfter: Boolean, undoStopBefore: Boolean): Anon_UndoStopAfter = {
    val __obj = js.Dynamic.literal(undoStopAfter = undoStopAfter, undoStopBefore = undoStopBefore)
  
    __obj.asInstanceOf[Anon_UndoStopAfter]
  }
}

