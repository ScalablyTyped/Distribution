package typings.tslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Has[T /* <: js.Object */, V] extends js.Object {
  def has(o: T): Boolean
  def set(o: T, value: V): js.Any
}

object Has {
  @scala.inline
  def apply[/* <: js.Object */ T, V](has: T => Boolean, set: (T, V) => js.Any): Has[T, V] = {
    val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Has[T, V]]
  }
}

