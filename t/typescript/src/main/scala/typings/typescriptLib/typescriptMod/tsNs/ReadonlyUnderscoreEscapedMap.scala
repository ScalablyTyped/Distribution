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
    entries: js.Function0[Iterator[js.Tuple2[__String, T]]],
    forEach: js.Function1[js.Function2[/* value */ T, /* key */ __String, scala.Unit], scala.Unit],
    get: js.Function1[__String, js.UndefOr[T]],
    has: js.Function1[__String, scala.Boolean],
    keys: js.Function0[Iterator[__String]],
    size: scala.Double,
    values: js.Function0[Iterator[T]]
  ): ReadonlyUnderscoreEscapedMap[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entries")(entries)
    __obj.updateDynamic("forEach")(forEach)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("keys")(keys)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ReadonlyUnderscoreEscapedMap[T]]
  }
}

