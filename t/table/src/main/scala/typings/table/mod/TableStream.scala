package typings.table.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableStream extends js.Object {
  def write(row: js.Array[String]): Unit
}

object TableStream {
  @scala.inline
  def apply(write: js.Array[String] => Unit): TableStream = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[TableStream]
  }
}

