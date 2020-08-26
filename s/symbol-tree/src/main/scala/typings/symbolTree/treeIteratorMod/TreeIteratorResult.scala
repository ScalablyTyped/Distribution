package typings.symbolTree.treeIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeIteratorResult[T] extends js.Object {
  var done: Boolean = js.native
  var value: T = js.native
}

object TreeIteratorResult {
  @scala.inline
  def apply[T](done: Boolean, value: T): TreeIteratorResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeIteratorResult[T]]
  }
  @scala.inline
  implicit class TreeIteratorResultOps[Self <: TreeIteratorResult[_], T] (val x: Self with TreeIteratorResult[T]) extends AnyVal {
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
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

