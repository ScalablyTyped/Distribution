package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ReadonlyMap where keys are `__String`s. */
trait ReadonlyUnderscoreEscapedMap[T] extends js.Object {
  val size: Double
  def entries(): Iterator[js.Tuple2[__String, T]]
  def forEach(action: js.Function2[/* value */ T, /* key */ __String, Unit]): Unit
  def get(key: __String): js.UndefOr[T]
  def has(key: __String): Boolean
  def keys(): Iterator[__String]
  def values(): Iterator[T]
}

object ReadonlyUnderscoreEscapedMap {
  @scala.inline
  def apply[T](
    entries: () => Iterator[js.Tuple2[__String, T]],
    forEach: js.Function2[/* value */ T, /* key */ __String, Unit] => Unit,
    get: __String => js.UndefOr[T],
    has: __String => Boolean,
    keys: () => Iterator[__String],
    size: Double,
    values: () => Iterator[T]
  ): ReadonlyUnderscoreEscapedMap[T] = {
    val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size, values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[ReadonlyUnderscoreEscapedMap[T]]
  }
}

