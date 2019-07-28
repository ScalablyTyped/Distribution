package typings.typescriptDashOptional.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cases[T, U] extends js.Object {
  def empty(): U
  def present(value: T): U
}

object Cases {
  @scala.inline
  def apply[T, U](empty: () => U, present: T => U): Cases[T, U] = {
    val __obj = js.Dynamic.literal(empty = js.Any.fromFunction0(empty), present = js.Any.fromFunction1(present))
  
    __obj.asInstanceOf[Cases[T, U]]
  }
}

