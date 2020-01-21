package typings.tstl.inegatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INegatable[Ret] extends js.Object {
  def negate(): Ret
}

object INegatable {
  @scala.inline
  def apply[Ret](negate: () => Ret): INegatable[Ret] = {
    val __obj = js.Dynamic.literal(negate = js.Any.fromFunction0(negate))
  
    __obj.asInstanceOf[INegatable[Ret]]
  }
}

