package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeViewExpansionEvent[T] extends js.Object {
  /**
    * Element that is expanded or collapsed.
    */
  val element: T = js.native
}

object TreeViewExpansionEvent {
  @scala.inline
  def apply[T](element: T): TreeViewExpansionEvent[T] = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewExpansionEvent[T]]
  }
  @scala.inline
  implicit class TreeViewExpansionEventOps[Self <: TreeViewExpansionEvent[_], T] (val x: Self with TreeViewExpansionEvent[T]) extends AnyVal {
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
    def setElement(value: T): Self = this.set("element", value.asInstanceOf[js.Any])
  }
  
}

