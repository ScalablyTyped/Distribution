package typings.tslib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHas[T /* <: js.Object */, V] extends js.Object {
  def has(o: T): Boolean
  def set(o: T, value: V): js.Any
}

object AnonHas {
  @scala.inline
  def apply[T /* <: js.Object */, V](has: T => Boolean, set: (T, V) => js.Any): AnonHas[T, V] = {
    val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[AnonHas[T, V]]
  }
}

