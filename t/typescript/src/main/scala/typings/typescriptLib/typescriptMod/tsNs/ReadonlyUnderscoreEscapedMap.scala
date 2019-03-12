package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ReadonlyMap where keys are `__String`s. */
trait ReadonlyUnderscoreEscapedMap[T] extends js.Object {
  val size: scala.Double
  def entries(): Iterator[js.Tuple2[__String, T]]
  def forEach(action: js.Function2[/* value */ T, /* key */ __String, scala.Unit]): scala.Unit
  def get(key: __String): js.UndefOr[T]
  def has(key: __String): scala.Boolean
  def keys(): Iterator[__String]
  def values(): Iterator[T]
}

object ReadonlyUnderscoreEscapedMap {
  @scala.inline
  def apply[T](
    entries: () => Iterator[js.Tuple2[__String, T]],
    forEach: js.Function2[/* value */ T, /* key */ __String, scala.Unit] => scala.Unit,
    get: __String => js.UndefOr[T],
    has: __String => scala.Boolean,
    keys: () => Iterator[__String],
    size: scala.Double,
    values: () => Iterator[T]
  ): ReadonlyUnderscoreEscapedMap[T] = {
    val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size, values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[ReadonlyUnderscoreEscapedMap[T]]
  }
}

