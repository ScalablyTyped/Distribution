package typings.tsMockito.argCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] extends js.Object {
  def beforeLast(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  def byCallIndex(index: Double): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  def first(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  def last(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  def second(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  def third(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
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
}

