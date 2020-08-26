package typings.tinymce.mod.dom

import typings.tinymce.mod.html.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeWalker extends js.Object {
  def current(): Node = js.native
  def next(): Node = js.native
  def prev(): Node = js.native
}

object TreeWalker {
  @scala.inline
  def apply(current: () => Node, next: () => Node, prev: () => Node): TreeWalker = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction0(current), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev))
    __obj.asInstanceOf[TreeWalker]
  }
  @scala.inline
  implicit class TreeWalkerOps[Self <: TreeWalker] (val x: Self) extends AnyVal {
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
    def setCurrent(value: () => Node): Self = this.set("current", js.Any.fromFunction0(value))
    @scala.inline
    def setNext(value: () => Node): Self = this.set("next", js.Any.fromFunction0(value))
    @scala.inline
    def setPrev(value: () => Node): Self = this.set("prev", js.Any.fromFunction0(value))
  }
  
}

