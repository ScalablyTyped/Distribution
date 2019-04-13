package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ES6 Map interface. */
trait Map[T] extends ReadonlyMap[T] {
  def clear(): scala.Unit
  def delete(key: java.lang.String): scala.Boolean
  def set(key: java.lang.String, value: T): this.type
}

object Map {
  @scala.inline
  def apply[T](
    clear: () => scala.Unit,
    delete: java.lang.String => scala.Boolean,
    entries: () => Iterator[js.Tuple2[java.lang.String, T]],
    forEach: js.Function2[T, /* key */ java.lang.String, scala.Unit] => scala.Unit,
    get: java.lang.String => js.UndefOr[T],
    has: java.lang.String => scala.Boolean,
    keys: () => Iterator[java.lang.String],
    set: (java.lang.String, T) => Map[T],
    size: scala.Double,
    values: () => Iterator[T]
  ): Map[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size, values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[Map[T]]
  }
}

