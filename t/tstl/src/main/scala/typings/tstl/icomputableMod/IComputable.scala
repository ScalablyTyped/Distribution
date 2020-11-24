package typings.tstl.icomputableMod

import typings.tstl.inegatableMod.INegatable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComputable[Param, Ret] extends INegatable[Ret] {
  
  def divides(`val`: Param): Ret = js.native
  
  def minus(`val`: Param): Ret = js.native
  
  def modules(`val`: Param): Ret = js.native
  
  def multiplies(`val`: Param): Ret = js.native
  
  def plus(`val`: Param): Ret = js.native
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
  
  @scala.inline
  implicit class IComputableOps[Self <: IComputable[_, _], Param, Ret] (val x: Self with (IComputable[Param, Ret])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDivides(value: Param => Ret): Self = this.set("divides", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinus(value: Param => Ret): Self = this.set("minus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setModules(value: Param => Ret): Self = this.set("modules", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMultiplies(value: Param => Ret): Self = this.set("multiplies", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlus(value: Param => Ret): Self = this.set("plus", js.Any.fromFunction1(value))
  }
}
