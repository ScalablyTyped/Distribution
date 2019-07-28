package typings.tsmonad.libSrcMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Eq[T] extends js.Object

object Eq {
  @scala.inline
  def apply[T](equals: T => Boolean): Eq[T] = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals))
  
    __obj.asInstanceOf[Eq[T]]
  }
}

