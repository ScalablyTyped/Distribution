package typings
package yallistLib.yallistMod.YallistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node[T] extends js.Object {
  var list: js.UndefOr[yallistLib.yallistMod.Yallist[T]] = js.undefined
  var next: Node[T] | scala.Null
  var prev: Node[T] | scala.Null
  var value: T
}

object Node {
  @scala.inline
  def apply[T](
    value: T,
    list: yallistLib.yallistMod.Yallist[T] = null,
    next: Node[T] = null,
    prev: Node[T] = null
  ): Node[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list)
    if (next != null) __obj.updateDynamic("next")(next)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[Node[T]]
  }
}

