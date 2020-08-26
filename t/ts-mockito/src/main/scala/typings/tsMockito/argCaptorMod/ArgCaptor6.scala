package typings.tsMockito.argCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgCaptor6[T0, T1, T2, T3, T4, T5] extends js.Object {
  def beforeLast(): js.Tuple6[T0, T1, T2, T3, T4, T5] = js.native
  def byCallIndex(index: Double): js.Tuple6[T0, T1, T2, T3, T4, T5] = js.native
  def first(): js.Tuple6[T0, T1, T2, T3, T4, T5] = js.native
  def last(): js.Tuple6[T0, T1, T2, T3, T4, T5] = js.native
  def second(): js.Tuple6[T0, T1, T2, T3, T4, T5] = js.native
  def third(): js.Tuple6[T0, T1, T2, T3, T4, T5] = js.native
}

object ArgCaptor6 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5](
    beforeLast: () => js.Tuple6[T0, T1, T2, T3, T4, T5],
    byCallIndex: Double => js.Tuple6[T0, T1, T2, T3, T4, T5],
    first: () => js.Tuple6[T0, T1, T2, T3, T4, T5],
    last: () => js.Tuple6[T0, T1, T2, T3, T4, T5],
    second: () => js.Tuple6[T0, T1, T2, T3, T4, T5],
    third: () => js.Tuple6[T0, T1, T2, T3, T4, T5]
  ): ArgCaptor6[T0, T1, T2, T3, T4, T5] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
    __obj.asInstanceOf[ArgCaptor6[T0, T1, T2, T3, T4, T5]]
  }
  @scala.inline
  implicit class ArgCaptor6Ops[Self <: ArgCaptor6[_, _, _, _, _, _], T0, T1, T2, T3, T4, T5] (val x: Self with (ArgCaptor6[T0, T1, T2, T3, T4, T5])) extends AnyVal {
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
    def setBeforeLast(value: () => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = this.set("beforeLast", js.Any.fromFunction0(value))
    @scala.inline
    def setByCallIndex(value: Double => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = this.set("byCallIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setFirst(value: () => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = this.set("first", js.Any.fromFunction0(value))
    @scala.inline
    def setLast(value: () => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = this.set("last", js.Any.fromFunction0(value))
    @scala.inline
    def setSecond(value: () => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = this.set("second", js.Any.fromFunction0(value))
    @scala.inline
    def setThird(value: () => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = this.set("third", js.Any.fromFunction0(value))
  }
  
}

