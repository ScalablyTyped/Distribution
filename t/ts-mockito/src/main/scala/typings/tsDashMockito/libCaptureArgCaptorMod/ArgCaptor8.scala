package typings.tsDashMockito.libCaptureArgCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] extends js.Object {
  def beforeLast(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  def byCallIndex(index: Double): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  def first(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  def last(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  def second(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  def third(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
}

object ArgCaptor8 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5, T6, T7](
    beforeLast: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
    byCallIndex: Double => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
    first: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
    last: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
    second: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
    third: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  ): ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
  
    __obj.asInstanceOf[ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7]]
  }
}

