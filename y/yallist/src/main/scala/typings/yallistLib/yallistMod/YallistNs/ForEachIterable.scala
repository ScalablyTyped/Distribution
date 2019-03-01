package typings
package yallistLib.yallistMod.YallistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForEachIterable[T] extends js.Object {
  def forEach(callbackFn: js.Function1[/* item */ T, scala.Unit]): scala.Unit
}

object ForEachIterable {
  @scala.inline
  def apply[T](forEach: js.Function1[js.Function1[/* item */ T, scala.Unit], scala.Unit]): ForEachIterable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forEach")(forEach)
    __obj.asInstanceOf[ForEachIterable[T]]
  }
}

