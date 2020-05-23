package typings.tslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Get[T /* <: js.Object */, V] extends js.Object {
  def get(o: T): js.UndefOr[V]
  def has(o: T): Boolean
}

object Get {
  @scala.inline
  def apply[T, V](get: T => js.UndefOr[V], has: T => Boolean): Get[T, V] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[Get[T, V]]
  }
}

