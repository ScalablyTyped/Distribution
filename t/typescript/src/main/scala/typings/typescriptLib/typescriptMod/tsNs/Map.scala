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

