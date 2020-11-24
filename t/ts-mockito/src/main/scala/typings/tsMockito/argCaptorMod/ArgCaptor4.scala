package typings.tsMockito.argCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgCaptor4[T0, T1, T2, T3] extends js.Object {
  
  def beforeLast(): js.Tuple4[T0, T1, T2, T3] = js.native
  
  def byCallIndex(index: Double): js.Tuple4[T0, T1, T2, T3] = js.native
  
  def first(): js.Tuple4[T0, T1, T2, T3] = js.native
  
  def last(): js.Tuple4[T0, T1, T2, T3] = js.native
  
  def second(): js.Tuple4[T0, T1, T2, T3] = js.native
  
  def third(): js.Tuple4[T0, T1, T2, T3] = js.native
}
object ArgCaptor4 {
  
  @scala.inline
  def apply[T0, T1, T2, T3](
    beforeLast: () => js.Tuple4[T0, T1, T2, T3],
    byCallIndex: Double => js.Tuple4[T0, T1, T2, T3],
    first: () => js.Tuple4[T0, T1, T2, T3],
    last: () => js.Tuple4[T0, T1, T2, T3],
    second: () => js.Tuple4[T0, T1, T2, T3],
    third: () => js.Tuple4[T0, T1, T2, T3]
  ): ArgCaptor4[T0, T1, T2, T3] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
    __obj.asInstanceOf[ArgCaptor4[T0, T1, T2, T3]]
  }
  
  @scala.inline
  implicit class ArgCaptor4Ops[Self <: ArgCaptor4[_, _, _, _], T0, T1, T2, T3] (val x: Self with (ArgCaptor4[T0, T1, T2, T3])) extends AnyVal {
    
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
    def setBeforeLast(value: () => js.Tuple4[T0, T1, T2, T3]): Self = this.set("beforeLast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setByCallIndex(value: Double => js.Tuple4[T0, T1, T2, T3]): Self = this.set("byCallIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirst(value: () => js.Tuple4[T0, T1, T2, T3]): Self = this.set("first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLast(value: () => js.Tuple4[T0, T1, T2, T3]): Self = this.set("last", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSecond(value: () => js.Tuple4[T0, T1, T2, T3]): Self = this.set("second", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThird(value: () => js.Tuple4[T0, T1, T2, T3]): Self = this.set("third", js.Any.fromFunction0(value))
  }
}
