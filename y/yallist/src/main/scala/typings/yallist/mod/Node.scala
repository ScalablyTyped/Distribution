package typings.yallist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node[T] extends js.Object {
  var list: js.UndefOr[Yallist[T]] = js.native
  var next: Node[T] | Null = js.native
  var prev: Node[T] | Null = js.native
  var value: T = js.native
}

object Node {
  @scala.inline
  def apply[T](value: T): Node[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node[T]]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node[_], T] (val x: Self with Node[T]) extends AnyVal {
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
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: Yallist[T]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setNext(value: Node[T]): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextNull: Self = this.set("next", null)
    @scala.inline
    def setPrev(value: Node[T]): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevNull: Self = this.set("prev", null)
  }
  
}

