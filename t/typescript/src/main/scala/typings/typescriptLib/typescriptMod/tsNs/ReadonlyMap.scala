package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ES6 Map interface, only read methods included. */
trait ReadonlyMap[T] extends js.Object {
  val size: scala.Double
  def entries(): Iterator[js.Tuple2[java.lang.String, T]]
  def forEach(action: js.Function2[/* value */ T, /* key */ java.lang.String, scala.Unit]): scala.Unit
  def get(key: java.lang.String): js.UndefOr[T]
  def has(key: java.lang.String): scala.Boolean
  def keys(): Iterator[java.lang.String]
  def values(): Iterator[T]
}

object ReadonlyMap {
  @scala.inline
  def apply[T](
    entries: js.Function0[Iterator[js.Tuple2[java.lang.String, T]]],
    forEach: js.Function1[js.Function2[/* value */ T, /* key */ java.lang.String, scala.Unit], scala.Unit],
    get: js.Function1[java.lang.String, js.UndefOr[T]],
    has: js.Function1[java.lang.String, scala.Boolean],
    keys: js.Function0[Iterator[java.lang.String]],
    size: scala.Double,
    values: js.Function0[Iterator[T]]
  ): ReadonlyMap[T] = {
    val __obj = js.Dynamic.literal(entries = entries, forEach = forEach, get = get, has = has, keys = keys, size = size, values = values)
  
    __obj.asInstanceOf[ReadonlyMap[T]]
  }
}

