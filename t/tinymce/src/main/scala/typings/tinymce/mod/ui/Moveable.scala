package typings.tinymce.mod.ui

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moveable extends js.Object {
  def moveRel(elm: Node, rel: String): Control = js.native
}

object Moveable {
  @scala.inline
  def apply(moveRel: (Node, String) => Control): Moveable = {
    val __obj = js.Dynamic.literal(moveRel = js.Any.fromFunction2(moveRel))
    __obj.asInstanceOf[Moveable]
  }
  @scala.inline
  implicit class MoveableOps[Self <: Moveable] (val x: Self) extends AnyVal {
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
    def setMoveRel(value: (Node, String) => Control): Self = this.set("moveRel", js.Any.fromFunction2(value))
  }
  
}

