package typings.vueRx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchObservable[T] extends js.Object {
  var newValue: T
  var oldValue: T
}

object WatchObservable {
  @scala.inline
  def apply[T](newValue: T, oldValue: T): WatchObservable[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchObservable[T]]
  }
}

