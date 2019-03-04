package typings
package tstlLib.numericINegatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INegatable[Ret] extends js.Object {
  def negate(): Ret
}

object INegatable {
  @scala.inline
  def apply[Ret](negate: js.Function0[Ret]): INegatable[Ret] = {
    val __obj = js.Dynamic.literal(negate = negate)
  
    __obj.asInstanceOf[INegatable[Ret]]
  }
}

