package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Watch[T] extends js.Object {
  /** Synchronize with host and get updated program */
  def getProgram(): T
}

object Watch {
  @scala.inline
  def apply[T](getProgram: js.Function0[T]): Watch[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getProgram")(getProgram)
    __obj.asInstanceOf[Watch[T]]
  }
}

