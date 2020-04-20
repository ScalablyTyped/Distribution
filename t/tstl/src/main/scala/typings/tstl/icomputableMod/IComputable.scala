package typings.tstl.icomputableMod

import typings.tstl.inegatableMod.INegatable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComputable[Param, Ret] extends INegatable[Ret] {
  def divides(`val`: Param): Ret
  def minus(`val`: Param): Ret
  def modules(`val`: Param): Ret
  def multiplies(`val`: Param): Ret
  def plus(`val`: Param): Ret
}

object IComputable {
  @scala.inline
  def apply[Param, Ret](
    divides: Param => Ret,
    minus: Param => Ret,
    modules: Param => Ret,
    multiplies: Param => Ret,
    negate: () => Ret,
    plus: Param => Ret
  ): IComputable[Param, Ret] = {
    val __obj = js.Dynamic.literal(divides = js.Any.fromFunction1(divides), minus = js.Any.fromFunction1(minus), modules = js.Any.fromFunction1(modules), multiplies = js.Any.fromFunction1(multiplies), negate = js.Any.fromFunction0(negate), plus = js.Any.fromFunction1(plus))
    __obj.asInstanceOf[IComputable[Param, Ret]]
  }
}

