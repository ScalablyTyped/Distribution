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

