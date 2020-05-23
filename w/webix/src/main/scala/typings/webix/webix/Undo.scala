package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Undo extends js.Object {
  def ignoreUndo(functor: WebixCallback): Unit
  def removeUndo(id: String): Unit
  def undo(id: String): Unit
}

object Undo {
  @scala.inline
  def apply(ignoreUndo: WebixCallback => Unit, removeUndo: String => Unit, undo: String => Unit): Undo = {
    val __obj = js.Dynamic.literal(ignoreUndo = js.Any.fromFunction1(ignoreUndo), removeUndo = js.Any.fromFunction1(removeUndo), undo = js.Any.fromFunction1(undo))
    __obj.asInstanceOf[Undo]
  }
}

