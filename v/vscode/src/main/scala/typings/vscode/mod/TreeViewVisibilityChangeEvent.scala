package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewVisibilityChangeEvent extends js.Object {
  /**
  		 * `true` if the [tree view](#TreeView) is visible otherwise `false`.
  		 */
  val visible: Boolean
}

object TreeViewVisibilityChangeEvent {
  @scala.inline
  def apply(visible: Boolean): TreeViewVisibilityChangeEvent = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TreeViewVisibilityChangeEvent]
  }
}

