package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Undo extends js.Object {
  def ignoreUndo(functor: WebixCallback): Unit = js.native
  def removeUndo(id: String): Unit = js.native
  def undo(id: String): Unit = js.native
}

object Undo {
  @scala.inline
  def apply(ignoreUndo: WebixCallback => Unit, removeUndo: String => Unit, undo: String => Unit): Undo = {
    val __obj = js.Dynamic.literal(ignoreUndo = js.Any.fromFunction1(ignoreUndo), removeUndo = js.Any.fromFunction1(removeUndo), undo = js.Any.fromFunction1(undo))
    __obj.asInstanceOf[Undo]
  }
  @scala.inline
  implicit class UndoOps[Self <: Undo] (val x: Self) extends AnyVal {
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
    def setIgnoreUndo(value: WebixCallback => Unit): Self = this.set("ignoreUndo", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveUndo(value: String => Unit): Self = this.set("removeUndo", js.Any.fromFunction1(value))
    @scala.inline
    def setUndo(value: String => Unit): Self = this.set("undo", js.Any.fromFunction1(value))
  }
  
}

