package typings.tsMockito.argCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] extends js.Object {
  def beforeLast(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  def byCallIndex(index: Double): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  def first(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  def last(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  def second(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  def third(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
}

object ArgCaptor10 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    beforeLast: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
    byCallIndex: Double => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
    first: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
    last: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
    second: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
    third: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  ): ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
    __obj.asInstanceOf[ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]]
  }
  @scala.inline
  implicit class ArgCaptor10Ops[Self <: ArgCaptor10[_, _, _, _, _, _, _, _, _, _], T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] (val x: Self with (ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9])) extends AnyVal {
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
    def setBeforeLast(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = this.set("beforeLast", js.Any.fromFunction0(value))
    @scala.inline
    def setByCallIndex(value: Double => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = this.set("byCallIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setFirst(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = this.set("first", js.Any.fromFunction0(value))
    @scala.inline
    def setLast(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = this.set("last", js.Any.fromFunction0(value))
    @scala.inline
    def setSecond(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = this.set("second", js.Any.fromFunction0(value))
    @scala.inline
    def setThird(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = this.set("third", js.Any.fromFunction0(value))
  }
  
}

