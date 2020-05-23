package typings.yallist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node[T] extends js.Object {
  var list: js.UndefOr[Yallist[T]] = js.undefined
  var next: Node[T] | Null
  var prev: Node[T] | Null
  var value: T
}

object Node {
  @scala.inline
  def apply[T](value: T, list: Yallist[T] = null, next: Node[T] = null, prev: Node[T] = null): Node[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node[T]]
  }
}

