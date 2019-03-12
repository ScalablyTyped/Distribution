package typings
package tsDashMockitoLib.libCaptureArgCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor6[T0, T1, T2, T3, T4, T5] extends js.Object {
  def beforeLast(): js.Tuple6[T0, T1, T2, T3, T4, T5]
  def byCallIndex(index: scala.Double): js.Tuple6[T0, T1, T2, T3, T4, T5]
  def first(): js.Tuple6[T0, T1, T2, T3, T4, T5]
  def last(): js.Tuple6[T0, T1, T2, T3, T4, T5]
  def second(): js.Tuple6[T0, T1, T2, T3, T4, T5]
  def third(): js.Tuple6[T0, T1, T2, T3, T4, T5]
}

object ArgCaptor6 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5](
    beforeLast: () => js.Tuple6[T0, T1, T2, T3, T4, T5],
    byCallIndex: scala.Double => js.Tuple6[T0, T1, T2, T3, T4, T5],
    first: () => js.Tuple6[T0, T1, T2, T3, T4, T5],
    last: () => js.Tuple6[T0, T1, T2, T3, T4, T5],
    second: () => js.Tuple6[T0, T1, T2, T3, T4, T5],
    third: () => js.Tuple6[T0, T1, T2, T3, T4, T5]
  ): ArgCaptor6[T0, T1, T2, T3, T4, T5] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
  
    __obj.asInstanceOf[ArgCaptor6[T0, T1, T2, T3, T4, T5]]
  }
}

