package typings
package typescriptLib.typescriptMod.tsNs

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
    clear: js.Function0[scala.Unit],
    delete: js.Function1[java.lang.String, scala.Boolean],
    entries: js.Function0[Iterator[js.Tuple2[java.lang.String, T]]],
    forEach: js.Function1[js.Function2[T, /* key */ java.lang.String, scala.Unit], scala.Unit],
    get: js.Function1[java.lang.String, js.UndefOr[T]],
    has: js.Function1[java.lang.String, scala.Boolean],
    keys: js.Function0[Iterator[java.lang.String]],
    set: js.Function2[java.lang.String, T, Map[T]],
    size: scala.Double,
    values: js.Function0[Iterator[T]]
  ): Map[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("entries")(entries)
    __obj.updateDynamic("forEach")(forEach)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("keys")(keys)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Map[T]]
  }
}

