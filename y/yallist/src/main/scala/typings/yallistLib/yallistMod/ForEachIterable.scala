package typings
package yallistLib.yallistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForEachIterable[T] extends js.Object {
  def forEach(callbackFn: js.Function1[/* item */ T, scala.Unit]): scala.Unit
}

object ForEachIterable {
  @scala.inline
  def apply[T](forEach: js.Function1[/* item */ T, scala.Unit] => scala.Unit): ForEachIterable[T] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
  
    __obj.asInstanceOf[ForEachIterable[T]]
  }
}

