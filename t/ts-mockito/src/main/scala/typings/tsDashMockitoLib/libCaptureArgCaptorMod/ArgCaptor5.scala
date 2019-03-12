package typings
package tsDashMockitoLib.libCaptureArgCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor5[T0, T1, T2, T3, T4] extends js.Object {
  def beforeLast(): js.Tuple5[T0, T1, T2, T3, T4]
  def byCallIndex(index: scala.Double): js.Tuple5[T0, T1, T2, T3, T4]
  def first(): js.Tuple5[T0, T1, T2, T3, T4]
  def last(): js.Tuple5[T0, T1, T2, T3, T4]
  def second(): js.Tuple5[T0, T1, T2, T3, T4]
  def third(): js.Tuple5[T0, T1, T2, T3, T4]
}

object ArgCaptor5 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4](
    beforeLast: () => js.Tuple5[T0, T1, T2, T3, T4],
    byCallIndex: scala.Double => js.Tuple5[T0, T1, T2, T3, T4],
    first: () => js.Tuple5[T0, T1, T2, T3, T4],
    last: () => js.Tuple5[T0, T1, T2, T3, T4],
    second: () => js.Tuple5[T0, T1, T2, T3, T4],
    third: () => js.Tuple5[T0, T1, T2, T3, T4]
  ): ArgCaptor5[T0, T1, T2, T3, T4] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
  
    __obj.asInstanceOf[ArgCaptor5[T0, T1, T2, T3, T4]]
  }
}

