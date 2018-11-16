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

