package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadonlyUnderscoreEscapedMap[T] extends js.Object {
  val size: Double
  def entries(): Iterator[js.Tuple2[String, T]]
  def forEach(action: js.Function2[/* value */ T, /* key */ String, Unit]): Unit
  def get(key: String): js.UndefOr[T]
  def has(key: String): Boolean
  def keys(): Iterator[String]
  def values(): Iterator[T]
}

object ReadonlyUnderscoreEscapedMap {
  @scala.inline
  def apply[T](
    entries: () => Iterator[js.Tuple2[String, T]],
    forEach: js.Function2[/* value */ T, /* key */ String, Unit] => Unit,
    get: String => js.UndefOr[T],
    has: String => Boolean,
    keys: () => Iterator[String],
    size: Double,
    values: () => Iterator[T]
  ): ReadonlyUnderscoreEscapedMap[T] = {
    val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ReadonlyUnderscoreEscapedMap[T]]
  }
}

