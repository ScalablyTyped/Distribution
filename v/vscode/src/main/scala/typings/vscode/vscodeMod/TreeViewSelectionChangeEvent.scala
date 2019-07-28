package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewSelectionChangeEvent[T] extends js.Object {
  /**
  		 * Selected elements.
  		 */
  val selection: js.Array[T]
}

object TreeViewSelectionChangeEvent {
  @scala.inline
  def apply[T](selection: js.Array[T]): TreeViewSelectionChangeEvent[T] = {
    val __obj = js.Dynamic.literal(selection = selection)
  
    __obj.asInstanceOf[TreeViewSelectionChangeEvent[T]]
  }
}

