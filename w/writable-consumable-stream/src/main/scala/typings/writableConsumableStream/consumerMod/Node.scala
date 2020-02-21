package typings.writableConsumableStream.consumerMod

import typings.writableConsumableStream.AnonDone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node[T] extends js.Object {
  var data: AnonDone[T]
  var next: Node[T] | Null
}

object Node {
  @scala.inline
  def apply[T](data: AnonDone[T], next: Node[T] = null): Node[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node[T]]
  }
}

