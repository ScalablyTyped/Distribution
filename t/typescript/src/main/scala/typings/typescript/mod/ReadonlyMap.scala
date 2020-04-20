package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ES6 Map interface, only read methods included. */
trait ReadonlyMap[T] extends js.Object {
  val size: Double
  def entries(): Iterator[js.Tuple2[java.lang.String, T]]
  def forEach(action: js.Function2[/* value */ T, /* key */ java.lang.String, Unit]): Unit
  def get(key: java.lang.String): js.UndefOr[T]
  def has(key: java.lang.String): Boolean
  def keys(): Iterator[java.lang.String]
  def values(): Iterator[T]
}

object ReadonlyMap {
  @scala.inline
  def apply[T](
    entries: () => Iterator[js.Tuple2[java.lang.String, T]],
    forEach: js.Function2[/* value */ T, /* key */ java.lang.String, Unit] => Unit,
    get: java.lang.String => js.UndefOr[T],
    has: java.lang.String => Boolean,
    keys: () => Iterator[java.lang.String],
    size: Double,
    values: () => Iterator[T]
  ): ReadonlyMap[T] = {
    val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ReadonlyMap[T]]
  }
}

