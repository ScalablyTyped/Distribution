package typings
package tsmonadLib.libSrcMaybeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaybePatterns[T, U] extends js.Object {
  def just(t: T): U
  def nothing(): U
}

object MaybePatterns {
  @scala.inline
  def apply[T, U](just: js.Function1[T, U], nothing: js.Function0[U]): MaybePatterns[T, U] = {
    val __obj = js.Dynamic.literal(just = just, nothing = nothing)
  
    __obj.asInstanceOf[MaybePatterns[T, U]]
  }
}

