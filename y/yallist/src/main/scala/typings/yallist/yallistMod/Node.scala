package typings.yallist.yallistMod

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
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list)
    if (next != null) __obj.updateDynamic("next")(next)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[Node[T]]
  }
}

