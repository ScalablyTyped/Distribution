package typings
package typescriptDashOptionalLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cases[T, U] extends js.Object {
  def empty(): U
  def present(value: T): U
}

object Cases {
  @scala.inline
  def apply[T, U](empty: js.Function0[U], present: js.Function1[T, U]): Cases[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("empty")(empty)
    __obj.updateDynamic("present")(present)
    __obj.asInstanceOf[Cases[T, U]]
  }
}

