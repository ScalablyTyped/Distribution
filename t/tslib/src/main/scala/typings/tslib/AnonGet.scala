package typings.tslib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet[T /* <: js.Object */, V] extends js.Object {
  def get(o: T): js.UndefOr[V]
  def has(o: T): Boolean
}

object AnonGet {
  @scala.inline
  def apply[T /* <: js.Object */, V](get: T => js.UndefOr[V], has: T => Boolean): AnonGet[T, V] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
  
    __obj.asInstanceOf[AnonGet[T, V]]
  }
}

