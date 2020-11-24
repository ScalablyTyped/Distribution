package typings.tsMockito.argCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgCaptor2[T0, T1] extends js.Object {
  
  def beforeLast(): js.Tuple2[T0, T1] = js.native
  
  def byCallIndex(index: Double): js.Tuple2[T0, T1] = js.native
  
  def first(): js.Tuple2[T0, T1] = js.native
  
  def last(): js.Tuple2[T0, T1] = js.native
  
  def second(): js.Tuple2[T0, T1] = js.native
  
  def third(): js.Tuple2[T0, T1] = js.native
}
object ArgCaptor2 {
  
  @scala.inline
  def apply[T0, T1](
    beforeLast: () => js.Tuple2[T0, T1],
    byCallIndex: Double => js.Tuple2[T0, T1],
    first: () => js.Tuple2[T0, T1],
    last: () => js.Tuple2[T0, T1],
    second: () => js.Tuple2[T0, T1],
    third: () => js.Tuple2[T0, T1]
  ): ArgCaptor2[T0, T1] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
    __obj.asInstanceOf[ArgCaptor2[T0, T1]]
  }
  
  @scala.inline
  implicit class ArgCaptor2Ops[Self <: ArgCaptor2[_, _], T0, T1] (val x: Self with (ArgCaptor2[T0, T1])) extends AnyVal {
    
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
    def setBeforeLast(value: () => js.Tuple2[T0, T1]): Self = this.set("beforeLast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setByCallIndex(value: Double => js.Tuple2[T0, T1]): Self = this.set("byCallIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirst(value: () => js.Tuple2[T0, T1]): Self = this.set("first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLast(value: () => js.Tuple2[T0, T1]): Self = this.set("last", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSecond(value: () => js.Tuple2[T0, T1]): Self = this.set("second", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThird(value: () => js.Tuple2[T0, T1]): Self = this.set("third", js.Any.fromFunction0(value))
  }
}
