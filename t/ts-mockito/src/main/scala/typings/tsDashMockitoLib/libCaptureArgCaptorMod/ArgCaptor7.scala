package typings
package tsDashMockitoLib.libCaptureArgCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] extends js.Object {
  def beforeLast(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  def byCallIndex(index: scala.Double): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  def first(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  def last(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  def second(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  def third(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
}

object ArgCaptor7 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5, T6](
    beforeLast: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6],
    byCallIndex: scala.Double => js.Tuple7[T0, T1, T2, T3, T4, T5, T6],
    first: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6],
    last: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6],
    second: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6],
    third: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  ): ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
  
    __obj.asInstanceOf[ArgCaptor7[T0, T1, T2, T3, T4, T5, T6]]
  }
}

