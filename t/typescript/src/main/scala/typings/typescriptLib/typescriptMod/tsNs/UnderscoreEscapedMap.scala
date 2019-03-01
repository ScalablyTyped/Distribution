package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Map where keys are `__String`s. */
trait UnderscoreEscapedMap[T] extends ReadonlyUnderscoreEscapedMap[T] {
  def clear(): scala.Unit
  def delete(key: __String): scala.Boolean
  def set(key: __String, value: T): this.type
}

object UnderscoreEscapedMap {
  @scala.inline
  def apply[T](
    clear: js.Function0[scala.Unit],
    delete: js.Function1[__String, scala.Boolean],
    entries: js.Function0[Iterator[js.Tuple2[__String, T]]],
    forEach: js.Function1[js.Function2[T, /* key */ __String, scala.Unit], scala.Unit],
    get: js.Function1[__String, js.UndefOr[T]],
    has: js.Function1[__String, scala.Boolean],
    keys: js.Function0[Iterator[__String]],
    set: js.Function2[__String, T, UnderscoreEscapedMap[T]],
    size: scala.Double,
    values: js.Function0[Iterator[T]]
  ): UnderscoreEscapedMap[T] = {
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
    __obj.asInstanceOf[UnderscoreEscapedMap[T]]
  }
}

