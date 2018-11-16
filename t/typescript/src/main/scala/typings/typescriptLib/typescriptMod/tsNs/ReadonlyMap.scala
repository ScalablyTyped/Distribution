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

