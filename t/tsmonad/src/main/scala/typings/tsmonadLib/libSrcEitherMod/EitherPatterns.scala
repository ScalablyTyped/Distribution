package typings
package tsmonadLib.libSrcEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EitherPatterns[L, R, T] extends js.Object {
  def left(l: L): T
  def right(r: R): T
}

object EitherPatterns {
  @scala.inline
  def apply[L, R, T](left: js.Function1[L, T], right: js.Function1[R, T]): EitherPatterns[L, R, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[EitherPatterns[L, R, T]]
  }
}

