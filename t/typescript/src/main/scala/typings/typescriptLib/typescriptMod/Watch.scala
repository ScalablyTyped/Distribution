package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Watch[T] extends js.Object {
  /** Synchronize with host and get updated program */
  def getProgram(): T
}

object Watch {
  @scala.inline
  def apply[T](getProgram: () => T): Watch[T] = {
    val __obj = js.Dynamic.literal(getProgram = js.Any.fromFunction0(getProgram))
  
    __obj.asInstanceOf[Watch[T]]
  }
}

