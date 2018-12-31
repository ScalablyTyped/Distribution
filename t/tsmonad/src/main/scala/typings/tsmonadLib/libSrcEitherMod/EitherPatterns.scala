package typings
package tsmonadLib.libSrcEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EitherPatterns[L, R, T] extends js.Object {
  def left(l: L): T
  def right(r: R): T
}

