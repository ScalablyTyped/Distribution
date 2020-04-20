package typings.tsmonad.eitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EitherPatterns[L, R, T] extends js.Object {
  def left(l: L): T
  def right(r: R): T
}

object EitherPatterns {
  @scala.inline
  def apply[L, R, T](left: L => T, right: R => T): EitherPatterns[L, R, T] = {
    val __obj = js.Dynamic.literal(left = js.Any.fromFunction1(left), right = js.Any.fromFunction1(right))
    __obj.asInstanceOf[EitherPatterns[L, R, T]]
  }
}

