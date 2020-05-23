package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeTablePaste extends js.Object {
  def insert(data: js.Array[_]): Unit
}

object TreeTablePaste {
  @scala.inline
  def apply(insert: js.Array[_] => Unit): TreeTablePaste = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[TreeTablePaste]
  }
}

