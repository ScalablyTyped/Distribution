package typings.tsmonad.libSrcMaybeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaybePatterns[T, U] extends js.Object {
  def just(t: T): U
  def nothing(): U
}

object MaybePatterns {
  @scala.inline
  def apply[T, U](just: T => U, nothing: () => U): MaybePatterns[T, U] = {
    val __obj = js.Dynamic.literal(just = js.Any.fromFunction1(just), nothing = js.Any.fromFunction0(nothing))
  
    __obj.asInstanceOf[MaybePatterns[T, U]]
  }
}

