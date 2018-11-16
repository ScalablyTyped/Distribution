package typings
package tsmonadLib.libSrcMaybeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MaybePatterns[T, U] extends js.Object {
  def just(t: T): U
  def nothing(): U
}

