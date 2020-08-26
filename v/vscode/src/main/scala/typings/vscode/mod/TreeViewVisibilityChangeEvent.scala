package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeViewVisibilityChangeEvent extends js.Object {
  /**
    * `true` if the [tree view](#TreeView) is visible otherwise `false`.
    */
  val visible: Boolean = js.native
}

object TreeViewVisibilityChangeEvent {
  @scala.inline
  def apply(visible: Boolean): TreeViewVisibilityChangeEvent = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewVisibilityChangeEvent]
  }
  @scala.inline
  implicit class TreeViewVisibilityChangeEventOps[Self <: TreeViewVisibilityChangeEvent] (val x: Self) extends AnyVal {
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
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

