package typings
package tsmonadLib.libSrcMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Eq[T] extends js.Object

object Eq {
  @scala.inline
  def apply[T](equals: js.Function1[T, scala.Boolean]): Eq[T] = {
    val __obj = js.Dynamic.literal(equals = equals)
  
    __obj.asInstanceOf[Eq[T]]
  }
}

